package lanchonete;

import java.util.Scanner;

public class Menu {
	
	private int opcao; //para o usuário digitar a opção
	private int opcao2; //para o usuário digitar 1 ou 0
	
	private Dinheiro d = new Dinheiro(); //para valores acumulados
	double acumulado;
	//métodos
	
	//MENU
	public void exibirMenu() {  
		System.out.println("Bem vindo(a) a lanchonete Empire");
		System.out.println("#################Cardápio###################");
		System.out.println("| CÓDIGO |       DESCRIÇÃO       |  VALOR  |");
		System.out.println("|   100  |    Cachorro Quente    |   9,00  |");
		System.out.println("|   101  | Cachorro Quente Duplo |  11,00  |");
		System.out.println("|   102  |         X-Egg         |  12,00  |");
		System.out.println("|   103  |       X-Salada        |  12,00  |");
		System.out.println("|   104  |       X-Bacon         |  14,00  |");
		System.out.println("|   105  |        X-Tudo         |  17,00  |");
		System.out.println("|   200  |   Refrigerante Lata   |   5,00  |");
		System.out.println("|   201  |       Chá Gelado      |   4,00  |");
		System.out.println("############################################");
		System.out.println("Digite o código do seu pedido: ");
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			opcao = teclado.nextInt();
			itensMenu(); // chama o método 
			
		}
		
		catch (Exception e){
			System.out.println("Opção inválida. Por favor digite um código válido");
			exibirMenu();
		}
	}
	
	//Itens do menu
	public void itensMenu() {
		
			switch (opcao){
				case 100:
					System.out.println("Você pediu um Cachorro Quente no valor de 9,00 reais");
					acumulado = d.acumulador1();
					//System.out.println("acumulado: " + acumulado + " reais");
					pedirMais();
					break;
				case 101:
					System.out.println("Você pediu um Cachorro Quente Duplo no valor de 11,00 reais");
					acumulado = d.acumulador2();
					//System.out.println("acumulado: " + acumulado + " reais");
					pedirMais();
					break;
				case 102:
					System.out.println("Você pediu um X-Egg no valor de 12,00 reais");
					acumulado = d.acumulador3();
					//System.out.println("acumulado: " + acumulado + " reais");
					pedirMais();
					break;
				case 103:
					System.out.println("Você pediu um X-Salada no valor de 12,00 reais");
					acumulado = d.acumulador3();
					//System.out.println("acumulado: " + acumulado + " reais");
					pedirMais();
					break;
				case 104:
					System.out.println("Você pediu um X-Bacon no valor de 14,00 reais");
					acumulado = d.acumulador4();
					//System.out.println("acumulado: " + acumulado + " reais");
					pedirMais();
					break;
				case 105:
					System.out.println("Você pediu um X-Tudo no valor de 17,00 reais");
					acumulado = d.acumulador5();
					//System.out.println("acumulado: " + acumulado + " reais");
					pedirMais();
					break;
				case 200:
					System.out.println("Você pediu um Refrigerante Lata no valor de 5,00 reais");
					acumulado = d.acumulador6();
					//System.out.println("acumulado: " + acumulado + " reais");
					pedirMais();
					break;
				case 201:
					System.out.println("Você pediu um Chá Gelado no valor de 4,00 reais");
					acumulado = d.acumulador7();
					//System.out.println("acumulado: " + acumulado + " reais");
					pedirMais();
					break;
				default: //em caso de erro de digitação
					System.out.println("Opção inválida. Por favor digite um código válido");
					exibirMenu();
			
			}
		
	}
	
	//Método para pedir mais coisas
	public void pedirMais() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Deseja pedir mais alguma coisa?\n 1 - sim \n 0 - não");
		
		try {
			opcao2 = teclado.nextInt();
			if (opcao2 == 1) {
				exibirMenu();
				}
			else if (opcao2 == 0) {
				System.out.printf("O total é R$ %.2f" , this.acumulado);
				System.out.printf("\n");
				System.out.println("Volte sempre!");
				
			}
			else {
				System.out.println("Opção inválida. Por favor, digite 0 ou 1");
				this.pedirMais();
				}
		}
		catch (Exception e) { //em caso de erro de digitação
			System.out.println("Opção inválida. Por favor, digite 0 ou 1");
			this.pedirMais();
		}
		}
	
	
	
}
