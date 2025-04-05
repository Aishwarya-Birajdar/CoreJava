package Basic_Anudip;

 // 1. Exception Handling for Arithmetic Exception

public class ArithmeticExceptionDemo {
	
    public static void main(String[] args) {
    	
    /*
    The program attempts to divide by zero, which throws ArithmeticException.
    The catch block handles the exception and prints an error message.
    The program continues execution after handling the exception.
    */
    	
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Program continues after exception handling.");
    }
    
 /*   Output :
    	Error: Division by zero is not allowed.
    	Program continues after exception handling.
 */
    
}

