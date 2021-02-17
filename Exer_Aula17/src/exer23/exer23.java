package exer23;

import java.util.Locale;
import java.util.Scanner;

public class exer23 {

	public static void main(String[] args) {
	
	 Scanner sc = new Scanner (System.in);
	 Locale.setDefault(Locale.US);	
	
	 System.out.println("Lojas Quase Dois - Tabela de Preços");
	 
	 for(int i=1 ; i<=50 ;i++) {
		 System.out.println( i + " - R$ " + (1.99*i));
	 }
	 
	 
	 
	 
	 
	}

}
