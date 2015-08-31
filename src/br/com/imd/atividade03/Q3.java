package br.com.imd.atividade03;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com um número inteiro: ");
		int numero = leia.nextInt();

		System.out.println("Entre com um número real nesta formatação 0,0: ");
		double valor = leia.nextDouble();

		System.out.println("Entre com um nome: ");
		String nome = leia.next();
		
		System.out.println("Numero: " + numero + "\nValor: " + valor
				+ "\nNome: " + nome + "\n");
		System.out.print("Numero:" + numero + " " + "Valor:" + valor + " " + "Nome:"
				+ nome);
	}
}
