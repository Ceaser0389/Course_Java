package exer02;

import java.util.Locale;
import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);
	
	int num;
	
	System.out.println("Entre com um numero:\n");
	num = sc.nextInt();
	
	if(num>=0) {
		System.out.println("O numero digitado � positivo:"+num);
	}
	else {
		System.out.println("O numero digitado � negativo:"+num);
	}
	
	
		

	}

}
