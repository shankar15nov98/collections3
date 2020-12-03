package com.heraizen.employee;

import java.util.HashSet;
import java.util.Set;



public class EmployeeContainer {

	Set<Employee> hash_Set = new HashSet<Employee>();

	public void addEmployee(Employee emp) {

		hash_Set.add(emp);
		System.out.println("Employee added successfully");

	}

	public void deleteEmployee(int empno) {

		boolean idFound = false;

		for (Employee value : hash_Set) {

			if (value.empno == empno) {
				System.out.println("Employee deleted successfully");
				hash_Set.remove(value);
				idFound = true;

			}
			if (hash_Set.isEmpty()) {

				break;
			}

		}
		if (!idFound) {
			System.out.println("Employee not found with given id");
		}

	}

	public void viewEmployee(int empno) {
		boolean memberFound = false;
		if (hash_Set.isEmpty()) {
			System.out.println(" list is empty");
		} else {

			for (Employee employee : hash_Set) {

				if (employee.empno == empno) {

					memberFound = true;
					System.out.format("%-10d%-15s%-15s\n", employee.empno, employee.ename, employee.job);
					System.out.println("-------------------------------------------");
				}
			}
			if (memberFound == false) {
				System.out.println("“Sorry! Employee is not found");
			}
		}
	}

	public void viewEmployees() {
		if (hash_Set.isEmpty()) {
			System.out.println("No elements are added to the Set");
		} else {
			for (Employee value : hash_Set) {

				System.out.format("%-10d%-15s%-15s\n", value.empno, value.ename, value.job);
				System.out.println("-------------------------------------------");
			}
		}

	}

}
