package oo.desafio;

import java.util.ArrayList;

public class Item {

	final Produto produto;
	final int quantidade;
	ArrayList<Produto> produtos = new ArrayList<Produto>();

	Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
}

