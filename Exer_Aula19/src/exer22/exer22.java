package exer22;

import java.util.Scanner;

public class exer22 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
			int[] vetorA = new int[10];
		  
		  int qtd = 0;
		  int qtd1 =0;
		    
	        for(int i=0 ; i<vetorA.length ; i++) {
	        	vetorA[i] = (int) Math.round(Math.random() *1);
	            
	        	if (vetorA[i] == 0) {
	        		qtd++;
	        	}else {
	        		qtd1++;
	        	}
	           
	        }
	    
		  double por0 = (qtd * 100)/ vetorA.length;
		  double por1 = (qtd1 *100)/ vetorA.length;
		  
		  
		  System.out.print("Vetor A = ");
		    for(int i=0; i<vetorA.length ; i++) {
		    	System.out.print(vetorA[i] + "  ");
		    }
		    
		    System.out.println(); 
	    
		   System.out.println("Porc 0 = " + por0);
		   System.out.println("Porc 1 = " + por1);
		  
		   
		   
		 

	}

}
