package test;

import data.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// String personText
		Person p1; //Variablen Definition
		p1=new Person(); // Instazierung
		//
		p1.setVorname("Hans");
		p1.setNachname("Huber");
		p1.setStrasse("Meiergasse");
		p1.setHausnummer( "88");
		
		System.out.println(p1);
	}

}
