package exer31;

import java.util.Scanner;

public class exer31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[20];
	    int[] vetorB = new int[vetorA.length]; 
	
	
	    for(int i=0 ; i<vetorA.length ; i++) {
	    	System.out.println("entre com o valor da posição do vetor A: " + i);
	    	vetorA[i] = sc.nextInt();	
	    }

	    int posB =0;
	   
	    for( int i=0 ; i<vetorA.length ; i++) {
	    	if(vetorA[i] % 2 ==0) {
	    		vetorB[posB] = vetorA[i];
	    		posB++;
	    	}
	    }
	    
	    for(int i=0 ; i<vetorA.length ; i++) {
	    	if(vetorA[i] % 2 !=0) {
	    		vetorB[posB] = vetorA[i];
	    		posB++;
	    }
	    
	}
	    System.out.print("Vetor A = ");
	    for(int i=0; i<vetorA.length ; i++) {
	    	System.out.print(vetorA[i] + "  ");
	    }
	    
	    System.out.println(); 

	    System.out.print("Vetor B = ");
	    for(int i=0; i<posB ; i++) {
	    	System.out.print(vetorB[i] + "  ");
	    }
	    
	    System.out.println(); 
	    
	    
	    
	    
	    
	    
	}
}
