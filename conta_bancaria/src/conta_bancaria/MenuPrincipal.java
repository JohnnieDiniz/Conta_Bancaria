package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.util.Cores;

public class MenuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int opcao; 
		
		/* Instanciar Objetod da classe Conta */
		
		Conta c1 = new Conta(1,123, 1, "Isabela", 200000.00f);
		c1.visualizar();
		
		Conta c2 = new Conta(2,123, 2, "Thiago", 100000.00f);
		c2.visualizar();
		
		c1.setSaldo(300000.00f);
		c1.visualizar();
		
		/*
		 * if ternário 
		 * 
		 * condição ? ação se for verdadeiro : se for falso */
		
		System.out.println("\nSacar R$ 3000000,00 da conta C2: " + (c2.sacar(1000.00f) ?
							"Saque efetuado com Sucesso" : "Saldo insuficiente"));
		c2.visualizar();
		
		/* Deposito */
		
		c2.depositar(50000.00f);
		c2.visualizar();
		
		
		do {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("---------------------------------------------------------------");
			System.out.println("------------------------- BANCO DINIZ -------------------------");
			System.out.println("---------------------------------------------------------------");
			System.out.println("               1 - Criar Conta.                                ");
			System.out.println("               2 - Listar todas as contas.                     ");
			System.out.println("               3 - Buscar Contas por Números.                  ");
			System.out.println("               4 - Atualizar dados da conta.                   ");
			System.out.println("               5 - Apagar conta.                               ");
			System.out.println("               6 - Sacar.                                      ");
			System.out.println("               7 - Depositar.                                  ");
			System.out.println("               8 - Transferir valores entre conta.             ");
			System.out.println("               9 - Sair da operação.                           ");
			System.out.println("_______________________________________________________________");
			System.out.println(" Ente com a opção desejada:                                    ");
			System.out.println("                                                               " + Cores.TEXT_RESET);
			opcao = leia.nextInt();
			
			switch (opcao) {
				case 1:
					leia.nextLine();
					System.out.print(" ---- Criar conta ----");
					break;
				case 2:
					leia.nextLine();
					System.out.print(" ---- Listar todas as contas ----");
					break;
				case 3:
					leia.nextLine();
					System.out.print(" ---- Buscar Contas por Números ----");
					break;
				case 4:
					leia.nextLine();
					System.out.print(" ---- Criar conta ----");
					break;
				case 5:
					leia.nextLine();
					System.out.print(" ---- Criar conta ----");
					break;
				case 6:
					leia.nextLine();
					System.out.print(" ---- Criar conta ----");
					break;
				case 7:
					leia.nextLine();
					System.out.print(" ---- Criar conta ----");
					break;
				case 8:
					leia.nextLine();
					System.out.print(" ---- Criar conta ----");
					break;
				case 9:
					leia.nextLine();
					System.out.print(" ---- Criar conta ----");
					System.out.println("Você saiu do programa! \n\nVolte sempre." );
					break;
					default:
						System.out.println("Opção Iválida!");
		}
			
		} while (opcao !=9);
	
		
		leia.close();

	}

}
