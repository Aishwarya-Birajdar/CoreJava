package Basic_Anudip;

/* Write a Java program to sort in ascending order an array of given 
   integers[45,35,56,67,78,89,78,12,20] 
 */

import java.util.Arrays;

public class SortArrayAscending {
	
    public static void main(String[] args) {
    	
        // Initializing the array of integers
        int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};
        
        // Sorting the array in ascending order using Arrays.sort()
        Arrays.sort(numbers);
        
        // Printing the sorted array
        System.out.println("Array sorted in ascending order:");
        
        // Loop through the array and print each element
        for (int num : numbers) {
            System.out.print(num + " "); // Printing each element followed by a space
        }
        
        
     /*   Sample Output:
        	Array sorted in ascending order:
        	12 20 35 45 56 67 78 78 89 
      */
        
    }
}



