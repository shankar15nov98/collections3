package com.heraizen.employee;

import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {
		EmployeeContainer employee = new EmployeeContainer();

		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter Choice: 1.Add Employee\t 2.Delete Employee\t 3.View Employee\t 4.View Employees");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Employee Id");
				int number = scan.nextInt();
				System.out.println("Enter Employee Name");
				String name = scan.next();
				System.out.println("Enter Employee Job");
				String job = scan.next();
				employee.addEmployee(new Employee(number, name, job));
				break;

			case 2:
				System.out.println("Enter Employee Id to delete");
				int number1 = scan.nextInt();
				employee.deleteEmployee(number1);
				break;

			case 3:

				System.out.println("Enter Employee Id to view");
				int number2 = scan.nextInt();
				employee.viewEmployee(number2);
				break;

			case 4:

				employee.viewEmployees();
				break;
			}

		} while (true);

	}

}
