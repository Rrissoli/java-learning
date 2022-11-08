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
		System.out.println("Bom Dia");
		if(h > 12 && h < 19){
		// se essa condição for falsa todo o bloco não vai ser executado, se for cerdadeira vai rodar
			System.out.println("Boa Tarde");	
		}
		else{
			//aqui vai ser executado se não entrar no de cima, ou seja se a condição do if for falsa , executa, se for verdadeira , não executa 
			System.out.println("Boa Noite");
		}
		





	}
		
	}

	
	

