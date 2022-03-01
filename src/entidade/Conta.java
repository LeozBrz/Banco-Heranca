package entidade;

public class Conta {
	private int num;
	private String titular;
	protected Double saldo;
	
	public Conta() {
	}
	
	public Conta(int num, String titular, Double saldo) {
		super();
		this.num = num;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	public void saque(Double qtd) {
		this.saldo -= qtd;
	}
	
	public void deposito(Double qtd) {
		this.saldo += qtd;
	}
	
	
}
