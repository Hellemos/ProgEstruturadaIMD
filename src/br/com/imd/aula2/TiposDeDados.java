package br.com.imd.aula2;

public class TiposDeDados {

	public static void main(String[] args) {
		int numero = 10;
		float valor = 1.5f;
		char caractere = 'h';

		System.out.println("Inteiro: " + numero + "\nFloat: " + valor
				+ "\nCaracter: " + caractere + "\n");

		final int numeroConst = numero;
		final float valorConst = valor;
		final char caractereConst = caractere;

		System.out.println("Inteiro Const.: " + numeroConst
				+ "\nFloat Const.: " + valorConst + "\nCaracter Const.: "
				+ caractereConst);

	}

}
