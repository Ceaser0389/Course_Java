package exer35;

import java.util.Scanner;

public class exer35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		
		 for(int i=0 ; i<vetorA.length ; i++) {
		    	System.out.println("entre com o valor da posi��o do vetor A: " + i);
		    	vetorA[i] = sc.nextInt();	
		    }
	    
		  for(int i =0 ; i<vetorA.length ; i++) {
			  
			  System.out.println("Analisando o n�mero " + vetorA[i]);
			  
			  for(int j=1 ; j<vetorA[i] ; j++) {
				  
				  if(vetorA[i] % j == 0) {
					  System.out.println( j + " � divisor");
				  }
			  }
			  
			  System.out.println();
		  }
	
	

	}

}
