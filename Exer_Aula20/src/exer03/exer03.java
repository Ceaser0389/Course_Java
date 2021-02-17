package exer03;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
	    int [] [] numeros = new int [3][3];
		
		for(int i=0 ; i<numeros.length ; i++) {
			for(int j=0 ; j<numeros.length ; j++) {
				
			System.out.println("entre com o valor da pos : [" + i + "," + j + "]");
			numeros[i] [j] = sc.nextInt();	
			}
		}
		int qtdPares =0;
		int qtdImpares =0;
		
		for(int i=0 ; i<numeros.length ; i++) {
			for(int j=0 ; j<numeros.length ; j++) {
				if (numeros[i] [j] % 2 == 0 ) {
					qtdPares++;
				}else{
					qtdImpares++;
				}
				
			}
		}
		for(int i=0 ; i<numeros.length ; i++) {
			for(int j=0 ; j<numeros.length ; j++) {
		     System.out.print(numeros[i][j] + "  ");
			}
		 System.out.println();
		}
		
		System.out.println("Pares = " + qtdPares);
		System.out.println("Impares = " + qtdImpares);
		
		
	}

}
