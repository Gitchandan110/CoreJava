package advanceProgramme;

public class JC03_StringBasic {
	
	public static void main(String[] args) {
		
		String s1=new String("Computer");
		
		System.out.println("s1 is :"+s1);
		
		
		String s2="My Computer";
		
		System.out.println("s2 is :"+s2);
		
		
    	String s3=new String("Laptop");
    	
    	System.out.println("s3 is :"+s3);
    	
        String s4=s3.toUpperCase();
        
	    System.out.println("s4 is :"+s4);	
	    
	    String s5=s3.toLowerCase();
	    
	    System.out.println("s5 is :" +s5);
	    
	    
	    String word="Congratulations";
	    
	    System.out.println("word is:"+ word);
	    
	    int g = word.indexOf("g");
	    
	    System.out.println("Index of g is:"+ g);
	    
	    int a = word.indexOf("a");
	    
	    System.out.println("Index of a is:"+ a);
	  
		
		
	}

}
