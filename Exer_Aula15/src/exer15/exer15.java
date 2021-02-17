package exer15;

import java.util.Locale;
import java.util.Scanner;

public class exer15 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	

	System.out.println("entre com o lado 1 do triangulo:");
	double lado1 = sc.nextDouble();
	System.out.println("entre com o lado 2 do triangulo:");
	double lado2 = sc.nextDouble();
	System.out.println("entre com o lado 3 do triangulo:");
	double lado3 = sc.nextDouble();
	
	
		if(((lado1+ lado2)>lado3) && 
		  ((lado1+lado3) >lado2) &&
		  ((lado2+ lado3)>lado1)){
			 if(lado1 == lado2 && lado1 ==lado3) {
			  System.out.println("é um triangulo Equilátero");
			 }else if(lado1!=lado2 && lado1!=lado3 && lado3!=lado2){
				 System.out.println(" é um triangulo escaleno");
		  } 
			 else if (lado1 ==lado2 || lado1 ==lado3 || lado2 ==lado3) {
				 System.out.println(" é um triangulo isóceles"); 
			 }
			 
		else {
			 System.out.println("Não forma um triangulo");
		}
	
	
	
	
	
	}

}
}
