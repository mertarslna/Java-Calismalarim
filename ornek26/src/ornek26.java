
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ornek26 extends javax.swing.JFrame {

    DefaultTableModel model;

    public ornek26() {
        initComponents();
        model = (DefaultTableModel) tblActors.getModel();
        try {
            ArrayList<Actor> actors = getActors();
            for (Actor actor : actors) {
                Object[] row = {actor.getActor_id(),
                    actor.getFirst_name(),
                    actor.getLast_name(),
                    actor.getLast_update()};
                model.addRow(row);
            }
        } catch (SQLException ex) {

        }
    }

    public ArrayList<Actor> getActors() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Actor> actors = null;

        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from sakila.actor");
            actors = new ArrayList<Actor>();
            while (resultSet.next()) {
                actors.add(new Actor(resultSet.getString("actor_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("last_update")));
            }
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }
        return actors;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblActors = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblActors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "actor_id", "first_name", "last_name", "last_update"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblActors);
        if (tblActors.getColumnModel().getColumnCount() > 0) {
            tblActors.getColumnModel().getColumn(1).setResizable(false);
            tblActors.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ornek26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ornek26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ornek26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ornek26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ornek26().setVisible(true);
            }
        });
    }

    class DbHelper {

        private String user = "root";
        private String password = "12345";
        private String url = "jdbc:mysql://localhost:3306/mysql";

        public Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, user, password);
        }

        public void showErrorMessage(SQLException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error code: " + e.getErrorCode());

        }

    }

    class Actor {

        private String actor_id;
        private String first_name;
        private String last_name;
        private String last_update;

        public Actor(String actor_id, String first_name, String last_name, String last_update) {
            this.actor_id = actor_id;
            this.first_name = first_name;
            this.last_name = last_name;
            this.last_update = last_update;
        }

        public String getActor_id() {
            return actor_id;
        }

        public void setActor_id(String actor_id) {
            this.actor_id = actor_id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getLast_update() {
            return last_update;
        }

        public void setLast_update(String last_update) {
            this.last_update = last_update;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblActors;
    // End of variables declaration//GEN-END:variables
}
