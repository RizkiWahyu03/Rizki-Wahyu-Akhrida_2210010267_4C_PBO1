package UAS1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // IO sederhana
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            // Membuat objek Person
            Person person = new Person(name, age);
            person.displayInfo();

            // IO sederhana
            System.out.print("Enter student ID: ");
            String studentID = scanner.next();

            System.out.print("Enter number of grades: ");
            int numGrades = scanner.nextInt();
            double[] grades = new double[numGrades];

            // Mengisi array dengan perulangan
            for (int i = 0; i < numGrades; i++) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                grades[i] = scanner.nextDouble();
            }

            // Membuat objek Student
            Student student = new Student(name, age, studentID, grades);
            student.displayInfo();

        } catch (Exception e) {
            // Error handling
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
