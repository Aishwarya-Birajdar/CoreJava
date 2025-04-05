package Basic_Anudip;

/* Q. Write a program using ArrayDeque to add book names and add,delete the
   values from both ends of que. 
   
- ArrayDeque<String> is used to store book names.
- addFirst() inserts a book at the front, while addLast() inserts at the end.
- pollFirst() removes the first book, and pollLast() removes the last book.

   */

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Creating an ArrayDeque to store book names
        ArrayDeque<String> bookQueue = new ArrayDeque<>();

        // Adding books to both ends
        bookQueue.addFirst("Rich Dad Poor Dad");  // Adds at the front
        bookQueue.addLast("To Kill a Mockingbird"); // Adds at the end
        bookQueue.addFirst("Think and Grow Rich"); // Adds at the front
        bookQueue.addLast("The Great Gatsby"); // Adds at the end
        bookQueue.addLast("Power of thinking big."); // Adds at the end

        // Displaying the current queue of books
        System.out.println("Books in Queue: " + bookQueue);

        // Removing books from both ends
        bookQueue.pollFirst(); // Removes from the front
        bookQueue.pollLast();  // Removes from the end

        // Displaying the queue after removal
        System.out.println("Books after removal: " + bookQueue);
    }
    
/* Output :
    Books in Queue: [Think and Grow Rich, Rich Dad Poor Dad, To Kill a Mockingbird, The Great Gatsby, Power of thinking big.]
   	Books after removal: [Rich Dad Poor Dad, To Kill a Mockingbird, The Great Gatsby]
 */
}


