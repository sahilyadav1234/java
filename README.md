# Java Programming Exercises

This repository contains solutions for the following Java programming exercises:

1. **Sum of Integers using Autoboxing & Unboxing**
2. **Serialization and Deserialization of a Student Object**
3. **Menu-Based Employee Management System**

---

## **1. Sum of Integers using Autoboxing & Unboxing**
### **Description**
This program demonstrates autoboxing and unboxing by summing a list of integers.  
It converts string inputs into `Integer` objects and performs summation using Java Streams.

### **Technologies Used**
- Java
- List and Streams API
- Wrapper Classes (Autoboxing & Unboxing)

### **How to Run**
1. Compile:  
   ```sh
   javac SumWithAutoboxing.java
   ```
2. Run:  
   ```sh
   java SumWithAutoboxing
   ```

### **Example Output**
```
Sum of integers: 150
```

---

## **2. Serialization and Deserialization of a Student Object**
### **Description**
This program serializes a `Student` object (ID, Name, GPA) and stores it in a file.  
It then deserializes the object and displays the student details.

### **Technologies Used**
- Java
- Object Serialization (`ObjectOutputStream`, `ObjectInputStream`)
- Exception Handling (`IOException`, `FileNotFoundException`, `ClassNotFoundException`)

### **How to Run**
1. Compile:  
   ```sh
   javac StudentSerialization.java
   ```
2. Run:  
   ```sh
   java StudentSerialization
   ```
3. Enter Student Details when prompted.

### **Example Output**
```
Enter Student ID: 12274
Enter Student Name: Vikash
Enter Student GPA: 7.8
Student object serialized successfully.

Deserialized Student Details:
Student ID: 12274
Name: Vikash
GPA: 7.8
```

---

## **3. Menu-Based Employee Management System**
### **Description**
A menu-driven application that allows users to:
- Add an employee (stores details in a file)
- Display all employees (reads from file)
- Exit the application

### **Technologies Used**
- Java
- File Handling (`FileWriter`, `BufferedReader`)
- Object-Oriented Programming
- Exception Handling

### **How to Run**
1. Compile:  
   ```sh
   javac EmployeeManagementSystem.java
   ```
2. Run:  
   ```sh
   java EmployeeManagementSystem
   ```
3. Follow on-screen menu instructions.

### **Example Output**
```
1. Add Employee
2. Display All Employees
3. Exit
Enter your choice: 1
Enter Employee ID: 12274
Enter Employee Name: Vikash
Enter Employee Designation: Senior Developer
Enter Employee Salary: 350000
Employee added successfully!

1. Add Employee
2. Display All Employees
3. Exit
Enter your choice: 2
ID: 12274
Name: Vikash
Designation: Senior Developer
Salary: 50000.0
----------------------

1. Add Employee
2. Display All Employees
3. Exit
Enter your choice: 3
Exiting application...
```

---

## **License**
This project is open-source and can be modified and distributed freely.

## **Author**
Vikash Yadav(22BCS12274)

---
