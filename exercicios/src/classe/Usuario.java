package classe;

public class Usuario {

	
	String nome;
	String email;
	
	
	public boolean equals(Object objeto) {		
		if(objeto instanceof Usuario) {
			// estamos usando CAST para converter um objeto qualquer em um objeto do tipo Usuario
			Usuario outro = (Usuario) objeto;
			
			//Estamos usando equals para comparar o valor do objeto com a instancia
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return this.nome.length();
	}
}
