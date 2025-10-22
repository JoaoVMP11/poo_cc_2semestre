package sistemacontas;

public class Pessoa {

	private String nome;
	private String cpf;
	private String sexo;
	
	//garante a obrigatoriedade de ter nome e cpf
	public Pessoa (String nome, String cpf){
		
		this.nome=nome;
		this.cpf=cpf;
	}
	
	public Pessoa (String nome, String cpf, String sexo){
		
		/*chama o primeiro construtor construido acima. Isso garante que os dois primeiros atributos sejam obrigatorios e o terceiro nao (devido a existencia do primeiro construtor). 
		  Não se enquadra como relação de composição / agregaçao pois se trata de atributos, e não de classes/ objetos.
		  */
		this(nome, cpf);
		
		this.sexo = sexo;
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void pessoaNormal() {
		System.out.println("faz normalidades");
	}
	
}
