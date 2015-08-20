package br.com.imd.aula6;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de valores que serão informados: ");
		int quantidade = leia.nextInt();
		
		int vetor[] = new int[quantidade];	
		
		
		for (int i = 0; i < quantidade; i++) {
			int valor = leia.nextInt();
			vetor[i] = valor;	
		}
		
		System.out.println("*** Calculando a média dos elementos ***");
		int somar = 0;
		double calc_media = 0;
		for (int i = 0; i < vetor.length; i++) {
			somar += vetor[i];
			calc_media = somar / quantidade;
		}
		System.out.print("Resultado da média: " + calc_media + "\n");
		System.out.println();
		System.out.println("*** Resultado da diferença ***");
		int diferenca = 0;
		for (int i = 0; i < vetor.length - 1; i++) {
			diferenca = vetor[i] - vetor[i + 1];
			System.out.print(diferenca + " / ");
		}
	}

}
