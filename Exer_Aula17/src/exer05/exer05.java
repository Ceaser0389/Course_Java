package exer05;

import java.util.Locale;
import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		  
		  double popA = 80000;
		  double popB = 20000;
		  double taxaA;
		  double taxaB;
		  
		  boolean valido = false;
		  do {
			  
			  System.out.println("Entre com a popuçação A");
			  popA = sc.nextDouble();
			  
			  if (popA > 0) {
				  valido = true;
			  } else {
				  System.out.println("População A precisa ser maior que zero");
			  }
			 
		  } while(!valido);
		  
		  valido = false;
		  do {
			  
			  System.out.println("Entre com a popuçação B");
			  popB = sc.nextDouble();
			  
			  if (popB > 0) {
				  valido = true;
			  } else {
				  System.out.println("População B precisa ser maior que zero");
			  }
			 
		  } while(!valido);
		  
		  
		 valido = false;
		  do {
			  
			  System.out.println("Entre com a taxa de crescimento da população  A");
			  taxaA = sc.nextDouble();
			  
			  if (taxaA > 0) {
				  valido = true;
			  } else {
				  System.out.println("Taxa de crescimento A precisa ser maior que zero");
			  }
			 
		  } while(!valido);
		  
		  valido = false;
		  do {
			  
			  System.out.println("Entre com a Taxa de crescimento da popuçação B");
			  taxaB = sc.nextDouble();
			  
			  if (taxaB > 0) {
				  valido = true;
			  } else {
				  System.out.println("Taxa da população B precisa ser maior que zero");
			  }
			 
		  } while(!valido);
		  
		  
		
		 int cont =0;
		 
		 while (popA < popB) {
			 
			 popA += (popA/100) * taxaA;
			 popB += (popB /100) * taxaB;
			 cont++;
		 }
		
		 System.out.println("população A:" + popA);
		 System.out.println("população B:" + popB);
		 System.out.println("QTD Anos: " + cont);
		
		
		
		
		
		
		
		
	}

}
