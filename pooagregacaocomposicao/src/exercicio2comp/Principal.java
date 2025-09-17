package exercicio2comp;

public class Principal {

	public static void main(String[] args) {
		Processador p1 = new Processador();
		p1.setMarca("intel");
		p1.setFrequencia(3200);
		
		MemoriaRAM m1 = new MemoriaRAM();
		m1.setTipo("ddr4");
		m1.setCapacidade(16);
		
		Computador c1 = new Computador(p1, m1);
		
		c1.exibirDetalhes();
	}
}
