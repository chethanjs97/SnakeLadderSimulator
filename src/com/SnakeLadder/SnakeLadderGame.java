package com.SnakeLadder;

public class SnakeLadderGame {
	int position=0;
	public static void main(String[] args) {
		System.out.println("Single Player at '0' Position");
		dieRolls();
		
	}
	public static void dieRolls() {
		int die=(int)(Math.floor(Math.random()*10)%6+1);
		System.out.println("Dice = "+die);
	}

}

