package com.bl.tictoctoe.game;
public class Tic_Toc_Toe {
	static char[] board =new char[10];
	public static void main(String[] args) {
		System.out.println("welcome to Tic Tac Toi GAME") ;
		board() ;                            //calling the method board in main method	
	}
	public static void board() 
	{
		// giving each array index value as empty initially
		for(int i=1;i < 10 ; i++) {
			board[i] =' ';
		}

	}

}
