package oo.heranca.teste;

import oo.heranca.desafio1.Carro;
import oo.heranca.desafio1.Civic;
import oo.heranca.desafio1.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro civic = new Civic();
		
		civic.acelerar();
		System.out.println(civic.toString());
		civic.acelerar();
		System.out.println(civic.toString());
		civic.acelerar();
		System.out.println(civic.toString());
		
		System.out.println();
		System.out.println("velocidades da Ferrari");
		Ferrari ferrari = new Ferrari(400);
		ferrari.acelerar();
		System.out.println(ferrari.toString());
		ferrari.acelerar();
		System.out.println(ferrari.toString());
		ferrari.acelerar();
		System.out.println(ferrari.toString());
		ferrari.frear();
		System.out.println(ferrari.toString());
	}
}
