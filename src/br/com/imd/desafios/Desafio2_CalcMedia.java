package br.com.imd.desafios;

import java.util.Scanner;

public class Desafio2_CalcMedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com a nota 1: ");
		double nota1 = ler.nextDouble();

		System.out.println("Entre com a nota 2: ");
		double nota2 = ler.nextDouble();

		System.out.println("Entre com a nota 3: ");
		double nota3 = ler.nextDouble();

		double result_media = (nota1 * 4 + nota2 * 5 + nota3 * 6) / 15;

		if (result_media >= 7.0) {
			System.out.println("Aprovado!");
		} else if (result_media < 3.0) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Você está na recuperação!");
		}
	}
}
