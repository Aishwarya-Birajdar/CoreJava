package Basic_Anudip;

 /* Q. Write a program using Vector to store the list of students details 
       and print the details. 

 - The Student class represents a student with name, rollNo, and course 
    attributes.
 - A Vector<Student> is used to store multiple student objects.
 - add() method is used to insert students into the Vector.
 - A loop iterates through the Vector and calls display() to print each 
    student's details.
 */

import java.util.Vector;

// Class to represent a Student
class Students {
    String name;
    int rollNo;
    String course;

    // Constructor to initialize student details
    public Students(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Course: " + course);
    }
}

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector to store student objects
        Vector<Students> studentList = new Vector<>();

        // Adding student objects to the vector
        studentList.add(new Students("Jay", 101, "Computer Science"));
        studentList.add(new Students("Esha", 102, "Mechanical"));
        studentList.add(new Students("Raani", 103, "Civil"));

        // Displaying student details
        System.out.println("Student Details:");
        for (Students student : studentList) {
            student.display();  // Calling display method of Student class
        }
    }
    
 /*   Output :
    	Student Details:
    		Roll No: 101, Name: Jay, Course: Computer Science
    		Roll No: 102, Name: Esha, Course: Mechanical
    		Roll No: 103, Name: Raani, Course: Civil
 */
}
