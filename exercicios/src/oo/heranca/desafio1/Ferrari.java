package oo.heranca.desafio1;

public class Ferrari extends Carro {

	public Ferrari() {
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	
//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
//	
	
	// quando sobrescrevemos um metodos, n�s nao podemos diminuir o n�vel de visibilidade padr�o.
	@Override
	public void frear() {
		velocidadeAtual -= 15;
	}
}
