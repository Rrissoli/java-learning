package application;

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

		
	}
}
