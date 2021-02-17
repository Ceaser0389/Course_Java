package exer34;

import java.util.Locale;
import java.util.Scanner;

public class exer34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o valor de n :");
		int n  = sc.nextInt();
		
		double soma =0;
		
		for(int i=1 ; i<n ; i++) {
		   soma +=1/i;	
		}
		
		System.out.println(" Soma = " + soma);
		
		
		
		
	}

}
