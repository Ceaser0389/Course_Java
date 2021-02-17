package exer07;

import java.util.Locale;
import java.util.Scanner;

public class exer07 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);		
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i =0 ; i<=5 ; i++) {
			System.out.println("Entre com um numero:");
			num =sc.nextInt();
			
			if(num > maior) {
				maior =num;
				System.out.println("O numero maior mudou :" + maior);
			}
			
			
		}
		System.out.println("O maior digitado foi:" + maior);

	}

}
