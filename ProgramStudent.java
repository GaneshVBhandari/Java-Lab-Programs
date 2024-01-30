/* 
Student

 Write a Java program to create a class Student with members USN, name, marks(6 subjects). 
 Include methods to accept student details and marks, Also include a method to calculate the percentage and
 display appropriate details. (Array of student object to be created)
 */

 import java.util.Scanner;

 class Student {
     private String usn;
     private String name;
     private int[] marks;
 
     public void acceptDetails(Scanner scanner) {
         System.out.print("Enter USN: ");
         this.usn = scanner.nextLine();
 
         System.out.print("Enter Name: ");
         this.name = scanner.nextLine();
 
         this.marks = new int[6]; 
 
         System.out.println("Enter marks for 6 subjects:");
         for (int i = 0; i < 6; i++) {
             System.out.print("Subject " + (i + 1) + ": ");
             this.marks[i] = scanner.nextInt();
         }
         scanner.nextLine(); 
     }
 
     public void displayDetails() {
         System.out.println("USN: " + this.usn);
         System.out.println("Name: " + this.name);
         System.out.println("Marks for 6 subjects:");
         for (int i = 0; i < 6; i++) {
             System.out.println("Subject " + (i + 1) + ": " + this.marks[i]);
         }
     }
 
     public double calculatePercentage() {
         double totalMarks = 0;
         for (int mark : marks) {
             totalMarks += mark;
         }
         return (totalMarks / 6.0);
     }
 }
 
 public class ProgramStudent {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Enter the number of students: ");
         int numberOfStudents = scanner.nextInt();
         scanner.nextLine();
 
         Student[] students = new Student[numberOfStudents]; 

         for (int i = 0; i < numberOfStudents; i++) {
             System.out.println("Enter details for Student " + (i + 1) + ":");
             students[i] = new Student();
             students[i].acceptDetails(scanner);
         }
 
         System.out.println("\nStudent Details:");
         for (int i = 0; i < numberOfStudents; i++) {
             System.out.println("Student " + (i + 1) + ":");
             students[i].displayDetails();
             System.out.println("Percentage: " + students[i].calculatePercentage() + "%\n");
         }
 
         scanner.close(); 
     }
 }