package Project;
import java.util.Scanner;
public class BodyMass {
	public static void main(String[] args) {
		double boy,kilo,calculate;
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu metre cinsinden giriniz ");
		boy = input.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz ");
		kilo = input.nextDouble();
		calculate = kilo /( boy * boy);
		System.out.print("Vücut Kitle indeksiniz " + calculate);
	}
}
