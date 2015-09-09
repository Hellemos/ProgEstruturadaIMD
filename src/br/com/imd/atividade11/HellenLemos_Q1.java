package br.com.imd.atividade11;

import java.util.Scanner;

/*Exerc�cio 1
Criar uma fun��o chamada �int numeroProximo(int n, int variacao)� que gera um n�mero
aleat�rio �pr�ximo� de �n�, podendo ser maior ou menor, por�m a diferen�a entre o novo
n�mero e �n� n�o pode exceder o valor de �varia��o�.*/

public class HellenLemos_Q1 {

	public static void main(String[] args) {	
		Scanner leia = new Scanner(System.in);	
	
		System.out.println("Digite os numeros para n e para varia��o: ");
		int n;
		int variacao;
		System.out.println(numeroProximo(n = leia.nextInt(), variacao = leia.nextInt()));

	}
	
	public static int numeroProximo(int n, int variacao){
		//gerando n�mero aleat�rio e guardando em valor
		int valor = (int)Math.round(Math.random());
		//System.out.println("valor " + valor);
		int result = valor - n;
		//System.out.println("Resultado : " +result);
		if(result > variacao){
			System.out.println("A diferen�a entre o novo n�mero e �n� n�o pode exceder o valor de �varia��o�");
		}
		return valor;
	}
}
