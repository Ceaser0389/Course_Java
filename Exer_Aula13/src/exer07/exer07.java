package exer07;

import java.util.Locale;
import java.util.Scanner;

public class exer07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	
		
	double lado,area,doblo;
	
	System.out.println("entre com o lado do quadrado:");
	lado =sc.nextDouble();
	
     area = lado*lado;
	
	 doblo =area *2;
	
	  System.out.println("O area ao quadrado é "+doblo);
	
	}

}
