package exer03;

import java.util.Locale;
import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
	Scanner sc =  new Scanner (System.in);
	Locale.setDefault(Locale.US);
	
	int n1, n2,soma;
	
	System.out.println("Entre com um numero inteiro:");
	n1 =sc.nextInt();
	System.out.println("Entre com outro numero inteiro:");
	n2 =sc.nextInt();
	
	soma = n1+n2;
	
	System.out.println("A soma dos numeros é:"+soma);
	
	}

}
