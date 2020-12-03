package com.heraizen.sports;

import java.util.Collections;
import java.util.List;

public class SportsClub {

	public static List<String> getPlayers(List<Player> football, List<Player> cricket) {

		Collections.sort(football, new Sortbyname());
		Collections.sort(cricket, new Sortbyname());
		System.out.println("football players:");
		for (Player ele : football) {
			System.out.println(ele.name);
		}
		System.out.println();
		System.out.println("cricket players:");
		for (Player ele : cricket) {
			System.out.println(ele.name);
		}
		System.out.println();
		System.out.println("players present in both team:");
		for (Player soccer : football) {
			for (Player bat : cricket) {
				if (soccer.name.equals(bat.name)) {
					System.out.println(soccer.name);
				}

			}
		}
		return null;

	}

}
