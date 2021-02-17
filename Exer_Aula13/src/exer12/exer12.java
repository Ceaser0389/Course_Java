package exer12;

import java.util.Locale;
import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
	 
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);

	double altura,result;
	
	System.out.println("Entre com a sua altura:");
	altura = sc.nextDouble();
	
	result = (72.7*altura)-52;
	
	System.out.println("O peso ideal para altura informada é:"+result);
	
	
	
	
	
	
	
	}

}
