import java.util.*;

abstract class Employee {

  private String name;

  private int id;

  public Employee(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public int getID() {
    return id;
  }

  public abstract double calculateSalary();

  @Override
  public String toString() {
    return "Employee [name : " + name + ", id : " + id + ", salary : " + calculateSalary() + "]";
  }
}

class FullTimeEmployee extends Employee {
  private double monthlySalary;

  public FullTimeEmployee(String name, int id, double monthlySalary) {
    super(name, id);
    this.monthlySalary = monthlySalary;
  }

  @Override
  public double calculateSalary() {
    return monthlySalary;
  }
}

class PartTimeEmployee extends Employee {
  private int hoursWorked;
  private double hourlyRate;

  public PartTimeEmployee(String name, int id, int hoursWorked, int hourlyRate) {
    super(name, id);
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
  }

  @Override
  public double calculateSalary() {
    return hourlyRate * hoursWorked;
  }

}

class PayrollSystem {

  private ArrayList<Employee> employeeList;

  public PayrollSystem() {
    employeeList = new ArrayList<>();
  }

  public void addEmployee(Employee employee) {
    employeeList.add(employee);
  }

  public void removeEmployee(int id) {
    Employee employeeToRemove = null;

    for (Employee employee : employeeList) {
      if (employee.getID() == id) {
        employeeToRemove = employee;
        break;
      }
    }
    if (employeeToRemove != null) {
      employeeList.remove(employeeToRemove);
    } else {
      System.out.println("No such Employee found !!");
    }
  }

  public void displayEmployee() {
    for (Employee employee : employeeList) {
      System.out.println(employee);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    PayrollSystem payroll = new PayrollSystem();
    FullTimeEmployee emp1 = new FullTimeEmployee("Nilesh", 1, 70000);
    PartTimeEmployee emp2 = new PartTimeEmployee("Chirag", 2, 40, 230);

    payroll.addEmployee(emp1);
    payroll.addEmployee(emp2);

    System.out.println("Initial employee details ");
    payroll.displayEmployee();

    System.out.println("Removing employees");
    payroll.removeEmployee(2);

    System.out.println("Remaining employees details");
    payroll.displayEmployee();
  }
}