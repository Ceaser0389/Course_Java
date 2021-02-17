package exer32;

import java.util.Scanner;

public class exer32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] vetorA = new int[5];
		
		 for(int i=0 ; i<vetorA.length ; i++) {
		    	System.out.println("entre com o valor da posição do vetor A: " + i);
		    	vetorA[i] = sc.nextInt();	
		    }
	
		 for(int i=0 ; i<vetorA.length ; i++) {
			 System.out.println("Tabuada de " + vetorA[i]);
			 
			 for(int j=0 ; j<=10 ;j++) {
				 System.out.println(j +" *  " + vetorA[i] + " = " + (vetorA[i] *j));
			 }
			 
			 
		 }
	
		 System.out.println();
	
	
	
	
	
	
	
	
	}

}
