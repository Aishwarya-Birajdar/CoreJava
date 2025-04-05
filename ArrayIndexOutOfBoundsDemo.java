package Basic_Anudip;

 // 3. Exception Handling for Array Index Out of Bounds

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
    	
    /* 
 - The program tries to access an invalid index in the array.
 - The catch block handles ArrayIndexOutOfBoundsException and prints an error message.
 - The program execution continues normally after exception handling.
    	 */
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Accessing index 10: " + numbers[10]); // This will throw exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
        System.out.println("Program execution continues.");
    }
    
/*    Output :
    	Error: Array index is out of bounds.
    	Program execution continues.
 */
    
}
