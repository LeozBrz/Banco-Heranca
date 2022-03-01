package entidade;

public class ContaComercial extends Conta{

	private Double limEmprestimo;
	
	public ContaComercial() {
		super();
	}

	public ContaComercial(int num, String titular, Double saldo, Double limEmprestimo) {
		super(num, titular, saldo);
		this.limEmprestimo = limEmprestimo;
	}

	public Double getLimEmprestimo() {
		return limEmprestimo;
	}

	public void setLimEmprestimo(Double limEmprestimo) {
		this.limEmprestimo = limEmprestimo;
	}
	
	public void emprestimo(Double qtd) {
		if (qtd <= limEmprestimo) {
		saldo += qtd - 10.00;
		}
	}
}