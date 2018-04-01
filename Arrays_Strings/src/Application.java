public class Application {
	public static void main(String[] args) {
		
		String[] feelings = new String[7];
		/* Default value of an integer is 0
		 * Default value of a string is Null
		 */
		feelings[0] = "joy";
		feelings[1] = "excitement";
		feelings[2] = "anger";
		feelings[3] = "sadness";
		feelings[4] = "frustration";
		feelings[5] = "nostalgic";
		feelings[6] = "confident";
		
		System.out.println(feelings[5]);
		
		//Alternate method of iteration
		for(String emotions: feelings) {
			System.out.println(emotions);
			
		
		}
 
	}

}
