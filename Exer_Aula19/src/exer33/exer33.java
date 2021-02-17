package exer33;

import java.util.Scanner;

public class exer33 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		int[] vetorA = new int[5];
		boolean primo;
		String msg ; 
		 for(int i=0 ; i<vetorA.length ; i++) {
		    	System.out.println("entre com o valor da posição do vetor A: " + i);
		    	vetorA[i] = sc.nextInt();	
		    }

		 for(int i=0 ; i<vetorA.length ; i++) {
			 
			 primo = true;
			for(int j=2 ; j<vetorA[i]  ; j++) {
				if(vetorA[i] % 2== 0) {
					primo = false;
					break;
				}
			}
			
			  msg = "  ";
			if(primo) {
				msg= " primo ";
			}else {
				msg = "Não é primo ";
			}
			 
			System.out.println(vetorA[i] + msg); 
			 
			 
		 }
		 
		 
	}

}
