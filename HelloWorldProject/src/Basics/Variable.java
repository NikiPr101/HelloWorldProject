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
		//
		shortVar = 2018;
		System.out.println(shortVar);
		//
		shortVar = (short) (shortVar - 16);
		System.out.println(shortVar);
		//
		System.out.println(9/4.0);
		System.out.println(shortVar + 10);
		//
		//
		int intVar;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//
		//
		long longVar;
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		longVar = 1000*1000*1000*1000;
		System.out.println(longVar);
		//
		System.out.println(System.currentTimeMillis());
		//
		//
		float floatVar;
		floatVar=10/3f;
		System.out.println(floatVar);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		//
		//
		double doubleVar;
		doubleVar=10/3d;
		System.out.println(doubleVar);
		//
		//
		String stringVar;
		stringVar="Hello there, General Kenobi";
		System.out.println(stringVar);
	}

}
