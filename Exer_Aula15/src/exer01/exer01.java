package exer01;

import java.util.Locale;
import java.util.Scanner;

public class exer01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
     
		int n1,n2, maior;
		
		System.out.println("Entre com um numero inteiro:");
		n1 = sc.nextInt();
		System.out.println("Entre com outro numero inteiro:");
		n2 = sc.nextInt();
		
		if (n1>n2) {
			maior =n1;
		  System.out.println("O maior é:"+ maior);
		}
		else {
			maior =n2;
			 System.out.println("O maior é:"+ maior);
		}
		
		
		
	}

}
