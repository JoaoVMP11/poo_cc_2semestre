package exercicio4comp;

import java.util.ArrayList;

public class Pedido {

	private ArrayList<ItemPedido> itempedido = new ArrayList<ItemPedido>();
	private int numero;
	
	public Pedido(int numero, ArrayList<ItemPedido> itempedido) {
		
		this.numero= numero;
		this.itempedido= itempedido;
		
		
	}
	
	public void addItemPedido(ItemPedido itempedido) {
		this.itempedido.add(itempedido);
	}

	public double total(){
		double soma = 0.0;
		for (ItemPedido itempedido : this.itempedido) {
			soma += itempedido.subtotal();
		}
			
		return soma;
	}
	

	public ArrayList<ItemPedido> getItempedido() {
		return itempedido;
	}

	public void setItempedido(ArrayList<ItemPedido> itempedido) {
		this.itempedido = itempedido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
