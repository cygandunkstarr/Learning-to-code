public class Application {
	public static void main(String[] args) {
		
		int[][] plane = {
				{2, 4, 6},
				{3, 6, 9 ,12},
				{4, 8, 12, 16, 20}
		};
		System.out.println(plane[0][1]);
		
		for(int row=0; row < plane.length; row++) {
			for(int col=0; col < plane[row].length; col++) {
				System.out.print(plane[row][col] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
