package com.heraizen.member;

import java.util.List;

public class Member {
	String mid;
	String name;
	String city;
	String country;

	public Member(String mid, String name, String city, String country) {
		this.mid = mid;
		this.name = name;
		this.city = city;
		this.country = country;
	}

	public static void display(List<Member> memberList) {
		for (Member members : memberList) {

			System.out.println("Id:" + members.mid + " " + "Name:" + members.name + " " + "City:" + members.city + " "
					+ "Country:" + members.country);
		}

	}

}
