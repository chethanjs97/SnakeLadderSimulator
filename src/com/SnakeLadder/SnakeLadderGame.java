package com.SnakeLadder;

public class SnakeLadderGame {
	static int position=0;
	static int dieCount=0;
	static int user_position1=0;
	static int user_position2=0;
	public static void main(String[] args) {
		System.out.println("Game With Two Players");
		while(user_position1<100 && user_position2<100) 
		{
			user_position1=play(user_position1);
			System.out.println("number of die roll "+dieCount+" position of player1: "+user_position1);
			user_position2=play(user_position2);;	
			System.out.println("number of die roll "+dieCount+" position of player2: "+user_position2);
		}
		if(user_position1==100)
			System.out.println("player 1 is winner");
		else
			System.out.println("player2 is winner");
	}
	
	public static int dieRolls() {
		int die=(int)(Math.floor(Math.random()*10)%6+1);
		System.out.println("Die = "+die);
		return die;
	}
	public static int play(int pos) {
		position=pos;
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
		dieCount=dieCount+die;
		System.out.println("Number of times the dice was played to win the game is = "+dieCount);
		
	}
		return position;
		
		
	}

}

