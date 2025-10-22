package sistemacontas;

public class ContaCorrente extends Conta {

	private double limiteChequeEspecial;

	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
/*Override pois implementa um método específico com base no método da superclasse*/
	@Override
	public double calcularSaldoFinal() {

		return this.getSaldo() + 15;
	}

	
	
}
