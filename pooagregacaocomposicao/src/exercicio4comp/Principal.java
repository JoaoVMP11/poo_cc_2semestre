package exercicio4comp;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.setNome("amaciante");
		p1.setPreco(32.2);
		
		Produto p2 = new Produto();
		p2.setNome("sabao em po");
		p2.setPreco(16.99);
		
		
		ItemPedido ip1 = new ItemPedido(p1, 3);
		ItemPedido ip2 = new ItemPedido(p2, 2);
		
		ArrayList<ItemPedido> pe1ItemPedido = new ArrayList<ItemPedido>();
		pe1ItemPedido.add(ip1);
		
		Pedido pe1= new Pedido(1, pe1ItemPedido);
		
		pe1.addItemPedido(ip2);
		
		System.out.println(pe1.getItempedido().get(0).getProduto().getNome() +" "+ pe1.getItempedido().get(0).subtotal()+
				" "+pe1.getItempedido().get(1).getProduto().getNome() + " "+ pe1.getItempedido().get(1).subtotal() +" "+ pe1.total());
	}
}
