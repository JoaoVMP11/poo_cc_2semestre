package sistemacontas;

import java.util.ArrayList;

public class ContaPoupanca extends Conta{
	
	/*heranca: herda atributos e metodos (de maneira geral), mas nao herda construtores*/
	
	private int anivesarioConta;
	private ArrayList<Double> historicoRendimento = new ArrayList<Double>(); 

	public int getAnivesarioConta() {
		return anivesarioConta;
	}

	public void setAnivesarioConta(int anivesarioConta) {
		this.anivesarioConta = anivesarioConta;
		}

	public ArrayList<Double> getHistoricoRendimento() {
		return historicoRendimento;
	}

	public void setHistoricoRendimento(ArrayList<Double> historicoRendimento) {
		this.historicoRendimento = historicoRendimento;
	}
	
	// Override pelo mesmo motivo do anterior
	@Override
	public double calcularSaldoFinal() {

		return this.getSaldo()*1.02;
	}
	
	public void titularBeneficio(){
		System.out.println("beneficio padrao");
	}

	public void titularBeneficio(String complexidade){
		System.out.println("beneficio que recebeu string");
	}

}
