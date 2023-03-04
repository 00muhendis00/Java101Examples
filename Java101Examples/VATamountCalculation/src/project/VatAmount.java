package project;
import java.util.Scanner;
public class VatAmount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double amount, Vat=0.18;
		System.out.println("Enter the product price ");
		amount = input.nextDouble();
		System.out.println("Vat without price = " + amount);
		double newPrice = amount * Vat +amount;
		System.out.println("Yeni Fiyat = " + newPrice);
		double total = newPrice - amount;
		total = (amount<0 | amount > 1000) ? Vat = 0.18 : Vat ;
		System.out.println("Total Vat = " + total);
		
		
	}
}
