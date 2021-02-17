package exer08;

import java.util.Locale;
import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);
	
	double pro1, pro2,pro3;
	
	System.out.println("entre com o preço do 1 produto:");
	pro1 =sc.nextDouble();
	System.out.println("entre com o preço do 2 produto:");
	pro2 =sc.nextDouble();	
	System.out.println("entre com o preço do 3 produto:");
	pro3 =sc.nextDouble();	
	
	
		if( pro1<pro2 && pro1<pro3) {
			System.out.println("O produto mais barato é o Primeiro:" + pro1);
		}else if( pro1>pro2 && pro2<pro3) {
			System.out.println("O produto mais barato é o Segundo:" + pro2);
		}else if( pro3<pro1 && pro3<pro2) {
			System.out.println("O produto mais barato é o Terceiro:" + pro3);
		}
		
	
	
	
	
	
	
		
		
	}

}
