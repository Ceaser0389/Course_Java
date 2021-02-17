package exer22;

import java.util.Locale;
import java.util.Scanner;

public class exer22 {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner (System.in);
	 Locale.setDefault(Locale.US);	
		
	 
	 System.out.println("Entre com o numero de CDs:");
	 int cds = sc.nextInt();
	 
	 double preco;
	 double soma = 0;
	 
	 for( int i=1 ; i<=cds; i++) {
		 
		 System.out.println("Informe o valor do cd : " + i);
		 preco =sc.nextDouble();
		 soma +=preco;
	 }
	double media = soma/ cds;
	
	System.out.println("Média gasta com cada CD :" + media);
	 
	 
		
	}

}
