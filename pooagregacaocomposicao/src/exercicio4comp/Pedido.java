package exercicio4comp;

public class Pedido {

	private ItemPedido itempedido;
	private int numero;
	
	public Pedido(int numero, ItemPedido itempedido) {
		
		this.numero= numero;
		this.itempedido= itempedido;
		
		
	}

	public double total (double ... subtotal) {
		double soma = 0;
		for (double preco : subtotal) {
			soma += preco;
		}
			return soma;
	}
	public ItemPedido getItempedido() {
		return itempedido;
	}

	public void setItempedido(ItemPedido itempedido) {
		this.itempedido = itempedido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
