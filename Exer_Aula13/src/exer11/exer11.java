package exer11;

import java.util.Locale;
import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);

	int n1,n2;
	double num3;
	double result1,result2,result3;
	System.out.println("entre com um numero interio:");
	n1 =sc.nextInt();
	System.out.println("entre com outro  numero interio:");
	n2 =sc.nextInt();
	System.out.println("entre com um numero real:");
	num3 =sc.nextDouble();
	
	 result1=  (n1*n1)*(n2/2);
	 result2 = (n1*n1*n1)+(num3*num3*num3);
	 result3 = Math.pow(num3,3);
	
	 System.out.println("O primeiro resultado é:"+result1);
	 System.out.println("O segundo resultado é:"+result2);
	 System.out.println("O terceiro resultado é:"+result3);
	
	
	}

}
