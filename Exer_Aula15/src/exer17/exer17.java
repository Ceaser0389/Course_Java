package exer17;

import java.util.Locale;
import java.util.Scanner;

public class exer17 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	
	
	
	System.out.println("Entre com o ano:");
	
	int ano = sc.nextInt();
	
	if(ano % 400 == 0 || (ano % 4 ==0 && ano %100 != 0)) {
		System.out.println("é Bissexto!");
	}else {
		System.out.println("não é Bissexto!");
	}
	
	
	
	
	
	
	
	
	
	}

}
