package exer13;

import java.util.Locale;
import java.util.Scanner;

public class exer13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);

	double vHora, hTrab, sLiquido,sBruto;
	double ir,sind, inns;
	
	 System.out.println("Entre com valor da sua hora trabalhada:");
	 vHora =sc.nextDouble();
	 System.out.println("Entre com total de horas trabalhadas no mês:");
	 hTrab =sc.nextDouble();
	 
	 sBruto = (vHora*hTrab);
	 
	 ir =0.11;
	 sind =0.05;
	 inns= 0.08;
	
	 sLiquido=(sBruto-ir-sind-inns);
	 
	 System.out.println("O salário liquido deste colaborador é:" +sLiquido);
	 
	}

}
