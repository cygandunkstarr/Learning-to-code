import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		
		Scanner guessingGame = new Scanner(System.in);
		int myGuess = 0;
		do {
			System.out.println("Guess my age!");
			myGuess = guessingGame.nextInt(); 
			
		}
		while(myGuess != 20);
		System.out.println("That's my age!");
	}

}
