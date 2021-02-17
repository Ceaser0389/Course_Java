package exer12;

import java.util.Locale;
import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);
	
	System.out.println("Entre com um numero para gerar a tabuada:");
    int num =sc.nextInt();
	
	System.out.println("Tabuada de" + num + ":");
	
	for(int  i=1 ; i <=10 ; i++) {
		System.out.println( num + " x " + i + " = " + (num*i));
		}
	
	
	
	
	
	
	
	}

}
