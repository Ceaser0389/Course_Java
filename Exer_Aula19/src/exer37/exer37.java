package exer37;

import java.util.Scanner;

public class exer37 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[15];
	    int[] vetorB = new int[vetorA.length];

	    for(int i=0 ; i<vetorA.length ; i++) {
	    	System.out.println("entre com o valor da posição do vetor A: " + i);
	    	vetorA[i] = sc.nextInt();	
	    }
	    
	    int soma =0;
	    
	    for(int i=0 ; i<vetorA.length ; i++) {
	    	vetorB[i] =1; // opcional...
	    	
	    	for( int j=1 ; j<=vetorA[i] ; j++) {
	    		vetorB[i] *= j;
	    	}
	    }
	    
	    System.out.print("Vetor A = ");
	    for(int i=0; i<vetorA.length ; i++) {
	    	System.out.print(vetorA[i] + "  ");
	    }
	    
	    System.out.println(); 

	    System.out.print("Vetor B = ");
	    for(int i=0; i<vetorB.length ; i++) {
	    	System.out.print(vetorB[i] + "  ");
	    }
	    
	    System.out.println(); 
	    
	}

}
