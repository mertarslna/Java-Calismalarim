package ornek17;

public class Ornek17 {

    public static void main(String[] args) {
        // Threading çalışması
        KronometreThread thread1 = new KronometreThread("thread1");
        KronometreThread thread2 = new KronometreThread("thread1");
        KronometreThread thread3 = new KronometreThread("thread1");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}

class KronometreThread implements Runnable {

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Oluşturuluyor: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor: " + threadName);

        try {
            for (int i = 1; i < 10; i++) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            System.out.println("Kesildi: " + threadName);
        }

        System.out.println("Thread işlemi bitti: " + threadName);

    }

    public void start() {
        System.out.println("Thread nesnesi oluşuyor");
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
