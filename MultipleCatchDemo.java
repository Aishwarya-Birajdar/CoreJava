package Basic_Anudip;

 // 2. Multiple Catch Statements and Finally Block

public class MultipleCatchDemo {
	
    public static void main(String[] args) {
    	
    	/* 
-  If an ArithmeticException occurs, it is caught in the first catch block.
-  If an ArrayIndexOutOfBoundsException occurs, it is caught in the second 
  catch block.
 - The finally block executes regardless of whether an exception occurs.
    	 */
    	
        try {
            int[] arr = {10, 20, 30};
            int result = arr[5] / 0; // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
            
        } finally {
            System.out.println("Finally block executed. Resources cleaned up.");
        }
        System.out.println("Program execution continues.");
    }
    
 /*   Output :
    	Error: Array index is out of bounds.
    	Finally block executed. Resources cleaned up.
    	Program execution continues.
  */
    
}


