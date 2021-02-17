package exer22;

import java.util.Locale;
import java.util.Scanner;

public class exer22 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	
		
	
	System.out.println("Entre com a quantidade em (kg) de morango: ");
	double qtdMorango = sc.nextDouble();
	System.out.println("Entre com a quantidade em (kg) de maça: ");
	double qtdMaca = sc.nextDouble();
	
	double precoMorango =0;
	if(qtdMorango <= 5) {
		precoMorango =2.5;
	}else {
		precoMorango =2.20;
	}
	
	double precoMaca =0;
	if(qtdMaca <= 5) {
		precoMaca =1.80;
	}else {
		precoMaca =1.50;
	}
	
	double precoTotalMorando = qtdMorango + precoMorango;
	double precoTotalMaca = qtdMaca + precoMaca;
	
	double precoParcial = precoMorango + precoMaca;
	double precoTotal =precoParcial;
	
	if ((qtdMorango + qtdMaca >8) || precoParcial >25) {
		precoTotal =precoParcial -((precoParcial /100)*10);
	}
	
	 System.out.println("Preço Total =" + precoTotal);
	
	
	
	
	
	
	}

}
