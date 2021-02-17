package exer14;

import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[]vetorA = new int[10];
		
		

	    for(int i=0; i<vetorA.length ; i++) {
	    	System.out.println("Entre com o valor da posição " + i);
	    	vetorA[i] =sc.nextInt();
	    }
	    
	    int soma= 0;
	    int impar =0;
	    for(int i=0; i<vetorA.length ; i++) {
	    	if(vetorA[i] % 2 != 0) {
	    		soma+= vetorA[i];
	    		impar++;
	    	}
	    }
		
	    System.out.println("Vetor A = ");
	    for(int i=0 ; i< vetorA.length ; i++) {
	    	System.out.println(vetorA[i] + "   ");
	    }
	    System.out.println();
	    
	    System.out.println("Soma: " + soma );
        System.out.println("Média :" + (soma/impar));
		
		
		
		

	}

}
