//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int randomopp = (int) (Math.random() * 3);
		
		if (randomopp == 0)
		{
			compChoice = "R";
		}
		else if (randomopp == 1)
		{
			compChoice = "P";
		}
		else {
			compChoice = "S";
		}
			
	}

	public String determineWinner()
	{
		String winner="";
		
		if (playChoice.equals("R")) {
			if (compChoice.equals("R")) {
				winner = "!Draw Game!";
			}
			if (compChoice.equals("P")) {
				winner = "!Computer wins <<Paper Covers Rock>>!";
			}
			if (compChoice.equals("S")) {
				winner = "!Player wins <<Rock Breaks Scissors>>!";
			}
		}
		
		else if (playChoice.equals("P")) {
			if (compChoice.equals("R")) {
				winner = "!Player wins <<Paper Covers Rock>>!";
			}
			if (compChoice.equals("P")) {
				winner = "!Draw Game!";
			}
			if (compChoice.equals("S")) {
				winner = "!Computer wins <<Scissors Cuts Paper>>!";
			}
		}

		else if (playChoice.equals("S")) {
			if (compChoice.equals("R")) {
				winner = "!Computer wins <<Rock Breaks Scissors>>!";
			}
			if (compChoice.equals("P")) {
				winner = "!Player wins <<Scissors Cuts Paper>>!";
			}
			if (compChoice.equals("S")) {
				winner = "!Draw Game!";
			}
		}
		return winner;
	}

	public String toString()
	{
		String output="player had "+ playChoice + "\n" + "computer had " + compChoice + "\n" + determineWinner();
		return output;
	}
}