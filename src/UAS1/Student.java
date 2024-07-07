package UAS1;

public class Student extends Person {
    private String studentID;
    private double[] grades;

    // Constructor
    public Student(String name, int age, String studentID, double[] grades) {
        super(name, age);
        this.studentID = studentID;
        this.grades = grades;
    }

    // Accessor
    public String getStudentID() {
        return studentID;
    }

    // Mutator
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Accessor
    public double[] getGrades() {
        return grades;
    }

    // Mutator
    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    // Polymorphic method to display Student's information

    /**
     *
     */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }
}
