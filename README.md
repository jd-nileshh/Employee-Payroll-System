# Employee-Payroll-System

## 📌 Project Overview

The **Employee Payroll Management System** is a console-based Java application designed to manage employee information and calculate salaries for different types of employees. The project demonstrates core Object-Oriented Programming (OOP) concepts in Java, including abstraction, inheritance, polymorphism, and encapsulation.

The application allows users to add employees, remove employees using their unique IDs, calculate salaries, and display employee details.

## ✨ Features

- **Add Employees:** Add full-time and part-time employees to the payroll system.
- **Remove Employees:** Remove an employee using their unique employee ID.
- **Salary Calculation:** Calculate salaries according to the employee type.
- **Display Employee Details:** View employee names, IDs, and calculated salaries.
- **Object-Oriented Design:** Use abstraction, inheritance, encapsulation, and method overriding.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Collections Framework:** ArrayList
- **Concepts:** Object-Oriented Programming (OOP)

## 📂 Project Structure

```text
EmployeePayrollManagement/
├── Main.java
└── README.md
```

The `Main.java` file contains the following classes:

- **Employee:** An abstract base class that stores employee details and declares the `calculateSalary()` method.
- **FullTimeEmployee:** Represents full-time employees whose salary is based on a fixed monthly amount.
- **PartTimeEmployee:** Represents part-time employees whose salary is calculated using hours worked and hourly rate.
- **PayrollSystem:** Manages the employee list and provides methods to add, remove, and display employees.
- **Main:** The entry point of the application.

## 💰 Salary Calculation

### Full-Time Employee

The salary is based on a fixed monthly salary.

```java
@Override
public double calculateSalary() {
    return monthlySalary;
}
```

### Part-Time Employee

The salary is calculated by multiplying the hours worked by the hourly rate.

```java
@Override
public double calculateSalary() {
    return hourlyRate * hoursWorked;
}
```

**Formula:**

`Salary = Hours Worked × Hourly Rate`

## 🚀 How to Run the Project

### Prerequisites

- Java Development Kit (JDK) installed.
- A code editor such as Visual Studio Code or IntelliJ IDEA, or a terminal.

### Steps

**1. Clone the repository**

```bash
git clone <your-repository-url>
```

**2. Navigate to the project directory**

```bash
cd EmployeePayrollManagement
```

**3. Compile the Java program**

```bash
javac Main.java
```

**4. Run the application**

```bash
java Main
```

## 🖥️ Sample Output

```text
Initial employee details
Employee [name : Nilesh, id : 1, salary : 70000.0]
Employee [name : Chirag, id : 2, salary : 9200.0]
Removing employees
Remaining employees details
Employee [name : Nilesh, id : 1, salary : 70000.0]
```

## 🧠 OOP Concepts Demonstrated

| Concept | Implementation |
|---|---|
| Abstraction | `Employee` is an abstract class with an abstract `calculateSalary()` method. |
| Inheritance | `FullTimeEmployee` and `PartTimeEmployee` extend `Employee`. |
| Encapsulation | Employee fields are private and accessed through getter methods. |
| Polymorphism | Both employee subclasses implement their own salary calculation logic. |
| Method Overriding | Each subclass overrides `calculateSalary()`. |

## 🔮 Future Enhancements

- Add a menu-driven interface for interactive payroll management.
- Implement employee search functionality.
- Add support for updating employee details and salaries.
- Introduce input validation and duplicate employee ID checks.
- Store employee records in a database or file for persistent storage.
- Add tax deductions, bonuses, and other payroll components.

## 🎯 Learning Outcomes

This project provides practical experience in Java programming, object-oriented design, abstract classes, inheritance, method overriding, and the Java Collections Framework. It serves as a beginner-friendly project for strengthening Java fundamentals and understanding how a simple payroll management application works.

## 👨‍💻 Author

**Nilesh Singh**

Java | Object-Oriented Programming | Problem Solving
