package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		// dISCUSSÃO INICIAL SOBRE EXCESSÕES
		//uMA EXCESSÃO é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução
		// Em java , uma exceção é um objeto herdado da classe:]
		// Java.lang.exception - o compilador obriga a tratar ou propagar
		// jaca.lang.RuntimeException - o compilador não obriga a tratar ou propagar
		// Quando lançada , uma excessão é propagada na pilha de chamadas de métodos em execução, até que seja capturada )tratada
		// ou o programa seja encerrado
		// Hierarquida de exceções do java


		// --> Throwable 
		//    | |- > Error - OutOfMemory
		//    |			    |- VirtualMachineError
		//    |- Exception
		//       |- IoException
		//       |- RuntimeException
				//  |- IndexOutOfBoundsException
				//	|- NullPointerException

		// pra que excessões ?
		// o modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas
		// Vantagens
		// Delega a lógica do erro para a classe responsável por conhecer as regras  que podem ocasionar o erro
		// trata de forma organizada ( inclusive hierarquica ) exceções de tipos diferentes 
		// A exceção pode carregar dados quaisquer
		
		
		
		// Estrutura try-catch

		// Bloco try 
		// Contem codigo que representa a execução normal do trecho de código que pode acarretar em uma exceção 
		// Bloco Catch
		// contem o código a ser executado caso uma excessão ocorra 
		// Deve ser específicado o tipo da exceção a ser tratada ( upcasting é permitido)
		//Demo
		try {
			
		} catch (Exception e) {
			// se acontecer uma exceção do tipo "e"
		};
		// em cada bloco catch eu pego o  tipo de exceção
		//Exemplo:
		// 	Scanner sc = new Scanner(System.in);
		// try {
		// 	String[] vect = sc.nextLine().split(" ");
		// 	int position = sc.nextInt();
		// 	System.out.println(vect[position]);
		// } catch (ArrayIndexOutOfBoundsException e) {
		// 	System.out.println("Invalid Position");
		// }catch (InputMismatchException e){
		// 	System.out.println("Input error");
		// }
		// sc.close(); 

		//Exemplo2 =>
		method1();
		System.out.println("End Program");




		// Bloco Finally
		// é um bloco que contem código a ser executado independentemente de ter ocorrido ou não uma exceção
		// exemplo classico : fechar um arquivo, conexão de banco de dados , ou outro recurso específico ao final do processamento
		//Sintaxe:
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

		};


		//sugestao de pacotes model
		// Model
		// | --  entities
		// | -- enums
		// | -- exception
		// | -- services
		
		// tipos de solução de execução
		// solução 1 => muito ruim => lógica de validação no programa principal
		// solução 2 => Ruim => método retornando String
		// solução 3 => Boa => tratamento de exceções

		//exercicio de fixação

		


	}
	public static void method1() {
		System.out.println("*** METHOD1 START ***");
		metod2();
		System.out.println("METHOD1 END");
	}
	public static void metod2() {
		System.out.println("***METHOD 2 START ****");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
			e.printStackTrace();
			sc.next();
		}catch (InputMismatchException e){
			System.out.println("Input error");
		}
		sc.close(); 
	}
}
