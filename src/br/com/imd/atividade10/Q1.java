package br.com.imd.atividade10;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int m[][] = new int[3][3];
		
		System.out.println("Insira os valores na matriz: ");
		//inserindo os elementos na matriz
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = leia.nextInt();
			}
		}
		
		System.out.println("Exibindo a matriz: ");
		//exibindo a matriz
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.printf("m[%d][%d] = %d\n", i, j, m[i][j]);
			}
		}
		
		
	}

}
