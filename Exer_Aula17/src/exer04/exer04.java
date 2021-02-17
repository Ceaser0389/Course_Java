package exer04;

import java.util.Locale;
import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		 int popA = 80000;
		 int popB = 20000;
		 int cont =0;
		 
		 while (popA < popB) {
			 
			 popA += (popA/100) * 3;
			 popB += (popB /100) * 1.5;
			 cont++;
		 }
		
		 System.out.println("população A:" + popA);
		 System.out.println("população B:" + popB);
		 System.out.println("QTD Anos: " + cont);
		 
		 

	}

}
