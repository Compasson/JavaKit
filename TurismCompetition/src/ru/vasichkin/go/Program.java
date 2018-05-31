package ru.vasichkin.go;

import ru.vasichkin.players.Player;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			Player p = Player.create("Pasha","Vasichkin",31*i);
		}
		Player.showAll();
	}

}
