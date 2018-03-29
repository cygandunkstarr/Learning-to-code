public class If {
	public static void main(String[] args) {

		int myInt = 44;
		
		if (myInt > 50) {
			System.out.println("Too high!");
			//break statement jumps out of the loop as soon as the condition becomes true

		} 
		
		else if (myInt < 32) {
			System.out.println("Too Low!");
		} 
		
		else {
			System.out.println("None of the above :(");
		}

	}

}
