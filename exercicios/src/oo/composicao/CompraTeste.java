package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem("Borracha", 12, 3.45);
		compra1.adicionarItem(new Item("Caderno", 2, 19.45));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		 double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		 System.out.println("O total é " + total);
	}
}
