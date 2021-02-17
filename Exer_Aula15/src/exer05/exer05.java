package exer05;

import java.util.Locale;
import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	

	int media=0;
	
	System.out.println("Entre com a Primeira nota:");
	int n1 = sc.nextInt();
	System.out.println("Entre com a Segunda nota:");
	int n2 = sc.nextInt();
	
	media = (n1+n2)/2;
	
	
	if(media == 10) {
		System.out.println("Aprovado com Distinção:"+ media);
	}
	else if (media >= 7) {
		System.out.println("Aprovado com suesso: "+ media);
	}
	else {
		System.out.println("Aluno reprovado:"+ media);
	}
	
	
	
	
	
	
	
	
	}

}
