package exer16;

import java.util.Locale;
import java.util.Scanner;

public class exer16 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	

    System.out.println("Entre com o valor de a:");
    int a = sc.nextInt();
   
	    if(a== 0) {
	    	System.out.println("N�o � uma equa��o do segundo grau.");
	    }else {
	    	System.out.println("Entre com o valor de b:");
	        int b = sc.nextInt();
	        System.out.println("Entre com o valor de c:");
	        int c = sc.nextInt();
	        
	        double delta = (b*b) -4*a*c;
	    	
	       if(delta < 0) {
	    	   System.out.println("delta negativo");
	       }
	       else {
	    	   double x1 = ((-b) + Math.sqrt(delta))/(2*a);
	    	   double x2 = ((-b) - Math.sqrt(delta))/(2*a);
	       
	           System.out.println("x1 = " + x1);
	           System.out.println("x2 = " + x2);
	       }
	        
	    }
    
	
	
	
	
	
	
	
	
	
	}

}
