package exer16;

import java.util.Scanner;

public class exer16 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner (System.in);
			
			System.out.println("Entre com o n-�nemo termo sa serie"
					+ " de finonacci:");	
			int n = sc.nextInt();	
			
			int  primeiro = 1;
			int segundo = 1;
			int proximo = 0;
			
			System.out.println(primeiro);
			System.out.println(segundo);
			
			while(proximo <= 500) {
				
				proximo = primeiro + segundo;
				primeiro = segundo;
				segundo = proximo;
						
				System.out.println(proximo);
			}
			
		}
		
		

	}


