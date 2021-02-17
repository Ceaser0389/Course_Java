package exer15;

import java.util.Scanner;

public class exer15 {

	public static void main(String[] args) {
	
	    Scanner sc = new Scanner (System.in);
			
		System.out.println("Entre com o n-énemo termo sa serie"
				+ " de finonacci:");	
		int n = sc.nextInt();	
		
		int  primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for(int i = 3 ; i<=n ; i++) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
					
			System.out.println(proximo);
		}
		
	}

}
