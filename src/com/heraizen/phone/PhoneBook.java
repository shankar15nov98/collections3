package com.heraizen.phone;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PhoneBook {

	Map<String, String> map = new HashMap<>();

	public void addDetails(String phno, String name) {
		map.put(phno, name);

	}

	public String getName(String phno) {
		boolean numberFound = false;
		if (!map.isEmpty()) {

			for (Entry<String, String> ele : map.entrySet()) {
				if (ele.getKey().contains(phno)) {
					System.out.println(ele.getValue());
					numberFound = true;
				}

			}

			if (!numberFound) {
				System.out.println("Sorry! No person found with the given number");
			}

		} else {
			System.out.println("You have no contact in your mobile, please add contact");
		}

		return phno;

	}
}
