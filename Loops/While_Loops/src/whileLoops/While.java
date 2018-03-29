package whileLoops;

public class While {
	public static void main(String[] args) {
		int countdown = 10;

		while (countdown >= 0) {
			System.out.println(countdown + " " + "units to go.");
			
			if(countdown < 1) {
				System.out.println("Out of Units!");
			}
			countdown--;

			
		}
	}

}
