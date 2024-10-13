import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int age;
    private char grade;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Grade (A/B/C): ");
        grade = sc.next().charAt(0);
    }

    void printDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Student student = new Student();
        student.acceptDetails();
        student.printDetails();
    }
}

