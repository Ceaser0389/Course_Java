package For;

import java.util.Locale;
import java.util.Scanner;

public class exer161 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		 int num ;
		
		 
		
		 for(int i =0; i<= 5; i++) {
		 System.out.println("Entre com um numero inteiro:");
		 num = sc.nextInt();	
	     System.out.println(" o quadrado do numero é : " + num * 2);


		 }

	}

}
