package exer03;

import java.util.Locale;
import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
	 
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);
		
	String letra;
	
	
	System.out.println("Entre com uma letra:");
	letra =sc.nextLine();
	
	if(letra.equalsIgnoreCase("F")) {
		System.out.println("F - feminino");
	}
	else if(letra.equalsIgnoreCase("M")) {
		System.out.println("M- masculino");
	}
	else {
	System.out.println("Sexo inválido!");
	}
	
	
	
	
	}

}
