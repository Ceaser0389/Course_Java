package exer17;

import java.util.Scanner;

public class exer17 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in);
		
			int[]idades = new int[10];
			 
			 for(int i=0 ; i<idades.length ; i++) {
				 System.out.println("Entre com a idade da pesosa " + (i+1));
				 idades[i] = sc.nextInt();
			 }
		
		
		    int qtd = 0;
		    
		    for(int i=0; i<idades.length ; i++) {
		    	if(idades[i] >35) {
		    		qtd++;
		    	}
		    }
		    
		    System.out.println("Vetor de idades =");
		    for(int i=0 ; i< idades.length ; i++) {
		    	System.out.println(idades[i] + "   ");
		    }
		    System.out.println();
		    
		    System.out.println("Qtd pesosas idade > 35: " + qtd);
		  

	}

}
