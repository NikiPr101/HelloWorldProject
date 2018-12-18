package Basics;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean boolVar = true;
		System.out.println(boolVar);
		boolVar = false;
		System.out.println(boolVar);
		// Zahlen speichern = short= 16 Bit Speicherplatz
		short shortVar;
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		shortVar = 2018;
		System.out.println(shortVar);
		shortVar = (short) (7 + shortVar);
		System.out.println(shortVar);

	}

}
