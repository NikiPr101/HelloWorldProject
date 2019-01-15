package Basics;

public class Schleife2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("vor");
		for (int i = 0; i < 3; i++) {
			System.out.println("während");
		}
		System.out.println("nach");
		for (int i = 0; i < 3; i++) {
			System.out.println("wie oft hier vor?" + (i+1));
			for (int x = 0; x < 4; x++) {
				System.out.println("wie oft" + (x + 1));
			}
			System.out.println("wie oft hier nach?" + (i+1));
		}
	}
}
