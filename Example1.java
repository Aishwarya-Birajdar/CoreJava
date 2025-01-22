package Basic_Anudip;

	/* :1.Write a Java Program  to pass  this keyword as argument in the 
	    constructor call.
	 */

class Example1
{
	Example1() {
		System.out.println("Default Constructor Called");
	}

	Example1(Example1 obj) {
		System.out.println("Constructor with 'this' keyword called");
	}

	void callConstructor() {
		new Example1(this); // Pass this as an argument
	}

	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.callConstructor();
	}
	
  /*	Output:
	    	Default Constructor Called
	    	Constructor with 'this' keyword called
  */
}
