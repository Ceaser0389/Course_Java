package exer31;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class exer31 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
    Locale.setDefault(Locale.US);
	
    double salario =1000; //95
    double percentual = 1.5; // 96
    
    salario += (salario/100) * percentual ; 
    
    // classe para  formatar sauda  de numeros 
    DecimalFormat format = new  DecimalFormat("###,###.##");
    
    
    for(int i=1997 ; i<=2015 ; i++) {
        percentual *= 2;
    
    	salario += (salario/100) * percentual ; 
    	
    	System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
    }
    
	
	}

}
