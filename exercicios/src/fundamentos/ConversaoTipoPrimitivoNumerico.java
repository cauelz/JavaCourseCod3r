package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		//double a = 1.12345123123123123123; // conversão implicita
		double a = 1; // conversão implicita
		System.out.println(a);
		
		// float b = 1.0F;
		// veja que tivemos perda de valores
		float b = (float) 1.12345123123123123123; // explicita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
	}
}
