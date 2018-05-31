package ru.vasichkin.players;

import java.util.ArrayList;
import java.util.Date;

import ru.vasichkin.players.Player;

public class Player {

	public static ArrayList<Player> players;

	static {
		players=new ArrayList<>();
	}
		
	private String name;
	private String surname;
	private int old;
	public int id=0;
	
	
	public int score;
	public String startTime; // в минутах
	public String endTime;
	
	public Player(String name, String surname, int old) {
		this.name=name;
		this.surname=surname;
		this.old=old;
		this.id=id++;
	}
	
	public static Player create(String name, String surname, int old) {
		Player p=new Player(name,surname,old);
		players.add(p);
		return p;
	}
	
	public static void showAll() {
		for(Player p: players) {
			p.show();
		}
	}
	
	public  void show() {
		System.out.printf("id= %-10d %-10s %-10s %-10s %-10s/n",this.id,this.name,this.surname,this.startTime,this.endTime);
	}
	
	
	
	
}
