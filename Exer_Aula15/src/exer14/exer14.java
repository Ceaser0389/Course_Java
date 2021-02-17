package exer14;

import java.util.Locale;
import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);		

	double nota1, nota2 , media;
	
	System.out.println("entre com a 1 nota:");
	nota1 = sc.nextDouble();
	System.out.println("entre com a 2 nota:");
	nota2 = sc.nextDouble();
	
	media = (nota1+nota2)/2;
	
	if( media >=9.0 && media<=10.00) {
		System.out.printf("Parabéns Aprovado !! "+ media);
	}
	else if( media >=7.5 && media<=9.0) {
		System.out.printf("Aprovado nota B !! "+ media);
	}
	
	else if( media >=6.0 && media<=7.5) {
		System.out.printf("Aprovado nota C !! "+ media);
	}
	
	else if( media >=4.0 && media<=6.0) {
		System.out.printf(" Reprovado D !! "+ media);
	}
	
	else if( media <=4.0 && media>=0.0) {
		System.out.printf(" Reprovado E  VC é muito BURRO !! "+ media);
	}
	
	
	
	
	
	}

}
