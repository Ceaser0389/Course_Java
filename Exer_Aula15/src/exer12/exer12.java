package exer12;

import java.util.Locale;
import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);

	System.out.println("Entre com o valor/hora:");
	double valorHora =sc.nextDouble();
	
	System.out.println("Entre com as horas trabalhadas no mês:");
	double qtdHora =sc.nextDouble();
	
	double salBruto = qtdHora *valorHora;
	
	int percentualIR =0;
	
		if(salBruto <= 900.00) {
			percentualIR =0;
		}
		else if (salBruto >900.00 && salBruto <= 1500.00) {
			percentualIR =5;
		}
		else if (salBruto >2500) {
			percentualIR =20;
		}
	
	  double ir = (salBruto/100)*percentualIR;
	  double inss=(salBruto/100)*10;
	  double fgts=(salBruto/100)*11;
	  double totalDescontos = ir -inss;
	  double salLiquido = salBruto - totalDescontos;
	  
	  System.out.println("Salário Bruto:(" + valorHora + "-" +qtdHora+"):"+ salBruto);
	  System.out.println("(-)IR (" + percentualIR + "%):"+ ir);
	  System.out.println("(-)INSS (10%)):"+ inss);
	  System.out.println("(-)FGTS (11%)):"+ fgts);
	  System.out.println("Total de ddescontos:" +totalDescontos);
	  System.out.println("Salário Liquido" + salLiquido);
	
	}  

}
