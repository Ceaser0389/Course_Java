package exer06;

import java.util.Locale;
import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
     
   
    double area, raio;
    
    System.out.println("Entre com o raio:");
    raio = sc.nextDouble();
    
    area = raio * 3.14;
    
     System.out.println("Area do circulo é:"+area);
     
        
        
        
        
        
	}

}
