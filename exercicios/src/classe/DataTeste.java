package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.dia = 8;
		data1.mes = 11;
		data1.ano = 2020;
		
		Data data2 = new Data();
		data2.dia = 11;
		data2.mes = 8;
		data2.ano = 1932;
		
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
	}
}
