class jen {

	public static void main(String[] args) {
	
/*			1
		  2 3 2
		3 4 5 4 3
	  4 5 6 7 6 5 4
	5 6 7 8 9 8 7 6 5
		
*/
		int x = 1, b;
		for (int i = 1; i < 6; i++) {

			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			b = i;
			for (int k = 1; k <= x; k++) {
				if (k < i) {
					System.out.print(b++);

				} else {
					System.out.print(b--);

				}
			}
			x = x + 2;
			System.out.println("");

		}

	}

}