package exer09;

import java.util.Locale;
import java.util.Scanner;

public class exer09 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
		
	double fe , cel;
	
	System.out.println("Entre com a temperatura em Fereheit:");
	fe= sc.nextDouble();
	
	cel = (5*(fe-32)/9);
	
	System.out.println("A temperatura em celsius é:"+cel);

	}

}
