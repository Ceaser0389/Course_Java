package exer26;

import java.util.Scanner;

public class exer26 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
		
	
		System.out.println("Digite um numero:");
		int num = sc.nextInt();
		
		System.out.println("Fatorial de " + num );
		System.out.print(num + " ! = ");
	
		int fatorial = 1;
		
		for(int i=num ; i>1 ; i--) {
			fatorial *= i;
			System.out.println(i + " .");
		}
		
		System.out.println(" 1 = " + fatorial);
		
		System.out.println("Resultado: " + fatorial);
	
	
	
	
	
	
	
	}

}
