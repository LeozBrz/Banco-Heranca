package aplicacao;

import entidade.Conta;
import entidade.ContaComercial;
import entidade.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {

		Conta conta = new Conta(1001, "Alexa", 0.0);
		Conta conta1 = new ContaComercial(1220,"Maria", 0.0, 500.00);
		Conta conta2 = new ContaPoupanca(1004,"Leonardo", 0.0, 0.01);
		
		//UPCASTING
		
		Conta conta3 = conta1; 
		Conta conta4 = new ContaComercial(1003, "Bob", 0.0, 200.00);
		
		//DOWNCASTING
		
		ContaComercial conta5 = (ContaComercial)conta3;
		conta5.deposito(100.0);
		
		//ContaComercial conta6 = (ContaComercial)conta;
	
		if (conta2 instanceof ContaComercial) {
			ContaComercial conta6 = (ContaComercial)conta2;
			conta6.deposito(200.00);
			System.out.println("Emprestimo!");
		}
		if (conta2 instanceof ContaPoupanca){
			ContaPoupanca conta6 = (ContaPoupanca)conta2;
			conta6.atualizarSaldo();
			System.out.println("Atualizado!");
		}
	
	}

}
