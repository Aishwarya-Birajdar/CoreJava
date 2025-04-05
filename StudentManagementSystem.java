package smallProjects;

import java.io.*;
import java.util.*;

// Student class to store student details
class Student implements Serializable {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class StudentManagementSystem {
    static List<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static final String FILE_NAME = "students.dat";

    // Save students to file
    static void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("Error saving data!");
        }
    }

    // Load students from file
    static void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No previous data found.");
        }
    }

    // Add a new student
    static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        students.add(new Student(id, name, age));
        saveToFile();
        System.out.println("Student added successfully!\n");
    }

    // Remove a student by ID
    static void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        int id = sc.nextInt();
        students.removeIf(student -> student.id == id);
        saveToFile();
        System.out.println("Student removed if existed.\n");
    }

    // Update student details
    static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        for (Student student : students) {
            if (student.id == id) {
                sc.nextLine(); // Consume newline
                System.out.print("Enter New Name: ");
                student.name = sc.nextLine();
                System.out.print("Enter New Age: ");
                student.age = sc.nextInt();
                saveToFile();
                System.out.println("Student details updated!\n");
                return;
            }
        }
        System.out.println("Student not found!\n");
    }

    // Display all students
    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!\n");
        } else {
            System.out.println("Student List:");
            for (Student student : students) {
                System.out.println(student);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        loadFromFile();
        while (true) {
            System.out.println("--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: removeStudent(); break;
                case 3: updateStudent(); break;
                case 4: displayStudents(); break;
                case 5: saveToFile(); System.out.println("Exiting...\n"); System.exit(0);
                default: System.out.println("Invalid option! Try again.\n");
            }
        }
    }
}
