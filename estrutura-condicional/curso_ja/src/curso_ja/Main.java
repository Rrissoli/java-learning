package curso_ja;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
	
	//Expressões Comparativas
		// expressão resultado valor verdade
		//exemplo
		// 5>10 resultado falso
		// comparadores >,<,>=,<=,==
		// ou seja
		// x > 0 , verifico se x é maior que dois
		
		
		
		
		
		//Expressôes lógicas
		//Operadores 
		// && = "E"
		// || = "OU"
		// ! = "negação"
		// Ideia por tras do operador 'E', ideia de junção de condições , ou seja, todas as condições devem ser verdadeiras para obtermos verdade
		//exemplo x <= 20 && x <= 10, supondo que x = 5 , o resultado é verdadeiro
		//Ideia por tras do operador 'OU', a ideia é de pelo menos uma deve ser verdadeira , se uma for vedade a expressão é verdade
		// x == 10 || x > 10 , contando com x = 10 , a expressao é verdade
		// Ideia por tras do operador nao , ideia de negação da expressao
		// !x=10, ou seja não pode ser x = 10 , ele inverte a condição 
	
		//Estrutura Condicional
		// É uma estrutura de controle que permite defininir que um certo bloco de comandos somente será executado dependendo de uma condição
		// Composta if --> se essa condição for verdadeira --> Bloco 1
		//  		|else  --> se essa condição for falsa --> Bloco 2
//exemplo:	
		Scanner sc = new Scanner(System.in);
		System.out.println("quantas horas?");
		int h = sc.nextInt();
		// System.out.println("Bom Dia");
		// if(h > 12 && h < 19){
		// // se essa condição for falsa todo o bloco não vai ser executado, se for cerdadeira vai rodar
		// 	System.out.println("Boa Tarde");	
		// }
		// else{
		// 	//aqui vai ser executado se não entrar no de cima, ou seja se a condição do if for falsa , executa, se for verdadeira , não executa 
		// 	System.out.println("Boa Noite");
		// }
		
		//Vamos deixar mais complexo , com um encadeamento de estruturas condicionais, ou seja colocamos if junto a else
		// chamamos de else if
		// dessa maneira 
		if(h < 12){
			System.out.println("bom dia");
		}else if(12 <= h && h < 19){
			System.out.println("boa tarde");
		}else{
			System.out.println("boa noite");
		}

		// Operadores de operação cumulativa
		//Sem operdaor
		// int minutos = sc.nextInt();
		// double conta = 50;
		// if(minutos > 100){
		// 	conta = conta + (minutos - 100) * 200;
			
		// }
		// System.out.printf("Valor da conta %.2f %n", conta);

		// operadores
		// a+= b === a = a + b;
		// a-= b === a = a - b;
		// a*= b === a = a * b;
		// a/= b === a = a / b;
		// a%= b === a = a % b;
		//ou seja 
//COM OPERADOR
		 int minutos = sc.nextInt();
		 double conta = 50;
		 if(minutos > 100){
		 	conta += (minutos - 100) * 20;
			
		 }
		 System.out.printf("Valor da conta %.2f %n", conta);


	}
		
	}

	
	

