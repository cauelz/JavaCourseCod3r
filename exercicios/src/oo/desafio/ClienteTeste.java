package oo.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Maria Julia");
		Compra compra1 = new Compra();
		
		compra1.adicionarItem("Caneta", 4.50, 10);
		compra1.adicionarItem(new Produto("Notebook", 3000.00), 1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 12.50, 14);
		compra2.adicionarItem(new Produto("Cadeira", 670.00), 1);
		
		cliente1.adicionarCompra(compra1);
		cliente1.compras.add(compra2);
		
		System.out.println(cliente1.obterValorTotal());
		
	}
}
