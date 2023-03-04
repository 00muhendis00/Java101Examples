package Project;
import java.util.Scanner;
public class GroceryStore {
	public static void main(String[] args) {
		double armut = 2.14,
				elma = 3.67,
				domates = 1.11,
				muz = 0.95,
				patlıcan = 5.0,
				tutar
				;
		int perArmut,perElma,perDomates,perMuz,perPatlıcan;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Armut Kaç kilo? ");
		perArmut = input.nextInt();
		
		System.out.print("Elma Kaç Kilo? ");
		perElma = input.nextInt();
		
		System.out.print("Domates Kaç Kilo? ");
		perDomates = input.nextInt();
		
		System.out.print("Muz Kaç Kilo? ");
		perMuz = input.nextInt();
		
		System.out.print("Patlıcan Kaç kilo? ");
		perPatlıcan = input.nextInt();
		
		tutar = (armut * perArmut) +
				(elma * perElma) +
				(domates * perDomates) +
				(muz * perMuz) +
				(patlıcan * perPatlıcan) ;
		System.out.println("Toplam Tutar = " + tutar);
	}
}
