package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4321.21;
		p1.desconto = 0.25;
		
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 5.00;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.2);
		
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("M�dia do carrinho = R$%.2f.", mediaCarrinho);
	}
}
