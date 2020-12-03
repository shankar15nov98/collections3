package com.heraizen.sports;

import java.util.ArrayList;
import java.util.List;

public class SportsMain {
	public static void main(String[] args) {

		List<Player> football = new ArrayList<Player>();
		football.add(new Player("Shankar", "Shankar@gmail.com", "Bangalore", "karnataka", 23));
		football.add(new Player("Vijay", "Shankar@gmail.com", "Bangalore", "karnataka", 21));
		football.add(new Player("Lokesh", "Shankar@gmail.com", "Bangalore", "karnataka", 27));
		football.add(new Player("arun", "arun@gmail.com", "Kochi", "Kerala", 22));
		List<Player> cricket = new ArrayList<Player>();
		cricket.add(new Player("Shiva", "arun@gmail.com", "Kochi", "Kerala", 25));
		cricket.add(new Player("arun", "arun@gmail.com", "Kochi", "Kerala", 22));
		cricket.add(new Player("Ajith", "arun@gmail.com", "Kochi", "Kerala", 29));
		cricket.add(new Player("Shankar", "Shankar@gmail.com", "karnataka", "Kerala", 23));
		SportsClub.getPlayers(football, cricket);
	}
}
