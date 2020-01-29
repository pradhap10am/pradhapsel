package multilevel;

import sample.Inheritance;
import sample.Single;

public class Multi extends Inheritance {

	public void customer() {
          
		System.out.println("sefds");
	}
	
	public void name() {
          
		System.out.println("hdghgh");
	}
	
	public static void main(String[] args) {
		Multi m=new Multi();
		m.customer();
		m.name();
		m.inheritId();
		m.inheritName();
	}
}
