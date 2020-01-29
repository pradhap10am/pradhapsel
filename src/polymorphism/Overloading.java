package polymorphism;

public class Overloading {
	
	public void movie (String name) {
		System.out.println(name);

	}
	public void movie(int i,String c) {
		System.out.println(i+'\n'+c);
                
	}
	
	public void movie(long phno,float sal) {
		System.out.println(phno+'\n'+sal);
         
	}
	public void movie(float sal,float monsal,float daysal) {
		System.out.println(sal+"\n"+monsal+"\n"+daysal);
	}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.movie("pradap");
		o.movie(24, "vignesh");
		o.movie(1234567890l, 434.54535f);
		o.movie(600.00f,600/12f ,600/365f);
		
	}

}
