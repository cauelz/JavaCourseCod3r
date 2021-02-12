package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		int num2 = 1000;
		System.out.println(Integer.toString(num2).length());
		
		
		// também podemos converser numero em string com a concatenação
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
		
	}
}
