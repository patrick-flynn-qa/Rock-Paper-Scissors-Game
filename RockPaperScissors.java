package day4;
//Utilities import
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println("Welcome to the Rock Paper Scissors Game ");
		
		//user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("User Please Enter Your Choice");
		System.out.println("O: Rock, 1: Paper, 2: Scissors");
		
		//variable for users choice
		int userChoice = scanner.nextInt();
		
		//debug what we have so far here display user choice
		//System.out.println(userChoice);
		
		//Validate input of usersChoice
		if (userChoice < 0 || userChoice > 2 )
		{
			System.out.println("Invalid Choice. Please run the game again and enter 0, 1 or 2");
			scanner.close();
			return;
		}
		
		//Generate computers random choice between 0 and 2
		Random random = new Random();

		int computerChoice = random.nextInt(3);
		//debugging to make sure computer choice works
		//System.out.println("Computer Choses: " + computerChoice);
		
		
		//Determine winner
		
		//if a tie
		if (userChoice == computerChoice)
		{
			System.out.println("It's a Tie!!");
		}
		
		//If User Wins
		else if ((userChoice ==0 && computerChoice ==2) ||
				(userChoice ==1 &&	computerChoice ==0)  ||
				(userChoice ==2 &&	computerChoice ==1))
		{
			System.out.println("You Win! - Congradulations!");
		}
		else
		{
			System.out.println("Computer Wins!");
		}
	
	
	
	} //closes body

} //closes class
