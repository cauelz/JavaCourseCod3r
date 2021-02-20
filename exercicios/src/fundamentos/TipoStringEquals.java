package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		
		/*
		 * String#equals takes Object as an argument and checks it is instance of String object or not. 
		 * If the argument object is String Object then it compares content character by character. 
		 * It returns true in case content of both string objects are same.*/
		System.out.println("2".contentEquals(s));
		
		/*
		 * String#contentEquals takes CharSequence interface as an argument. 
		 * CharSequence can be implements in 2 ways-by using i) String class or (ii) AbstractStringBuilder( parent class of StringBuffer, StringBuilder)*/
		System.out.println("2".equals(s));
		
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		
		System.out.println("2" == s2.trim()); // trim() elimina espaços em branco
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
		
//		In contentEquals() length is compared before any object instance check. If length is same then it checks argument object is instance of AbstractStringBuilder or not. If it is so(i.e. StringBuffer or StringBuilder ) then content is checked character by character. In case argument is an instance of String object then String#equals called from String#contentEquals.
//
//		So in short,
//
//		String#equals compares the content character by character in case argument is String object also. And String#contentEquals compares the content in case argument object implement CharSequence interface.
//
//		String#contentEquals is slower in case we compare two same length string content as String#contentEquals internally calls String#equals for String object.
//
//		In case we try to compare objects with difference content length (say "abc" with "abcd") then String#contentEquals is faster than String#equals. Because length is compared before any object instance checking.
	}
}
