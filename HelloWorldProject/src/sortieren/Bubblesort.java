package sortieren;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] zahlen = { 3, 1, 9, 5, 2, 8, 6, 5 };
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}
//Bubblesort
System.out.println("----------------------");
		for (int z = zahlen.length; z > 1; z--) {
			for (int s = 0; s < z - 1; s++) {
				if (zahlen[s] > zahlen[s + 1]) {
					int a = zahlen[s];
					zahlen[s] = zahlen[s + 1];
					zahlen[s + 1] = a;

				}
			}
		}
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}

	}
}