package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Transacao;
import services.GerenciadorFinanceiro;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		GerenciadorFinanceiro gerenciador = new GerenciadorFinanceiro();

		
		int opcao;

		do {
			
		
            System.out.println("\n=== SISTEMA FINANCEIRO ===");
            System.out.println("1 - Cadastrar Transação");
            System.out.println("2 - Listar Transações");
            System.out.println("3 - Ver Saldo");
            System.out.println("4 - Total de Receita");
            System.out.println("5 - Total de Despesa");
            System.out.println("6 - Buscar por Categoria");
            System.out.println("7 - Remover Transação");
            System.out.println("0 - Sair");
            
            System.out.print("Escolha uma opção");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao) {
            
            
            case 1:
            	
            	System.out.println("\n=== CADASTRO DE TRANSAÇÃO ===");
              
            	System.out.print("Descrição: ");
            	String descricao = sc.nextLine();
            	
            	
            	System.out.print("Valor: ");
            	double valor = sc.nextDouble();
            	sc.nextLine();
            	
            	
            	System.out.print("Tipo (RECEITA/DESPESA): ");
            	String tipo = sc.nextLine();
            	
            	System.out.print("Categoria: ");
            	String categoria = sc.nextLine();
            	
            	Transacao t = new Transacao(
            			descricao,
            			valor,
            			tipo,
            			categoria);
            	
            	
            	gerenciador.adicionarTransacao(t);
            			
            System.out.println("Transacao cadastrada com sucesso!");
   
            break;
            
            
            case 2:
            	
            	
            	System.out.println("\n=== LISTA DE TRANSAÇÕES ===");
                gerenciador.listarTransacoes();
            
                
                break;
                
            case 3:
            	
            	System.out.println("\n===  SALDO ===");
            	System.out.printf("R$ %.2f%n",
            			gerenciador.calcularSaldo());
            	
            	
            	break;
            	
            case 4:
            	System.out.println("\n===  Total Receitas ===");
            	System.out.printf("R$ %.2f%n",
            			gerenciador.totalReceitas());
            	
            	break;
            	
            case 5: 
            	System.out.println("\n===  Total Despesas ===");
            	System.out.printf("R$ %.2f%n" , 
            			gerenciador.totalDespesas());
                
            	break;
            	
            case 6:
            System.out.println("\n=== Buscar por Categoria ===");
            System.out.println("Digite a categoria: ");
            String categoriaBusca = sc.nextLine();
            
            gerenciador.buscarPorCategoria(categoriaBusca);
       
            
            break;
            
         case 7:
        	 System.out.println("\n=== Remover por Descrição ===");
        	 System.out.println("Digite a descrição : ");
        	 String removeD = sc.nextLine();
        	 
        	 gerenciador.removerPorDescricao(removeD);
        	 
        	 break;
            	
            
            
            case 0:
            
            System.out.println("Encerrando sistema...");
            
            
            break;
            
            default:
            	
            	System.out.println("Opção invalida");
            }

		}while(opcao !=0);
		
		sc.close();
		
	}
	
}


		
		
		