interface Payable {
    double calculateSalary();
}

interface Printable {
    void printDetails();
}

abstract class Employee implements Payable, Printable {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void displayRole();

    void displayName() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class FullTimeEmployee extends Employee {
    double basicSalary;
    double bonus;

    FullTimeEmployee(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Full-Time Employee");
    }

    @Override
    public void printDetails() {
        displayName();
        displayRole();
        System.out.println("Salary: " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Part-Time Employee");
    }

    @Override
    public void printDetails() {
        displayName();
        displayRole();
        System.out.println("Salary: " + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Rahul", 101, 30000, 5000);
        Employee e2 = new PartTimeEmployee("Aman", 102, 80, 200);

        System.out.println("Full-Time Employee Details");
        e1.printDetails();

        System.out.println();

        System.out.println("Part-Time Employee Details");
        e2.printDetails();
    }
}
