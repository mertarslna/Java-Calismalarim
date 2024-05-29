package springOrnek1;

public class Main {

	public static void main(String[] args) {
		CustomerManager manager = new CustomerManager(new CustomerDal());
		manager.add();
	}

}
