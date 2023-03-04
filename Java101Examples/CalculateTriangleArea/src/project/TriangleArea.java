package project;
import java.util.Scanner;
public class TriangleArea {
	public static void main(String[] args) {
	//Değişkenleri oluşturalım
	int a, b, c;
	
	//Kullanıcıdan veri alalım
	Scanner input = new Scanner(System.in);
	
	System.out.println("1. Kenarı Girin");
	a = input.nextInt();
	
	System.out.println("1. Kenarı Girin");
	b = input.nextInt();
	
	System.out.println("1. Kenarı Girin");
	c = input.nextInt();
	
	int perimeter = ((a+b+c) / 2) * 2;
	int area = perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c);
	
	System.out.println("Perimeter of triangle = " + perimeter);
	System.out.println("Area of triangle = " + area);
	}
}
