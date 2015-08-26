package br.com.imd.aula6;

import java.util.Scanner;
/*
 * @autor: Hellen Lemos
 * 
 * */

public class Q2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int quant = 0;
		String nomes[];
		String telefones[];
		
		System.out.println("\t### Cadastro de Cliente ###");
		System.out.println("Digite a quantidade de clientes que deseja cadastrar: ");
		quant = leia.nextInt(); //ler a quantidade de clientes que serão cadastrados
		leia.nextLine();
		String solicitacao = String.format("Você solicitou o cadastro de %d pessoas.", quant);
		System.out.println(solicitacao);
		nomes = new String[quant]; // diz que o tamanho do vetor, vai ser o valor digitado pelo usuário para a quantidade de clientes cadastrados
		telefones = new String[quant];
	
		
		int count = 0;
		while (count < quant) {
			System.out.print("Escolha a opção que deseja fazer: \n1)Cadastrar. \n2)Consultar. \n0)Sair. \n>");
			int op = leia.nextInt(); //ler a opção que o usuário deseja fazer
			leia.nextLine();
			switch (op) {
			case 1:
				//Nesta seção o usuário entrará com os dados: Nome e telefone, após a inserção e leitura, os dados serão colocado nos vetores => nomes[] e telefones[]
				System.out.println("### Insira os dados ###");					
				for (int i = 0; i < quant; i++) {
					System.out.println("+-++-++-++-++-++-++-++-+");
					System.out.print("Nome: ");
					nomes[i] = leia.nextLine();
					System.out.print("Telefone: ");
					telefones[i] = leia.nextLine();				
				}					
				break;
			
			case 2:
				//Nesta seção o usuário fará a consulta para saber se o nome digitado está no vetor nomes[]
				System.out.println("### Consulta ###");
				String output = "";					
				do {
				System.out.print("### Digite o nome que deseja buscar: ### \n>");
				output = leia.nextLine();
					for (int i = 0; i < nomes.length; i++) {
						//caso o nome esteja, será retornado para o usuário o nome que ele buscou juntamente com o telefone
						if (output.equals(nomes[i])) {
							System.out.println("Resultado encontrado na posição " + i + ": " + "(Nome: "+ nomes[i] + " - " + "Tel: " +telefones[i] + ")");
							break;
						}else {
							//caso não esteja, uma mensagem de erro será apresentado ao usuário
							System.out.println("ERRO! Não encontrado na posição " + i);							
						}
					}
					//a consulta ficará sendo realizada até que ele digite "sair"
				} while (!output.equals("sair"));
				break;
			case 0:
				System.out.println("Bye!");
				break;

			default:
				System.out.println("Opção inválida! Tente novamente!");
				break;
			}	
			count++;
		}	

	}

}
