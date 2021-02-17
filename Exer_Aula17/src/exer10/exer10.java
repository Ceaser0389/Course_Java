package exer10;

import java.util.Locale;
import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);
	
	System.out.println("Entre com o primeiro numero"); 
	int num1 = sc.nextInt();	
	
	System.out.println("Entre com o segundo numero");
	int num2 = sc.nextInt();
	
	for(int i=num1 ; i<=num2 ; i++ ) {
		
		System.out.println(i);
	}
		

	}

}
