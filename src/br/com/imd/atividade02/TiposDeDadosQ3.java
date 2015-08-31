package br.com.imd.atividade02;

public class TiposDeDadosQ3 {

	public static void main(String[] args) {		
		int a = 0; //10, 5
		int b = 1; //2, 5
		int resultInteiro = a / b;
		int resultResto = a % b;
		
		if ((resultInteiro == resultResto) || (a == b)){
			System.out.println("SIM");
		}
	}
}
