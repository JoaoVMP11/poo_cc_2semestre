package sistemacontas;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//uso do construtor da classe PessoaComplexa
		PessoaComplexa pc1 = new PessoaComplexa("jon", "99999999999", "masc", "muita complexidade");
		
		ContaPoupanca cp1 = new ContaPoupanca();
		cp1.setNumero("303");
		cp1.setTitular(pc1);
		cp1.setSaldo(4072.01);
		cp1.setAgencia("3878");
		cp1.setAnivesarioConta(11);
		
		//criacao da ArrayList de historico de taxas de rendimento
		
		ArrayList<Double> historicoTaxas = new ArrayList<Double>();
		historicoTaxas.add(1.014);
		historicoTaxas.add(1.017);
		
		cp1.setHistoricoRendimento(historicoTaxas);
		
		//teste do polimorfismo sobrecarga (overload) (mesmo nome e parametros diferentes)
		
		cp1.titularBeneficio();
		
		cp1.titularBeneficio("complex");
		
		System.out.println(cp1.calcularSaldoFinal());
		
		//teste do polimorfismo sobreposição / sobrescrita (override) (mesmo nome e mesmos parametros, mas classe filha muda compartamento da classe pai)
		//classe pai: Pessoa, classe filha: PessoaComplexa
		
		pc1.pessoaNormal();
		
		//acessando atributo de objeto que compoe classe
		
		System.out.println("nome da pessoa que tem a cp1: " + cp1.getTitular().getNome());
		
		
		
	}
}
