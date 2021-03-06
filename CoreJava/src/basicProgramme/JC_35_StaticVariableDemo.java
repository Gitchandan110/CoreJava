package basicProgramme;

public class JC_35_StaticVariableDemo {
	
	//Create one Class level variable with Static Keyword
	static int i=10;
	
	//create one class level variable without static keyword
	
    int j=20;

	public static void main(String[] args) {
		
		/*we can access static variable i without creating an object of parent class 
		"StaticVariableDeom */
		
		System.out.println(i);
		System.out.println(JC_35_StaticVariableDemo.i);
		
		/*we can not access Non static variable j without creating an object of parent class 
		"StaticVariableDeom. It will show error as given below */
		
	  //	System.out.println(j);
		
		/*To access Non static variable j we need to create an object of parent class 
		"StaticVariableDeom", as given below */
		
		JC_35_StaticVariableDemo svd=new JC_35_StaticVariableDemo();
	    System.out.println(svd.j);
		

	}

}
