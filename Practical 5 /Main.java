import java.util.ArrayList;
import java.util.List;

// Teacher.java
class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void displayTeacher() {
        System.out.println("Teacher: " + name);
    }
}

// Department.java
class Department {
    private String departmentName;
    private List<Teacher> teachers;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);

        for (Teacher teacher : teachers) {
            teacher.displayTeacher();
        }
    }
}

// College.java
class College {
    private String collegeName;
    private List<Department> departments;

    public College(String collegeName) {
        this.collegeName = collegeName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCollege() {
        System.out.println("College: " + collegeName);

        for (Department department : departments) {
            department.displayDepartment();
        }
    }
}

// Course.java
class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void displayCourse() {
        System.out.println("Course: " + courseName);
    }
}

// Student.java
class Student {
    private String studentName;
    private List<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    public void displayStudent() {
        System.out.println("Student: " + studentName);

        for (Course course : courses) {
            course.displayCourse();
        }
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {

        // Composition: College contains Departments
        College college = new College("ABC College");

        // Aggregation: Department contains Teachers
        Department csDepartment = new Department("Computer Science");

        Teacher teacher1 = new Teacher("Rahul Sharma");
        Teacher teacher2 = new Teacher("Priya Verma");

        csDepartment.addTeacher(teacher1);
        csDepartment.addTeacher(teacher2);
        college.addDepartment(csDepartment);

        // Association: Student is associated with Courses
        Student student = new Student("Arham Jain");

        Course course1 = new Course("Java Programming");
        Course course2 = new Course("Data Structures");

        student.enrollCourse(course1);
        student.enrollCourse(course2);

        System.out.println("=== College Details ===");
        college.displayCollege();

        System.out.println("\n=== Student Details ===");
        student.displayStudent();
    }
}
