package br.com.imd.aula6;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int quant = 0;
		String nomes[];
		String telefones[];
		
		System.out.println("\t### Cadastro de Cliente ###");
		System.out.println("Digite a quantidade de clientes que deseja cadastrar: ");
		quant = leia.nextInt();
		String solicitacao = String.format("Você solicitou o cadastro de %d pessoas.", quant);
		System.out.println(solicitacao);
		nomes = new String[quant];
		telefones = new String[quant];
		
		int count = 1;
		while (count != 0) {
			System.out.print("Escolha a operação que deseja fazer: \n1)Cadastrar. \n2)Consultar. \n>");
			int op = leia.nextInt();
			switch (op) {
			case 1:
				System.out.println("### Insira os dados ###");
				for (int i = 0; i < quant; i++) {
					System.out.println("+-++-++-++-++-++-++-++-+");
					System.out.print("Nome: ");
					String nome = leia.next();
					System.out.print("Telefone: ");
					String telefone = leia.next();
					nomes[i] = nome;
					telefones[i] = telefone;
				}
				break;
			case 2:	
				String output = "sair";		
				do{
				System.out.print("### Digite o nome que deseja buscar: ### \n>");
				output = leia.next();		
					for (int i = 0; i < nomes.length; i++) {
						if (nomes[i].equals(output)) {
							System.out.println("Resultado encontrado na posição " + i + ": " + "(Nome: "+ nomes[i] + " - " + "Tel: " +telefones[i] + ")");
						}else if (output.equals("sair")) {
							System.out.println("Consulta finalizada!");
							break;
						}else {
							System.out.println("Não encontrado na posição " + i);
						}
					}									
				} while (!output.equals("sair"));				
				break;

			default:
				System.out.println("Opção inválida! Tente novamente!");
				break;
			}	
			count++;
		}	

	}

}
