//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			do {
			out.print("type in your prompt [R,P,S] :: ");
			
			//read in the player value
			player = keyboard.next();
		
			RockPaperScissors game = new RockPaperScissors();	
			
			game.setPlayers(player);
			System.out.println(game);
			
			System.out.println("Do you want to play again?");
			response = keyboard.next().charAt(0);
	}while (response!='N' && response != 'n');
			
}
}



