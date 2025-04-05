package Basic_Anudip;

 /* Q. Write a program using TreeSet insert Integer values and print them.

 - TreeSet<Integer> is used to store unique integers.
 - add() method inserts elements into the TreeSet.
 - TreeSet automatically sorts elements in ascending order.
 - A loop is used to iterate through and print each element.
*/

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet to store unique integers in sorted order
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding integer values to the TreeSet
        numbers.add(50);
        numbers.add(20);
        numbers.add(70);
        numbers.add(10);
        numbers.add(40);

        // TreeSet automatically sorts elements in ascending order
        System.out.println("Sorted Integer Values:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
    
 /*   Output :
    	Sorted Integer Values:
    		10
    		20
    		40
    		50
    		70
    		
  */
}


