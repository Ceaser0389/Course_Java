package exer21;

import java.util.Locale;
import java.util.Scanner;

public class exer21 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	
		
	System.out.println("Entre com a qtd de litros Vendidos:");
	double litros = sc.nextDouble();
	System.out.println("Entre com o tipo de combustível :");
	String tipo = sc.next();	
	
	double precoGas = 2.5;
	double precoAlc = 1.9;
	int perDesconto = 0;
	double total= 0;
	double tDesconto =0;
	double precoAPagar =0;
	
	
	if (tipo.equalsIgnoreCase("a")) {
		if(litros <=20) {
			perDesconto =3;
		}else {
			perDesconto =5;
		}
		total = litros *precoAlc;
	}
	
	if (tipo.equalsIgnoreCase("g")) {
		if(litros <=20) {
			perDesconto =4;
		}else {
			perDesconto =6;
		}
		total = litros *precoGas;
	}	
		
		tDesconto =(total /100) *perDesconto;
		
		precoAPagar = total -tDesconto;
		
		System.out.println("Valor a ser pago "+ precoAPagar);
	}

}
