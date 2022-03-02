package entidade;

public class ContaPoupanca extends Conta {

	private Double juros;
	
	public ContaPoupanca() {
	}
	
	public ContaPoupanca(int num, String titular, Double saldo, Double juros) {
		super(num, titular, saldo);
		this.juros = juros;
	}

	public Double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * juros;
	}
	
	
}
