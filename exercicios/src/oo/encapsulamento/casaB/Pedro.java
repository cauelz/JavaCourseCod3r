package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testeAcessos() {
		
		// Não precisa instanciar ANA, pois a classe Pedro já
		// esta herdando as informações da classe Ana
		// Ana mae = new Ana();
		 
		// System.out.println(segredo);
		// System.out.println(facoDentroDeCasa);
		 System.out.println(formaDeFalar);
		 System.out.println(todosSabem);
	}
}
