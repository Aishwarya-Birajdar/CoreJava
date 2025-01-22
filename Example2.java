package Basic_Anudip;
   
   //Java Program to invoke current class method using this keyword

class Example2 
{
    void display() {
        System.out.println("Method display() is called");
    }

    void callMethod() {
    	this.display();  // Invoking current class method using this
        System.out.println("Calling display() method using this:");
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.callMethod();
    }
    
   /* Output :
    	Method display() is called
    	Calling display() method using this:
   */
}

