import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Who's signature line do you want to hear?");
		String text = input.nextLine();
		
		switch(text) {
		case "Darth Vader" :
			System.out.println("I am your father.");
			break;
			
		case "Mufasa" :
			System.out.println("Remember who you are.");
			break;
		
		case "Zeus" :
			System.out.println("Release the Kraken!");
			break;
			
		case "Batman" :
			System.out.println("I'm Batman");
			break;
			
		case "Barack Obama" :
			System.out.println("Yes we can!");
			break;
			
		case "Martin Luther King Junior" :
			System.out.println("I have a dream!");
			break;
			
		case "Ezio Auditore" :
			System.out.println("Raquiescat de pace.");
			break;
			
		default : 
			System.out.println("We are going to add this character shortly!");
			break;
		}

	}

}
