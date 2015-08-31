package br.com.imd.atividade09;

import java.util.Scanner;

/*Exercício 2
Implemente em Java uma função soma(n), recursiva, que retorna a soma de todos os números
inteiros de 1 até n.*/

public class Q2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com um número: " );
		int numero = leia.nextInt();
		
		int s = soma(numero);
		System.out.println("Resultado: " + s);
	}
	
	/*somar números*/
	public static int soma(int n){
		int somar = 0;
		if(n == 0){
			System.out.println("O número não pode ser zero!");;
		}else{
			somar = n + soma(n - 1);
		}
		return somar;
	}

}
