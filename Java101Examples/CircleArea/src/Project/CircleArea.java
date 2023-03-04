package Project;
import java.util.Scanner;
public class CircleArea {
	public static void main(String[] args) {
		double radius,aci;
		Scanner input = new Scanner(System.in);
		System.out.print("Yarıcap değerini giriniz ");
		radius = input.nextDouble();
		
		System.out.print("Merkez açının ölçüsünü giriniz ");
		aci = input.nextDouble();
		
		double pi = 3.14;
		double alan = pi * radius * radius;
		double cevre = 2 * pi * radius;
		double dilimAlan = (pi * radius * radius * aci) / 360;
		
		System.out.println("Cevre = " + cevre);
		System.out.println("Alan = " + alan);
		System.out.print("Daire diliminin alanı = " + dilimAlan);
	}
}
