package exer11;

import java.util.Locale;
import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Entre com o primeiro numero"); 
		int num1 = sc.nextInt();	
		
		System.out.println("Entre com o segundo numero");
		int num2 = sc.nextInt();
		
		int soma = 0;
		
		for(int i=num1 ; i<=num2 ; i++ ) {
			
			soma +=i;
			}
		
		System.out.println(" Soma " + soma);
		
		
		

	}

}
