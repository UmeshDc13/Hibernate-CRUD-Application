package com.app;

import java.util.Scanner;
import com.dao.StudentDAO;
import com.entity.Student;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Create Student");
            System.out.println("2. Read Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // CREATE
                    System.out.print("Enter Name: ");
                    sc.nextLine(); // consume leftover newline
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student student = new Student(name, email, marks);
                    dao.saveStudent(student);
                    break;

                case 2:
                    // READ
                    System.out.print("Enter Student ID: ");
                    int readId = sc.nextInt();

                    Student s = dao.getStudent(readId);
                    if (s != null) {
                        System.out.println("ID: " + s.getId());
                        System.out.println("Name: " + s.getName());
                        System.out.println("Email: " + s.getEmail());
                        System.out.println("Marks: " + s.getMarks());
                    } else {
                        System.out.println("Student Not Found ❌");
                    }
                    break;

                case 3:
                    // UPDATE
                    System.out.print("Enter Student ID to Update: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();

                    dao.updateStudent(updateId, newMarks);
                    break;

                case 4:
                    // DELETE
                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    dao.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting... 👋");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice ❌");
            }
        }
    }
}