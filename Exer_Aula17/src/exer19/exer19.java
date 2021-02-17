package exer19;

import java.util.Scanner;

public class exer19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o numero de notas: ");
		int notas =sc.nextInt();
		
		double soma = 0;
		double media=0;
		double nota;
		
		for(int i=0 ; i<notas ; i++) {
			System.out.println("Entre com a nota " + (i+1));
			nota = sc.nextDouble();
			
			soma+=nota;
		}
		
		media = soma/ notas;
		
		System.out.println("Soma " + soma);
		System.out.println("Média " + media);
		
		
	}

}
