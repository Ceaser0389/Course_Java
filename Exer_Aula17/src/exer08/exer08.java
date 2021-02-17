package exer08;

import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {
		
	 	Scanner sc = new Scanner(System.in);
		
	 	int num;
	 	int media;
	 	int soma = 0;
	 	
	 	
	 	for (int i= 0; i<5 ; i++) {
	 		
	 	System.out.println("Digite um numero");
	 	num =sc.nextInt();
	 	
	 	soma +=num;
	 		
	 	}
	 	media = soma/5;
	 	
	 	System.out.println("Soma:"+ soma);
		System.out.println("Media:"+ media);
	}

}
