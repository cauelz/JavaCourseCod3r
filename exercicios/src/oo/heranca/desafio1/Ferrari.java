package oo.heranca.desafio1;

public class Ferrari extends Carro {

	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
	
	@Override
	void frear() {
		velocidadeAtual -= 15;
	}
}
