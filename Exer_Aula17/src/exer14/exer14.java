package exer14;

import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner (System.in);
	 
	  int num;
	  int pares =0;
	  int impares = 0;
		 
	  for(int i=0 ; i<10 ; i++){
	     System.out.println("Entre com um numero:"); 
		 num = sc.nextInt();
		 
			 if(num % 2 == 0) {
				pares++;
			 }
			 else {
				impares++; 
			 }
		
		 }
	  
	  System.out.println("Pares: " +  pares);
	  System.out.println("Impares: " + impares);
	}

}
