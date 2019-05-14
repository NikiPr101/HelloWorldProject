package data;

import java.util.ArrayList;

public class Person {
	//
	private static ArrayList<Person> liste = new ArrayList<Person>();

	//
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	//
	//
	private String vorname;
	private String nachname;
	private String plz;
	private String strasse;
	private String hausnummer;
	private String ort;

	@Override
	public String toString() {
		return getNachname() + ", " + getVorname() + "\n" + getStrasse() + "\n" + getHausnummer() + "\n" + getPlz() + "\n"
				+ getOrt();
	}

	public static ArrayList<Person> getListe() {
		return liste;
	}
}
