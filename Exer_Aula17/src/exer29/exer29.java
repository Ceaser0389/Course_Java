package exer29;

import java.util.Scanner;

public class exer29 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com um número:");
		int num = sc.nextInt();	
		
		boolean primo;
		
		for(int i=1 ; i<num; i++) {
			
		 primo = true;
			for(int j=2 ; j<i ; j++) {
				if(num % i ==0) {
					//System.out.println("Não é primo");
					primo=false;
				}
			 }
			     if(primo) {
			    	 System.out.println(i);
			     }
		}
		
		
		
		
	}

}
