package com.bl.tictoctoe.game;
import java.util.Scanner;
public class Tic_Toc_Toe {
	static char[] board =new char[10];
	static char Player_letter;
	static char Computer_letter;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("welcome to Tic Tac Toi GAME") ;
		board() ; //calling the method board in main method	
		chooseLetter();
		showBoard();
		play();
	}
	public static void board() 
	{		                                    // creating board to play  
		for(int i=1;i < 10 ; i++) {
			board[i] =' ';
		}

	}
	public static void chooseLetter() {
		System.out.println("please  select X  or O ");
		char letter = sc.next().charAt(0);       // allowing user to choose character using console
		if(letter=='X') {
			Player_letter=letter;
			Computer_letter='O';
		}
		else if(letter == 'O') {
			Player_letter = letter;
			Computer_letter = 'X';
		}
		else {                                  // if user is entering wrong choice , default letter will be allocated
			System.out.println("wrong selection ! Now computer will assign letters.");
			Computer_letter = 'O';
			Player_letter ='X';
		}
		System.out.println("player letter is "+Player_letter);
		System.out.println("computer letter is "+Computer_letter);
	}

	public static void showBoard() {                                                    // showing board status 
		System.out.println(" "+board[1]+" |"+" "+board[2]+" |"+" "+board[3]);
		System.out.println("-----------");
		System.out.println(" "+board[4]+" |"+" "+board[5]+" |"+" "+board[6]);
		System.out.println("-----------");
		System.out.println(" "+board[7]+" |"+" "+board[8]+" |"+" "+board[9]);

	}
	public static int is_Empty() {
		int count = 0;
		for(int i=1 ; i <= 9 ; i++ ) {
			if(board[i] == ' ' ) {
				count ++;
			}
		}
		return count ;
		}
	public static void play() { // playing the next move 
		boolean check = true;
		while(check) {
		int count = is_Empty();
		if(count > 0 ) {
		System.out.println("Enter the place from 1 to 9 for your next move ");
		int place = sc.nextInt();
		if(place < 10 && place > 0 ) {
			if(board[place] == ' ') {
				board[place] = Player_letter;
			}
			else
				System.out.println(" this place is already occupied ! please select another ");
		}
		else
			System.out.println("wrong place entered ! please select nos between 1 to 9 only ");
	}
		else {
			System.out.println("all 9 places are occupied !");
		check = false;}
		showBoard();
		}
}
}
