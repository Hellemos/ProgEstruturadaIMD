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
			System.out.print("Digite 1 para cadastrar. \n>");
			int op = leia.nextInt();
			switch (op) {
			case 1:
				System.out.println("### Insira os dados ###");					
				for (int i = 0; i < quant; i++) {
					System.out.println("+-++-++-++-++-++-++-++-+");
					System.out.print("Nome: ");
					nomes[i] = leia.next();
					leia.nextLine();
					System.out.print("Telefone: ");
					telefones[i] = leia.next();
					leia.nextLine();
				
				}	
				System.out.println("### Consulta ###");
				String output = "";					
				do{
				System.out.print("### Digite o nome que deseja buscar: ### \n>");
				output = leia.next();	
				leia.nextLine();
					for (int i = 0; i < nomes.length; i++) {
						if (output.equals(nomes[i])) {
							System.out.println("Resultado encontrado na posição " + i + ": " + "(Nome: "+ nomes[i] + " - " + "Tel: " +telefones[i] + ")");
						}else if (output.equals("sair")) {
							System.out.println("*** Consulta finalizada! ***");
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
