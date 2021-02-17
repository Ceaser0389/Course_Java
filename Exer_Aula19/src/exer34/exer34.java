package exer34;

import java.util.Scanner;

public class exer34 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		
		 for(int i=0 ; i<vetorA.length ; i++) {
		    	System.out.println("entre com o valor da posição do vetor A: " + i);
		    	vetorA[i] = sc.nextInt();	
		    }
	    
		  for(int i =0 ; i<vetorA.length ; i++) {
			  
			  System.out.println("Analisando o número " + vetorA[i]);
			  
			  for(int j=2 ; j<vetorA[i] ; j++) {
				  
				  if( j % 2 == 0) {
					  System.out.println( j + " é par");
				  }
			  }
			  
			  System.out.println();
		  }
	
	
	
	
	
	
	
	
	
	}  
}
