package exer10;

import java.util.Locale;
import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	 double fe, cel;
	 
	 System.out.println("entre com a temperatura em Celsius:");
	 cel =sc.nextDouble();
	 
	 
	 fe = cel*(9.0/5.0)+32;

	 
	 System.out.println("A temperatura em ferenheit" + fe);
	 
	}

}
