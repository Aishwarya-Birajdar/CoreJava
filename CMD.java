package BasicProgram;

public class CMD {

	public static void main(String[] args) {
		
		String name = "Java";
		System.out.println(args);
		
		/* Object created using
		   1. new keyword
		   2. newInstance() method
		   3. clone() method
		   4. deserialization
		   5. factory method
		*/
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + b;
		System.out.println("C : "+c);
	}

}
