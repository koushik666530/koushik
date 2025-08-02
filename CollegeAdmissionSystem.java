import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String department;
    private String email;

    public Student(String name, int age, String department, String email) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.email = email;
    }

    public void displayStudent() {
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);
        System.out.println("Email      : " + email);
        System.out.println("------------------------");
    }
}

public class CollegeAdmissionSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== College Admission System =====");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    public static void addNewStudent() {
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Student newStudent = new Student(name, age, department, email);
        students.add(newStudent);

        System.out.println("Student added successfully!");
    }

    public static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled yet.");
        } else {
            System.out.println("\n--- List of Enrolled Students ---");
            for (Student student : students) {
                student.displayStudent();
            }
        }
    }
}
