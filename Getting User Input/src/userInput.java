import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {
		
		Scanner Questionaire = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String input = Questionaire.nextLine();
		
		System.out.println("Pleasure to meet you " + input + "!");
		
		System.out.println("How old are you?");
		
		int myAge = Questionaire.nextInt();
		
		System.out.println(myAge + " is a good age to enjoy life.");
		
				
	}
}
