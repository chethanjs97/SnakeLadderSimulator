package com.SnakeLadder;

public class SnakeLadderGame {
	static int position=0;
	public static void main(String[] args) {
		System.out.println("Single Player at '0' Position");
		checkOption();
		
	}
	public static int dieRolls() {
		int die=(int)(Math.floor(Math.random()*10)%6+1);
		System.out.println("Die = "+die);
		return die;
	}
	public static void checkOption() {
		while (position<100) {
		int option=(int)(Math.floor(Math.random()*10)%3+1);
		System.out.println("Option is "+option);
		int die=dieRolls();
		switch (option) {
		case 1 :
			System.out.println("No Play The Player Stays in Same Position  "+position);
			break;
		case 2 :
			position=position+die;
			if(position>100) {
				position=position-die;
			}
			System.out.println("Ladder the player moves ahead by position "+position);
			break;
		case 3 :
			position=position-die;
			System.out.println("Snake the player moves behind by position "+position);
			if(position<0) {
				position=0;
			}
			break;
			
		}
	}
		
	}

}

