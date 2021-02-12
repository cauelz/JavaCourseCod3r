package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		// Scanner entrada = new Scanner(System.in);
		
		// byte
		Byte b = 100;
		Short s = 1000;
		
		// Integer i = Integer.parseInt(entrada.next()); //int
		Integer i = 1000;
		Long l = 10000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l/3);
		//entrada.close();
		
		// Float
		Float f = 123.0f;
		System.out.println(f);
		
		// Double
		Double d = 1234.1234;
		System.out.println(d);
		
		// Boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char 
		System.out.println(c + "...");
	}
}
