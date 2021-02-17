package exer18;

import java.util.Locale;
import java.util.Scanner;

public class exer18 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	
	
	
	  System.out.println("Entre com um numero:");
	  int num =sc.nextInt();
	  
	  if(num % 2 == 0) {
		  System.out.println("O numero é par!" + num);
	  }
	  else {
		  System.out.println("O numero é impar!" + num);
	  }
	
	
	
	
	
	
	
	
	
	
	
	}

}
