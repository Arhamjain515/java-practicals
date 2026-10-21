
class Student {
    
    private int rollno;
    private String name;
    private int age;
    private double cgpa;

    
    public Student() {
        this(2, "Arham Jain", 19, 8.5);
    }

    
    public Student(int rollno, String name, int age, double cgpa) {
        setRollno(rollno);
        setName(name);
        setAge(age);
        setCgpa(cgpa);
    }

    
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }

    
    public void setRollno(int rollno) {
        if (rollno > 0) {
            this.rollno = rollno;
        } else {
            throw new IllegalArgumentException("Roll number must be positive");
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age");
        }
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        } else {
            throw new IllegalArgumentException("CGPA must be between 0 and 10");
        }
    }

  
    public void display() {
        System.out.println("Roll No: " + getRollno());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("CGPA: " + getCgpa());
        System.out.println("--------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        
        Student s2 = new Student(3, "Harsh K Jha", 19, 8.5);
        Student s3 = new Student(6, "Manav Chaudhary", 19, 8.2);
        Student s4 = new Student(7, "Parth Sharma", 19, 9.0);

        System.out.println("STUDENTS PORTFOLIO");
        s1.display();
        s2.display();
        s3.display();
        s4.display();

        
        
        System.out.println( );
    }
}
