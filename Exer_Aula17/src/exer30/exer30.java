package exer30;

import java.util.Locale;
import java.util.Scanner;

public class exer30 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);	
	
	Locale.setDefault(Locale.US);
	
	System.out.println("Entre com um numero para gerar a tabuada:");
    int num =sc.nextInt();
    
    boolean invalido = true;
    int numInicio , numFinal;
    
    do {
    	System.out.println("Entre com o inicio da tabuada :");
         numInicio = sc.nextInt();
        
        System.out.println("Entre com o final da tabuada :");
         numFinal = sc.nextInt();
        
        if (numFinal > numInicio) {
        	invalido = false;
        }
    }
    while(invalido);
    

	System.out.println("Tabuada de" + num + ":");
	System.out.println("Come�ar por" + numInicio );
	System.out.println("Terminar em" + numFinal);
	System.out.println();
	
	for(int  i=numInicio ; i <=numFinal; i++) {
		System.out.println( num + " x " + i + " = " + (num*i));
		}
	
    
    
	
	

	}

}
