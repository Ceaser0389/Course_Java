package exer04;

import java.util.Locale;
import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
	
	Scanner sc =new Scanner (System.in);
	Locale.setDefault(Locale.US);
		
	System.out.println("entre com uma letra:");
	String letra =sc.nextLine();
	
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
			letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o") 
			|| letra.equalsIgnoreCase("u")) {
			
			System.out.println("A letra é vogal:" +letra);
		}
		else {
		   System.out.println("A letra é consoante:"+letra);
		}
	
	
	
	
	
	
	
	}

}
