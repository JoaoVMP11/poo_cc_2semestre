package exercicio2comp;

public class Computador {

	private Processador processador;
	private MemoriaRAM memoria;
	
	public Computador(Processador processador, MemoriaRAM memoria) {
		
		this.processador= processador;
		this.memoria= memoria;
	}
	
	public void exibirDetalhes() {
		System.out.println("marca e frequencia do processador, respectivamente: "+this.getProcessador().getMarca()+ " "+
				this.getProcessador().getFrequencia()+ "\ntipo e capacidade da memoria RAM, respectivamente: "+ this.getMemoria().getTipo() +" "+
				this.getMemoria().getCapacidade());
	}
	
	
	public Processador getProcessador() {
		return processador;
	}
	public void setProcessador(Processador processador) {
		this.processador = processador;
	}
	public MemoriaRAM getMemoria() {
		return memoria;
	}
	public void setMemoria(MemoriaRAM memoria) {
		this.memoria = memoria;
	}
	
	
}
