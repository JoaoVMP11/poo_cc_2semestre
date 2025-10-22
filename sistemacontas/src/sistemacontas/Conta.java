package sistemacontas;

public abstract class Conta {
	
	private String numero;
	//abaixo segue um exemplo de agregaçao
	private Pessoa titular; //mesmo o tipo sendo pessoa (que é concreta), tambem pode ser PessoaComplexa por conta do polimorfismo e o uso do extends na classe PessoaComplexa
	private double saldo;
	
	private String agencia;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Pessoa getTitular() {
		return titular;
	}
	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public void depositar(double valor) {
		
		this.saldo+=valor;
	}
	
	public void sacar(double valor) {
		
		this.saldo-=valor;
	}
	
	public abstract double calcularSaldoFinal();
	
	
	

}
