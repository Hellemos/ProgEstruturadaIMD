package br.com.imd.atividade10;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int matrizA[][] = new int[2][2];
		int matrizB[][] = new int[2][2];
		int matrizMult[][] = new int[2][2];
		
		//inserindo os elementos da matriz A
		System.out.println("Insira os elementos da matriz A: ");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {				
				matrizA[i][j] = leia.nextInt();
			}
		}
		
		//inserindo os elementos da matriz B
		System.out.println("Insira os elementos da matriz B: ");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {				
				matrizB[i][j] = leia.nextInt();
			}
		}
			
		//percorrendo a matriz multiplicação e inserindo os valores da multiplicação entre matriz A e B
		for (int i = 0; i < matrizMult.length; i++) {
			for (int j = 0; j < matrizMult.length; j++) {
				matrizMult[i][j] = matrizA[i][j] * matrizB[i][j];
				System.out.printf("matrizMult[%d][%d] = %d\n", i, j, matrizMult[i][j]);
			}
		}	

	}

}
