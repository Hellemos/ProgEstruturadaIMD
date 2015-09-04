package br.com.imd.atividade09;

import java.util.Scanner;

public class HellenLemos_Q1 {

	public static void main(String[] args) {
		/*Fatorial de um número*/
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja saber o fatorial: ");
		int numero = leia.nextInt();
		
		int fat_it =  fat_iterativo(numero);
		int fat_rec = fat_recursiva(numero);
		
		System.out.println("Resultado do fatorial na forma iterativa: " + fat_it);
		System.out.println("Resultado do fatorial na forma recursiva: " + fat_rec);
	
		//System.out.println(fat_recursiva(5));
		
	}
	
		
	/*Forma iterativa*/
	public static int fat_iterativo(int num){
		int fatorial_it;
		if(num < 0){
			fatorial_it = -1;
			System.out.println("Não existe fatorial para números negativos!");
		}else if(num == 0){
			fatorial_it = 1;
			System.out.println("O fatorial do número " +  num + " é: " + fatorial_it);
		}else{
			fatorial_it = 1;
			for (int i = 2; i <= num; i++) {
				fatorial_it *= i;
			}
		}
		return fatorial_it;
	}
	
	/*Forma recursiva*/
	public static int fat_recursiva(int num){
		int fatorial_rec;
		if(num < 0){
			fatorial_rec = -1;
		}else if(num == 0){
			fatorial_rec = 1;
		}else{
			fatorial_rec = num * fat_recursiva(num - 1);
		}
		return fatorial_rec;
	}

}
