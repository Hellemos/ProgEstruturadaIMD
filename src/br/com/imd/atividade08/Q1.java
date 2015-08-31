package br.com.imd.atividade08;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double numero1, numero2; //recebe os números que serão digitados pelo usuário
		
		int contador = 0;
		while (contador < 10){
		/*Menu*/
		System.out.println("Escolha a operação que deseja fazer: \n1)Adição. \n2)Subtração. \n3)Multiplicação. \n4)Divisão.");
		int op = leia.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("**Entre com os números para realizar a operação**");
			System.out.println("Número 1: ");
			numero1 = leia.nextDouble();
			
			System.out.println("Número 2: ");
			numero2 = leia.nextDouble();			
			
			System.out.println("Resultado da adição: " + adicao(numero1, numero2));
			break;
			
		case 2: 
			System.out.println("**Entre com os números para realizar a operação**");
			System.out.println("Número 1: ");
			numero1 = leia.nextDouble();
			
			System.out.println("Número 2: ");
			numero2 = leia.nextDouble();			
			
			System.out.println("Resultado da subtracão: " + subtracao(numero1, numero2));
			break;
		case 3:
			System.out.println("**Entre com os números para realizar a operação**");
			System.out.println("Número 1: ");
			numero1 = leia.nextDouble();
			
			System.out.println("Número 2: ");
			numero2 = leia.nextDouble();			
			
			System.out.println("Resultado da multiplicacão: " + multiplicacao(numero1, numero2));
			break;
		
		case 4:
			System.out.println("**Entre com os números para realizar a operação**");
			System.out.println("Número 1: ");
			numero1 = leia.nextDouble();
			
			System.out.println("Número 2: ");
			numero2 = leia.nextDouble();			
			
			System.out.println("Resultado da divisão: " + divisao(numero1, numero2));
			break;

		default:
			System.out.println("Opção não encontrada!");
			break;
		}
	}

}
		
	
	/*Operação de adição*/
	public static double adicao(double num1, double num2){
		double somar;
		return somar = num1 + num2;
	}
	
	/*Operação de subtração*/
	public static double subtracao(double num1, double num2){
		double sub;
		return sub = num1 - num2;
	}
	
	/*Operação de multiplicação*/
	public static double multiplicacao(double num1, double num2){
		double mult;
		return mult = num1 * num2;
	}
	
	/*Operação de divisão*/
	public static double divisao(double num1, double num2){
		double div;
		if (num2 == 0) {
			System.out.println("O segundo número não pode ser zero!");
		}
		return div = num1 / num2;
	}
}
