package br.com.imd.desafios;

import java.util.Scanner;

public class Desafio_Aula3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out
				.println("\t*** Calcular índice de Massa Corporal *** \n-Entre com os seus dados: ");

		System.out.print("Nome: ");
		String nomePaciente = leia.nextLine();

		System.out.print("Idade: ");
		int idade = leia.nextInt();

		System.out.print("Peso: ");
		double peso = leia.nextDouble();

		System.out.print("Altura: ");
		double altura = leia.nextDouble();

		double calc_IMC = peso / Math.pow(altura, 2);

		System.out.println("\n\t** Relatório ** " + "\nPaciente: "
				+ nomePaciente + "\nIdade: " + idade + "\nPeso: " + peso
				+ "\nAltura: " + altura + "\nIMC: " + calc_IMC);
	}

}
