package exer20;

import java.util.Scanner;

public class exer20 {

	public static void main(String[] args) {
	
    Scanner sc = new Scanner (System.in);

    
	    double[] vetorA = new double[20];
	    double cotacao;
	    
	    System.out.println("Entre com a cota��o do d�lar:");
	    cotacao = sc.nextDouble();
	    
        for(int i=0 ; i<vetorA.length ; i++) {
        	vetorA[i] = cotacao * (i+1);
        }
    
        System.out.print("Vetor A = ");
	    for(int i=0; i<vetorA.length ; i++) {
	    	System.out.print(vetorA[i] + "  ");
	    }
	    
	    System.out.println(); 
    
    
      
    
    
    
    
    
    
	}

}
