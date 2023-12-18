package hRsystem;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public String toString() {
        return "Department [name=" + name + ", employees=" + employees + "]";
    }
}

class HRSystem {
    private List<Department> departments;

    public HRSystem() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void printEmployeeDetails() {
        for (Department department : departments) {
            System.out.println("Department: " + department.getName());
            for (Employee employee : department.getEmployees()) {
                System.out.println("  " + employee.toString());
            }
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Pranali Rawal", 1, 50000);
        Employee employee2 = new Employee("Prachi kori", 2, 60000);

        Department hrDepartment = new Department("HR");
        hrDepartment.addEmployee(employee1);
        hrDepartment.addEmployee(employee2);

        Department engineeringDepartment = new Department("Engineering");
        engineeringDepartment.addEmployee(new Employee("Raj Sharma", 3, 40000));
        engineeringDepartment.addEmployee(new Employee("Sai Kapoor", 4, 75000));

        HRSystem hrSystem = new HRSystem();
        hrSystem.addDepartment(hrDepartment);
        hrSystem.addDepartment(engineeringDepartment);

        // Print employee details
        hrSystem.printEmployeeDetails();
    }
}
