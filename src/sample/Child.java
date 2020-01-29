package sample;

public class Child implements Parent1,Parent2 {

	@Override
	public void address() {
		// TODO Auto-generated method stub
		System.out.println("vhvghv");
	}

	@Override
	public void place() {
		// TODO Auto-generated method stub
		System.out.println("hghgh");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("hggfjh");
	}

	@Override
	public void dpt() {
		// TODO Auto-generated method stub
		System.out.println("kjgjhg");
	}

	public static void main(String[] args) {
		Child c= new Child();
		c.address();
		c.dpt();
		c.name();
		c.place();
		
		
		
		
	}
	}

