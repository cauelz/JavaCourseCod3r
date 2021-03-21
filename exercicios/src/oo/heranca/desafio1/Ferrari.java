package oo.heranca.desafio1;

public class Ferrari extends Carro {

	Ferrari() {
		this(315);
	}
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	
//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
//	
	@Override
	void frear() {
		velocidadeAtual -= 15;
	}
}
