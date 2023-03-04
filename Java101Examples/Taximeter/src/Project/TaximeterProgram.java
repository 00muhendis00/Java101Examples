package Project;
import java.util.Scanner;

public class TaximeterProgram {
	public static void main(String[] args) {
		double km,startPrice = 10;
		double perKm = 2.20, total;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Km bilgisi giriniz");
		km = input.nextDouble();
		
		total = (km * perKm) + startPrice;
		
		total = (total < 20) ? 20 : total;
		System.out.print("Ödenecek olan tutar = " + total);
	}
}
