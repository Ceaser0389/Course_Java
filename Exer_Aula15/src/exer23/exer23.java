package exer23;

import java.util.Locale;
import java.util.Scanner;

public class exer23 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	
		
	
		System.out.println("Entre com o tipo da carne:");
		System.out.println(" 1- file duplo:");
		System.out.println(" 2- alcatra:");
		System.out.println(" 3- picanha:");
		int tipo =sc.nextInt();
		
		System.out.println("Entre com oquantidade em (kg):");
		double qtd = sc.nextDouble();
		
	    double precoKg =0;;
	    
	    if (tipo == 1) {
	    	System.out.println(qtd + " Kg -File Duplo");
	    	if(qtd <5) {
	    		precoKg = 4.9;
	    	}else {
	    		precoKg = 5.80;
	    	}
	    }
	    else if (tipo ==2) {
	    	System.out.println(qtd + " Kg -File Alcatra");
	    	if(qtd <5) {
	    		precoKg = 5.8;
	    	}else {
	    		precoKg = 6.90;
	    	}
		}
	
	    else if (tipo ==3) {
	    	System.out.println(qtd + " Kg - Picanha");
	    	if(qtd <5) {
	    		precoKg = 6.90;
	    	}else {
	    		precoKg = 7.80;
	    	}
		}
	
	    double total = qtd * precoKg;
	    System.out.println( qtd + " Kg * " + precoKg + " =" + total);
	
	
	    System.out.println("compra no cartão (s/n)");
	    int cartao = sc.nextInt();
	
	    if (cartao == 1) {
	    	double desconto = (total/100);
	    	System.out.println(" Desconto de :" + desconto);
	    	System.out.println("valor a pagar :" + (total -desconto));
	    }else {
	    	System.out.println("valor a pagar :" + total );
	    }
	
	
	
	
	}
}
