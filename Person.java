class Person {
    protected String name;
    protected int age;
    protected char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person {
    private int studentId;
    private String course;
    private char grade;

    public Student(String name, int age, char gender, int studentId, String course, char grade) {
        super(name, age, gender);
        this.studentId = studentId;
        this.course = course;
        this.grade = grade;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John", 25, 'M');

        // Display details of the Person
        System.out.println("Person Details:");
        person.displayDetails();
        System.out.println();

        // Create a Student object
        Student student = new Student("Alice", 20, 'F', 1234, "Computer Science", 'A');

        // Display details of the Student
        System.out.println("Student Details:");
        student.displayDetails();
    }
}






