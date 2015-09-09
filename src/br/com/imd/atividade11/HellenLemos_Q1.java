package br.com.imd.atividade11;

import java.util.Scanner;

/*Exercício 1
Criar uma função chamada “int numeroProximo(int n, int variacao)” que gera um número
aleatório “próximo” de “n”, podendo ser maior ou menor, porém a diferença entre o novo
número e “n” não pode exceder o valor de “variação”.*/

public class HellenLemos_Q1 {

	public static void main(String[] args) {	
		Scanner leia = new Scanner(System.in);	
	
		System.out.println("Digite os numeros para n e para variação: ");
		int n;
		int variacao;
		System.out.println(numeroProximo(n = leia.nextInt(), variacao = leia.nextInt()));

	}
	
	public static int numeroProximo(int n, int variacao){
		//gerando número aleatório e guardando em valor
		int valor = (int)Math.round(Math.random());
		//System.out.println("valor " + valor);
		int result = valor - n;
		//System.out.println("Resultado : " +result);
		if(result > variacao){
			System.out.println("A diferença entre o novo número e “n” não pode exceder o valor de “variação”");
		}
		return valor;
	}
}
