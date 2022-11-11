package curso;


import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[]args) {
	
		// Scanner sc = new Scanner(System.in);
		
		// double largura = sc.nextDouble();
		// double comprimento = sc.nextDouble();
		// double metroQuadrado = sc.nextDouble();

		// double area = largura * comprimento;
		// double preco = area * metroQuadrado;
		// System.out.printf("AREA = %.2f%n", area);
		// System.out.printf("PRECO = %.2f%n", preco);
		// sc.close();

		// Estrutura repetitiva WHILE
		// é uma estrutura de controle que repete um bloco de comandos enquanto uma condiçao for verdadeira
		// Quando usar? quando nçao se sabe previamente a quantidade de repetições que será realizada

		// Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		// int soma = 0;
		// while (num != 0) {
		// 	soma +=num;
		// 	num = sc.nextInt();
			
		// }
		// System.out.println(soma);
		// sc.close();
		//EXERCICIOS
		//ex1
		// Scanner sc = new Scanner(System.in);
		// int senha;
		// System.out.println("Coloque a senha:");
		// senha = sc.nextInt();
		// while (senha != 2002) {
		// 	System.out.println("senha invalida");
		// 	senha = sc.nextInt();
		// }
		// System.out.println("senha Correta");
		// sc.close();
        Scanner sc = new Scanner(System.in);
		// int x = sc.nextInt();
		// int y = sc.nextInt();
		
		// while (x != 0 && y != 0) {

		// 	if (x > 0 && y > 0) {
		// 		System.out.println("primeiro");
		// 	}
		// 	else if (x < 0 && y > 0) {
		// 		System.out.println("segundo");
		// 	}
		// 	else if (x < 0 && y < 0) {
		// 		System.out.println("terceiro");
		// 	}
		// 	else {
		// 		System.out.println("quarto");
		// 	}
		// 	x = sc.nextInt();
		// 	y = sc.nextInt();
		// }
		//ex2
		// int alcool = 0;
		// int gasolina = 0;
		// int diesel = 0;
		// int entrada = sc.nextInt();
		// while (entrada < 4 && entrada > 0) {
			
		// 	switch (entrada) {
		// 		case 1:
		// 		alcool += 1;	
		// 		case 2:
		// 		gasolina += 1;
		// 		case 3:
		// 		diesel += 1;
				
		// 		default:
		// 			break;
		// 	}
		// 	entrada = sc.nextInt();
		// }
		// 	System.out.printf("Alcool: %d %n Gasolina: %d %n Diesel: %d %n", alcool,gasolina,diesel);


		// 	sc.close();
		
		
		//estrutura repetitiva "para" 
		// É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores
		// quando usar? quando se sabe previamente a quantidade de repetições , ou o intervalo de cvalores
		// for(inicio; condicao; incremento){comando}
		// inicio só vai ser executado na primeira vez, condicao é verificada sempre e incremento é feito sempre também

		// int numero = sc.nextInt();
		// int soma = 0;
		// for(int i = 0; i <4; i++){
		// 	int x = sc.nextInt();
		// 	soma = soma + x;
		// }
		// System.out.println(soma);
		
		// sc.close();

		// EXERCícios
		//ex1

		// int x = sc.nextInt();
		// for (int i = 1; i < x; i+=2) {
		// 	System.out.println(i);
		// }

		//ex2

		// int N = sc.nextInt();
		// for (int i = 1; i <= N; i++) {
		// 	int primeiro = i;
		// 	int segundo = i * i;
		// 	int terceiro = i* i *i;
		// 	System.out.printf("%d %d %d %n", primeiro, segundo, terceiro);
		// }

		//ex3

		// int N = sc.nextInt();
		// int fat = 1;
		// for (int i = 1; i <= N; i++) {
		// 	fat = fat * i;		
		// }
		// System.out.println(fat);
		
		//ex4

		//  int N = sc.nextInt();
		//  double primeira,segundo,terceiro;
		//  double media= 0.00;
		//  primeira = sc.nextDouble();
		//  segundo = sc.nextDouble();
		//  terceiro = sc.nextDouble();
		// for (int i = 0; i < N; i++) {
		// 	media = (primeira * 2)+(segundo * 3)+(terceiro * 5)/N;
			
		// }
		// System.out.printf("%.1f %n", media);
		

		//Estrutura do-while
		//menos utilizada, mas em alguns casos se encaixa melhor ao problema
		// O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.
		// 	char resp;
		// do {System.out.println("Digite a temperatura em Celsius:");
		// double C = sc.nextDouble();
		// double F = 9.0 * C / 5.0 + 32.00;
		// System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		// System.out.println("deseja Repetir:?");
		// resp = sc.next().charAt(0);} while(resp != 'n');
		// sc.close();

		// outros topicos sobre o java 
		

		//Restrições e conveçoes para nomes
		// não pode começar com dígito: use uma letra ou _
		// não usar acentos ou til
		// nao pode ter espaços em branco
		// sugestao : use nomes que tenham significado
		

		//Funções interessantes para strings 
		// Formatar: toLowerCase(), toUpperCase(), trim()
		// Recortar: substring(inicio), substring(inicio, fim)
		// substituir: Replace(char,char), Replace(string,string)
		// Buscar: IndexOf, LastIndexOf
		// str.split(" ")

		// funcoes (sitaxe)
		////representam um processamento que possui um significado
		// ex : Math.sqrt(double)

		//principais vantagens 
		// modularização , delegação e reaproveitamento
		// dados de entrada e saida 
		// funcoes podem receber dados de entrada
		// funcoes podem ou nao retornar algo
		// em orientação a obj , as fun recebem nome de metodos

		// criando funcoes

		


	}
		public static int max(int x,int z,int u){
			int aux;
			if(x > u && x>z){
				aux = z;

			} else if (u > z){
				aux = u;
			}
			else{
				aux = z;
			}
			return aux;
		}
		public static void showResult(int value){
			System.out.println("higher" + value);
			
		}
	}

	
	

