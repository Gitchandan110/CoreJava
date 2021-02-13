package advanceProgramme;

public class JC02_StringArray {

	public void nameString() {

		String[] usercredential = { "chandan", "kumar", "Gupta" };
		int i = 0;

		while (i < usercredential.length) {

			System.out.println(usercredential[i]);
			i++;
		}

	}
	
	
	public void nameChar() {
		
		String name="chandan";
		
		System.out.println(name.indexOf("c"));
		
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {

		JC02_StringArray ns = new JC02_StringArray();
		ns.nameString();
		ns.nameChar();
	}
}