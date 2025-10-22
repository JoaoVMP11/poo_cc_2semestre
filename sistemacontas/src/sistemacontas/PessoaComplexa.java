package sistemacontas;

public class PessoaComplexa extends Pessoa {

	private String complexidade;
	
	public PessoaComplexa(String nome, String cpf, String sexo, String complexidade) {
		super(nome, cpf, sexo); // outro uso do super: referenciar construtor da classe pai (é override)
		this.setComplexidade(complexidade);

	}

	public String getComplexidade() {
		return complexidade;
	}

	public void setComplexidade(String complexidade) {
		this.complexidade = complexidade;
	}

	//teste do super chamando metodo original da classe pai (override)
	public void pessoaNormal() {
		System.out.println("faz complexidades");
		super.pessoaNormal();
	}
	
}
