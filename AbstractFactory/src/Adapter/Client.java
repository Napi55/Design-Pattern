package Adapter;

public class Client {

	public static void main(String[] args) {
		implStandard standard = new implStandard();
		Adapter adapter = new Adapter();
	adapter.operation(15, 2);
	standard.operation(15, 2);
	}

}
