package Basic_Anudip;

/*  Write a Java program to sort in descending order an array of given
    string[A,X,D,Z,Y,C,W,B]
 */

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {
	
    public static void main(String[] args) {
    	
        // Initializing the array of strings
        String[] letters = {"A", "X", "D", "Z", "Y", "C", "W", "B"};
        
        // Sorting the array in descending order using Arrays.sort() and Collections.reverseOrder()
        Arrays.sort(letters, Collections.reverseOrder());
        
        // Printing the sorted array in descending order
        System.out.println("Array sorted in descending order:");
        
        // Loop through the array and print each element
        for (String letter : letters) {
            System.out.print(letter + " "); // Printing each element followed by a space
        }
        
       /*  Sample Output :
               Array sorted in descending order:
               Z Y X W D C B A 
       */ 
        
    }
}
