package sortieren;

public class QuickSort {

// 

	static int[] zahlen = { 4, 2, 5, 9, 6, 10, 9, 7 };

// 

	public static void main(String[] args) {

		System.out.println("Die Reihe hat " + zahlen.length + " Zahlen");
		for (

				int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}
// unsortierte Zahlen ausgeben 

// sortieren 

// quicksort(0,6) // zahlen.length -1 
		quicksort(0, zahlen.length - 1);
// sortierte zahlen ausgegebn 
		//
		System.out.println("---");
		//
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}
	}
//						Stelle links, Stelle rechts
	static void quicksort(int links, int rechts) {

//falls links < rechts dann 

		if (links < rechts) {

			int teiler = teile(links, rechts);

			quicksort(links, teiler - 1);

			quicksort(teiler + 1, rechts);

		}

	}

	private static int teile(int links, int rechts) {

		// variablen

		int i = links;
		int j = rechts - 1;
		int pivot = zahlen[rechts];

// 

		do {
// Suche von links ein Element, welches größer als das Pivotelement ist
			while (i < rechts - 1 && zahlen[i] < pivot) {
				i = i + 1;
			}

// Suche von rechts ein Element, welches gleich oder kleiner als das Pivotelement ist 
			while (j > links && zahlen[j] >= pivot) {
				j = j - 1;
			}
			if (i < j) {
				int a = zahlen[i];
				zahlen[i] = zahlen[j];
				zahlen[j] = a;

// tauschen 

			}

		} while (i < j);
		if (zahlen[i] > zahlen[rechts]) {
			int b = zahlen[i];
			zahlen[i] = zahlen[rechts];
			zahlen[rechts] = b;
		}

		return i;
	}
}
