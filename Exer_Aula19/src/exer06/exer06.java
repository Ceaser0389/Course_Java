package exer06;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in );
	
	int []vetorA = new int [10];
	int []vetorB = new int [vetorA.length];
    int []vetorC = new int [vetorA.length];
    

	for( int i=0 ; i<vetorA.length ; i++) {
		System.out.println("Entre com o valor do vetorA da posi��o: " + i);
		vetorA[i] = sc.nextInt();
		
		}
	
	for( int i=0 ; i<vetorB.length ; i++) {
		System.out.println("Entre com o valor do vetorB da posi��o: " + i);
		vetorB[i] = sc.nextInt();
		
		}
	
	for( int i=0 ; i<vetorC.length ; i++) {
		System.out.println("Entre com o valor do vetorB da posi��o: " + i);
		vetorC[i] = vetorA[i] + vetorB[i];
		
		}
	
	
	 System.out.print(" Vetor A = ");
	  for( int i=0 ; i<vetorA.length ; i++) {
		  System.out.print(vetorA[i] + "  ");
	  }
	  System.out.println();
	  
	  System.out.print(" Vetor B = ");
	  for( int i=0 ; i<vetorB.length ; i++) {
		  System.out.print(vetorB[i] + "  ");
	  }
	  System.out.println();
	
	
	  System.out.print(" Vetor C = ");
	  for( int i=0 ; i<vetorC.length ; i++) {
		  System.out.print(vetorC[i] + "  ");
	  }
	  System.out.println();
	
	  
	
	}

}
