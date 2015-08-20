package br.com.imd.aula6;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de cidades que serão inseridas: ");
		int quant = leia.nextInt();
		
		String cidades[][] = new String[quant][quant];
		
		System.out.println("Digite o nome da cidade: ");
		for (int i = 0; i < cidades.length; i++) {
			for (int j = 0; j < cidades.length; j++) {				
				cidades[i][j] = leia.next();
			}
		}
		
		System.out.println("## Listagem das cidades inseridas ##");
		for (int i = 0; i < cidades.length; i++) {			
			for (int j = 0; j < cidades.length; j++) {				
				System.out.printf("Cidades[%d][%d] = %s\n" , i, j, cidades[i][j]);
			}
		}
		
		String coordenada1 = "";
		System.out.println("## Distância entre as cidades! Digite as coordenadas da primeira cidade:  ##");
		System.out.print("Linha: ");
		int linha1 = leia.nextInt();
		System.out.print("Coluna: ");
		int coluna1 = leia.nextInt();
		for (int i = 0; i < cidades.length; i++) {
			for (int j = 0; j < cidades.length; j++) {
				coordenada1 = cidades[linha1][coluna1];
			}
		}
		
		String coordenada2 = "";
		System.out.println("## Digite as coordenadas da segunda cidade:  ##");
		System.out.print("Linha: ");
		int linha2 = leia.nextInt();
		System.out.print("Coluna: ");
		int coluna2 = leia.nextInt();
		for (int i = 0; i < cidades.length; i++) {
			for (int j = 0; j < cidades.length; j++) {
				coordenada2 = cidades[linha2][coluna2];
			}
		}
		System.out.printf("A distancia de %s(%d) para %s(%d) é de [%d][%d]", coordenada1, linha1, coordenada2, coluna2, linha1, coluna2);
	}

}
