package employee_Management;

import java.sql.*;
import java.util.Scanner;

public class main {
public static void main(String[] args)  throws Exception {
	Scanner sc = new Scanner(System.in);
	int choice;
	do {
		System.out.println("\n---Employee Management System---");
		System.out.println("1.Add Employee");
		System.out.println("2.View Employee");
		System.out.println("3.Update Employee");
		System.out.println("4.Delete Employee");
		System.out.println("5.Exit");
		System.out.println("Enter Your Choice");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			addEmployee();
			break;
		case 2:
			viewEmployee();
			break;
		case 3:
			updateEmployee();
			break;
		case 4 :
			deleteEmployee();
			break;
		case 5:
			System.out.println("Exiting.....Thank You");
			break;
		default:
			System.out.println("Invalid choice ! Please try Again");
		}
		}
	while (choice!=5);
	sc.close();
	
}
public  static void  addEmployee() throws Exception  {
	String url = "jdbc:mysql://localhost:3306/employeedb";
	String userName = "root";
	String password="7094";
	Scanner add = new Scanner(System.in);
	System.out.println("Enter employee name");
	String name = add.next();
	System.out.println("Enter employee positon");
	String positon = add.next();
	System.out.println("Enter employee salary ");
	double salary = add.nextDouble();
	String query ="insert into employee(name, positon, salary)values(?,?,?)";
	Connection con = DriverManager.getConnection(url,userName,password);
	PreparedStatement pst = con.prepareStatement(query);
	pst.setString(1,name);
	pst.setString(2, positon );
	pst.setDouble(3, salary);
	int rows = pst.executeUpdate();
	if(rows>0) {
		System.out.println("Employee added Succesfully");
	}
	
	con.close();
} 

public static void viewEmployee() throws Exception {
	String url = "jdbc:mysql://localhost:3306/employeedb";
	String userName = "root";
	String password="7094";
	
	String query = "select * from employee";
	Connection con = DriverManager.getConnection(url,userName,password);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
		System.out.println("\nID\tName\t\tPositon\tSalary");
		System.out.println("--------------------------------------");
		while (rs.next()) {
			System.out.printf("%d\t%s\t\t%s\t%.2f\n",rs.getInt("id"),rs.getString("name"),rs.getString("positon"),rs.getDouble("salary"));
	}
		con.close();
	
}

public static void updateEmployee() throws Exception {
	String url = "jdbc:mysql://localhost:3306/employeedb";
	String userName = "root";
	String password="7094";
	Scanner view= new Scanner(System.in);
	System.out.println("Enter employee id to update :");
	int id =view.nextInt();
	System.out.println("Enter new name:");
	String name = view.next();
	System.out.println("Enter new position:");
	String position = view.next();
	System.out.println("Enter new salary:");
	double salary = view.nextDouble();
	
	String query = "update employee set name =? , positon =?, salary=? where id =?";
	Connection con = DriverManager.getConnection(url,userName,password);
	PreparedStatement pst = con.prepareStatement(query);
	pst.setString(1,name);
	pst.setString(2,position);
	pst.setDouble(3,salary);
	pst.setInt(4, id);
	int row = pst.executeUpdate();
	if(row>0) {
		System.out.println("Employee updated suceesfully");
	}
	else {
		System.out.println("Employee with id "+id+"not found");
	}
	con.close();
	
	
}
public static void deleteEmployee() throws Exception {
	String url = "jdbc:mysql://localhost:3306/employeedb";
	String userName = "root";
	String password="7094";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter employee ID to delete:");
	int id = sc.nextInt();
	String query = "delete from employee where id = ?";
	Connection con = DriverManager.getConnection(url,userName,password);
	PreparedStatement pst = con.prepareStatement(query);
	pst.setInt(1, id);
	int row = pst.executeUpdate();
	if(row>0) {
		System.out.println("Employee deleted sucessfully");
	}
	else {
		System.out.println("Employee with ID " + id + " not found.");
	}
	con.close();
	
}



}
