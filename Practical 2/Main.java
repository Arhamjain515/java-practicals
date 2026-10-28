// Person.java
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Student.java
class Student extends Person {
    private String course;
    private int rollNumber;

    public Student(String name, int age, String course, int rollNumber) {
        super(name, age);
        this.course = course;
        this.rollNumber = rollNumber;
        System.out.println("Student constructor called");
    }

    public void displayStudentDetails() {
        displayDetails();
        System.out.println("Course: " + course);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Faculty.java
class Faculty extends Student {
    private String subject;
    private double salary;

    public Faculty(String name, int age, String course, int rollNumber,
                   String subject, double salary) {
        super(name, age, course, rollNumber);
        this.subject = subject;
        this.salary = salary;
        System.out.println("Faculty constructor called");
    }

    public void displayFacultyDetails() {
        displayStudentDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");

        Student student = new Student("Arham Jain", 19, "CSE AI & DS", 2);
        student.displayStudentDetails();

        System.out.println("\n=== Multilevel Inheritance ===");

        Faculty faculty = new Faculty(
                "Rahul Sharma", 35, "Computer Science",
                101, "Java Programming", 55000
        );

        faculty.displayFacultyDetails();
    }
}
