package exercicio4comp;

public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.setNome("amaciante");
		p1.setPreco(32.2);
		
		ItemPedido ip1 = new ItemPedido(p1, 3);
		
		Pedido pe1= new Pedido(1, ip1);
		
		System.out.println(pe1.total(ip1.subtotal()));
	}
}
