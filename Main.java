package fila_supermercado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		FilaSupermercado fila = new FilaSupermercado();
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("1 - Adicionar pessoas a fila");
			System.out.println("2 - Exibir quantidade de pessoas dentro da fila");
			System.out.println("3 - Mandar pessoas para caixas disponiveis");
			System.out.println("0 - Sair");
			System.out.print("-> ");
			int opcao = input.nextInt();
			
			if (opcao == 0) {
				System.out.println("Até mais");
				break;
			} else if (opcao == 1) {
				System.out.println("Quantas pessoas entram na fila?");
				System.out.print("-> ");
				int pessoas = input.nextInt();
				
				int quantidade = 1;
				
				while (pessoas > 0) {
					fila.enqueue(quantidade);
					quantidade += 1;
					pessoas -= 1;
				}
			} else if (opcao == 2) {
				System.out.println("---------------------------------");
				System.out.println("A fila possui " + fila.size() + " pessoas.");
			} else if (opcao == 3) {
				System.out.println("Quantos caixas estão disponiveis?");
				System.out.print("-> ");
				Scanner caixas = new Scanner(System.in);
				int caixas_disponiveis = caixas.nextInt();
				
				for (int i = 0; i < caixas_disponiveis; i++) {
					if (fila.size() == 0) {
						break;
					}
					fila.dequeue();
				}
				System.out.println("---------------------------------");
				System.out.println("Pessoas enviadas para os caixas disponiveis.");
			} else {
				System.out.println("Opção inválida, por favor, insira uma opção válida");
			}
		}

	}

}
