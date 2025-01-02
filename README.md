Employee Management System
A simple Java application using JDBC and MySQL to manage employee records. This project demonstrates CRUD (Create, Read, Update, Delete) operations and serves as a foundational learning tool for Java developers integrating database functionality.
Features
Add Employees: Add new employee records to the database.
View Employees: Display all employee records.
Update Employees: Modify existing employee details.
Delete Employees: Remove employee records from the database.
Technologies Used
Programming Language: Java
Database: MySQL
Database Connectivity: JDBC (Java Database Connectivity)
Prerequisites
JDK: Java Development Kit (JDK 8 or higher)
MySQL Server: Installed and running
IDE: IntelliJ IDEA, Eclipse, or any Java-compatible IDE
MySQL Connector/J: Add the MySQL JDBC driver to your project dependencies
Project Structure
bash
EmployeeManagement/
├── src/
│   ├── EmployeeManagement.java  
│   ├── DatabaseConnection.java   
├── sql/
│   ├── EmployeeDB.sql           
├── README.md   
How to Run
Clone the Repository:

git clone https://github.com/yourusername/EmployeeManagement.git
cd EmployeeManagement
Set Up Database Connection:

Open DatabaseConnection.java and configure your MySQL credentials:
private static final String URL = "jdbc:mysql://localhost:3306/EmployeeDB";
private static final String USERNAME = "root";       // Your MySQL username
private static final String PASSWORD = "your_password"; // Your MySQL password
Compile and Run:

Open the project in your IDE.
Compile and run the EmployeeManagement class.
Usage
When you run the application, you’ll see the main menu:
--- Employee Management System ---
1. Add Employee
2. View Employees
3. Update Employee
4. Delete Employee
5. Exit
Example Output
Adding an Employee:

mathematica
Enter employee name: John Doe
Enter employee position: Manager
Enter employee salary: 75000
Employee added successfully!
Viewing Employees:
ID      Name            Position        Salary
------------------------------------------
1       John Doe        Manager         75000.00
2       Jane Smith      Developer       60000.00
License
This project is licensed under the MIT License. You are free to use, modify, and distribute this project.
Contact
For questions or collaboration, feel free to reach out:

Email: karthikumarpasupathi@gmail.com
GitHub:karthikumarpasupathi
