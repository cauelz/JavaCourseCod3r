package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testeAcessos() {
		
		// N�o precisa instanciar ANA, pois a classe Pedro j�
		// esta herdando as informa��es da classe Ana
		// Ana mae = new Ana();
		 
		// System.out.println(segredo);
		// System.out.println(facoDentroDeCasa);
		 System.out.println(formaDeFalar);
		 System.out.println(todosSabem);
	}
}
