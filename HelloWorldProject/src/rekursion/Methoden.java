package rekursion;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Methoden {
// main methode - sit die Methode
	// die beim Start des programms / Klasse aufgerufen wird
	// eine "normale" methode, die erst , wenn sie aufgerufen wird - durchlaufen
	// wird
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	spezielleMethode();
	addiere(10, 5);
	System.out.println(mult(8,7));

	}

// eine "normale" methode, die erst , wenn sie aufgerufen wird - durchlaufen wird
	public static void spezielleMethode() {
		System.out.println("Ich bin speziell");
	}

	public static void addiere(int zahlA, int zahlB) {
		System.out.println(zahlA + zahlB);
	}

	public static int mult(int zahlA, int zahlB) {
		int ergebnis = zahlA * zahlB;
		return ergebnis;
	}
}
