package com.heraizen.phone;

import java.util.Scanner;

public class PhonebookClient {

	public static void main(String[] args) {
		PhoneBook phone = new PhoneBook();
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter Choice: 1.Add new phone book entry\t 2.Search name\t 3.Quit");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Phone Number");
				String number1 = scan.next();
				System.out.println("Enter Name");
				String name = scan.next();
				phone.addDetails(number1, name);
				break;

			case 2:
				System.out.println("Enter Phone Number");
				String number2 = scan.next();
				phone.getName(number2);
				break;

			case 3:
				System.exit(0);
				System.out.println("phone book closed");
				break;
			}

		} while (true);

	}
}
