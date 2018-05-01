class robot {
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int feet) {
		System.out.printf("Jumping %d ft. ", feet);
		System.out.println();
	}
	public void move(String direction, int distance) {
		System.out.println("Moving " + distance + " metres " + direction + ".");
		
	}
}


public class Robocop {

	public static void main(String[] args) {
		
		robot C3PO = new robot();
		C3PO.speak("Oh, my dear friend. How I’ve missed you." );
		C3PO.jump(2);
		C3PO.move("South", 20);

	}

}
