
public class Application {

	public static void main(String[] args) {
		int[] values;
		/* Optionally,
		 * int[] values = {10, 20, 30, 40, 50};
		 * System.out.Println(values[?]);
		 * 
		 * for(int i=0; i < values.length; i++){
		 * 		System.out.Println(values[i]);
		 */
		values = new int[5];
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		values[3] = 40;
		values[4] = 50;
				
		System.out.println(values[4]);
		
		//iterating through the array
		for(int i=0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}

}
