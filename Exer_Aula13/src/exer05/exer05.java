package exer05;

import java.util.Locale;
import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double me,cent;
		
		System.out.println("Entre com um numero em metros:");
		me =sc.nextDouble();
		
		cent= me*100;
		
		System.out.println("O valor em centimetros é:"+cent);
		
		
		
		
	}

}
