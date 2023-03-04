package project;
import java.util.Scanner;
public class Hypotenuse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kenar1, kenar2;
		double hipotenus;
		System.out.println("kenar giriniz ");
		kenar1 = input.nextInt();
		System.out.println("kenar giriniz ");
		kenar2 = input.nextInt();
		hipotenus = (kenar1 * kenar1 + kenar2 * kenar2);
		System.out.println("Hipotenüs = " + hipotenus * 0.5);
	}
}
