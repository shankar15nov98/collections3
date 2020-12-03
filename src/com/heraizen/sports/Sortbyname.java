package com.heraizen.sports;

import java.util.Comparator;

public class Sortbyname implements Comparator<Player> {

	public int compare(Player a, Player b) {
		return a.name.compareTo(b.name);
	}

}
