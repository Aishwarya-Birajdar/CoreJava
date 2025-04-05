package Basic;

public class mainMethod {

	   // Constructor Overloading
	 mainMethod() {
			System.out.println("Default Constructor");	
	  }
	 
	 mainMethod(int a) {
		 System.out.println("a "+a);
	 }
	 
	 // Method Overloading
	 void display() {
		 System.out.println("Display");
	 }
	 
	 void displat(int a) {
		 System.out.println("a :"+a);
	 }
	 
	 // this Keyword
	 int x = 45;
	 void show() {
		 int x = 42; // Local Variable
		 System.out.println("Local Variable X : "+x); // value of local variable printed
		 System.out.println("Instance Variable : "+this.x);
	 }
	 
	public static void main(String[] args) {
		
		/* public - Access Modifier. AnyWhere Access.
		 * static - does not need to creating object. Direct Access without object
		 * void - Return type
		 * main - method name
		 * String[] args - Command line arguments
		 */
		
		System.out.println("Lets Start");
		// Data types - Primitive 8
		byte h = 3;
		short g = 34;
		int a = 456;
		float b = 2.3f;
		double c = 344.5;
		char d = 'A';
		long e = 345566;
		boolean f = false;
		
		System.out.println(h);
		System.out.println(g);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		// Operators
		// 1. Arithmetic 
		System.out.println("Arithmetic Operator");
		System.out.println("Addition : "+(a+g));
		System.out.println("Substractions : "+(a-g));
		System.out.println("Multiplication : "+(a*g));
		System.out.println("Division : "+(a/g));
		System.out.println("Modulos : "+(a%g));
		
		// 2. Assignment
		System.out.println("Assignment");
		a=34;
		System.out.println("a : "+a);
		
		// 3. Relational 
		System.out.println("Relational Operator");
		System.out.println("> "+(a>b));
		System.out.println("< "+(a<b));
		
		// 4. Logical 
		System.out.println("Logical Operator");
		System.out.println("AND : "+(a>b && b<c));
		System.out.println("OR : "+(a>b || b>c));
		System.out.println("Not : "+(a>b));
	
		// Object Creation
		mainMethod r = new mainMethod();
		mainMethod r1 = new mainMethod(344);
		
		// method calling
		r.display();
		r.displat(78);
		
		r.show();
		
	}

}
