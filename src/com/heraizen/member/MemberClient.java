package com.heraizen.member;

import java.util.Scanner;

public class MemberClient {

	public static void main(String[] args) {
		MemeberContainer members = new MemeberContainer();
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println(
					"Enter Choice: 1.Addmember\t 2.deleteMember\t 3.SearchById\t 4.searchByNameAndId\t 5.displaySortingOrder\t 6.Exit");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter Name");
				String name = scan.next();
				System.out.println("Enter city");
				String city = scan.next();
				System.out.println("Enter country");
				String country = scan.next();
				members.addMemeber(MemberIdGenerator.getMemeberId(), name, city, country);
				break;

			case 2:
				System.out.println("Enter Id to delete member");
				String id = scan.next();
				members.deleteMember(id);
				break;
			case 3:
				System.out.println("Enter Id to search member");
				String id1 = scan.next();
				members.searchById(id1);
				break;

			case 4:
				System.out.println("Enter name to search member");
				String name1 = scan.next();
				System.out.println("Enter Id to search member");
				String id2 = scan.next();
				members.searchMember(id2, name1);
				break;
			case 5:
				System.out.println("Enter Asc or Desc");
				String sort = scan.next();
				members.displaySortingOrder(sort);
			case 6:
				System.exit(0);
				System.out.println("closed");
				break;
			}

		} while (true);
	}
}
