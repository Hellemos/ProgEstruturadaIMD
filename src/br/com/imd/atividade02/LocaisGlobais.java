package br.com.imd.atividade02;

public class LocaisGlobais {
	static int variavel = 10;
	public static void main(String[] args) {
		System.out.println(variavel);
		if(variavel == 10){
			int variavel = 30;
			System.out.println(variavel);
			int a = 6 + 2 * (5 + 3);
			System.out.println(a);
		}
		System.out.println(variavel);
	}

}
