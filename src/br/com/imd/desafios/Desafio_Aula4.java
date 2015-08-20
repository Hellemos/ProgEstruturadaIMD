package br.com.imd.desafios;

import java.util.Scanner;

public class Desafio_Aula4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\t*** Seja bem vindo a Calculadora Agora vai! ***");
		
		System.out.print("*** Entre com os valores: ****");
		System.out.print("\nPrimeiro valor: ");
		int valor1 = leia.nextInt();
		
		System.out.print("Segundo valor: ");
		int valor2 = leia.nextInt();
		
		System.out.print("- Escolha a operação que deseja fazer: \n1)Adição \n2)Subtração \n3)Multiplicação \n4)Divisão \n5)Potenciação \n0)Sair \n>");
		int op = leia.nextInt();
		switch (op) {
		case 1:
			int somar = valor1 + valor2;
			System.out.println("Resultado: " + somar);
			break;
		case 2:
			int subtracao = valor1 - valor2;
			System.out.println("Resultado: " + subtracao);
			break;
		case 3:
			int multiplicacao = valor1 * valor2;
			System.out.println("Resultado: " + multiplicacao);
			break;
		case 4:
			double divisao = valor1 / valor2;
			System.out.println("Resultado: " + divisao);
			break;
		case 5:
			double potenciacao = Math.pow(valor1, valor2);
			System.out.println("Resultado: " + potenciacao);
			break;
		case 0:
			System.out.println("Obrigado por utiliar nossos serviços! Volte sempre!");
			break;
		default:
			System.out.println("Está opção não existe, tente novamente!");
			break;
		}
	}

}
