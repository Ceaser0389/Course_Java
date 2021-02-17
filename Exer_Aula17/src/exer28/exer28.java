package exer28;

import java.util.Scanner;

public class exer28 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	System.out.println("Entre com um numero");
	int num =sc.nextInt();
	
	boolean primo =true;
	
		for(int i=2 ; i<=num ; i++) {
			if(num % i ==0) {
				System.out.println("Não é primo");
				primo=false;
			}
			
		}
		
			if(primo) {
				System.out.println(" é numero primo");
			}
	
	}
		
	
	
	
}


