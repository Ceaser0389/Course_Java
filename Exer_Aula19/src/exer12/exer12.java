package exer12;

import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
		
		int []vetorA = new int [10];
	
	    for(int i=0 ; i<vetorA.length ; i++) {
	    	System.out.println("Entre com o vlaor da posi��o " + i);
	    	vetorA[i] = sc.nextInt();
	    	}
	    
	    int soma = 0;
	    for (int i =0; i<vetorA.length ; i++) {
	    	soma += vetorA[i];
	    }
		
	    System.out.println("Vetor A = ");
	    for(int i=0 ; i< vetorA.length ; i++) {
	    	System.out.println(vetorA[i] + "   ");
	    }
	    System.out.println();
	    
	    System.out.println("Soma: " + soma );
	    
	}

}
