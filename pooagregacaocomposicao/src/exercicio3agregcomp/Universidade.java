package exercicio3agregcomp;

public class Universidade {
	
	private String nome;
	private int anoFundacao;
	private Departamento departamento;
	
	public Universidade (String nome, int anoFundacao, Departamento departamento) {
		
		this.nome = nome;
		this.anoFundacao = anoFundacao;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	

}
