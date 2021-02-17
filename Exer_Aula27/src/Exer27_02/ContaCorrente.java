package Exer27_02;

public class ContaCorrente {
	
	int numero;
	int ag;
	int digito;
	double  saldo;
	double limiteEspecial;
	boolean especial;
	double valorEspecialUsado;
	
	
	
	boolean realizarSaque( double quantiaSacar) {
		 if( saldo >= quantiaSacar) {
			 saldo -=quantiaSacar;
			 return true;
		 }else {
			 if(especial) {
				 double limite  = limiteEspecial + saldo;
				 if(limite >=quantiaSacar) {
					 saldo -= quantiaSacar;
					 return true;
				 }else {
					 return false;
				 }
 
				 
			 }else {
				 return false;
			 }
		 }
	
	  }
	
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + saldo);
		
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}

   }
	
	
	
	
	
	
	

