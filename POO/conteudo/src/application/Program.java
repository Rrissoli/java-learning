package application;

import java.util.Scanner;

import entities.Product;
import entities.Triangule;

public class Program {
	public static void main(String[] args) {
		
		
		/// MANEIRA SEM POP 
		
		
		// Scanner sc = new Scanner(System.in);
		// double xA, xB,xC, yA, yB, yC;
		// System.out.println("Enter the measures of triangule X:");
		// xA = sc.nextInt();
		// xB = sc.nextInt();
		// xC = sc.nextInt();
		// System.out.println("Enter the measures of triangule Y:");
		// yA = sc.nextInt();
		// yB = sc.nextInt();
		// yC = sc.nextInt();

		// double p = (xA + xB + xC)/2.0;
		// double areaX = Math.sqrt(p * (p -xA) * (p - xB) * (p-xB));
		// p = (yA + yB + yC)/2.0;
		// double areaY = Math.sqrt(p * (p -yA) * (p - yB) * (p-yB));


		// System.out.println("Triangule X area: " + areaX);
		// System.out.println("Triangule X area: " + areaY);

		// if(areaX > areaY){
		// 	System.out.println("maior" + areaX);
		// }else{
		// 	System.out.println("maior" + areaY);
		// }

		//sc.close();







		// discussão 
		// para melhorar isso , vamos usar uma classe para representar um triangulo
		// muitas variaveis para mostrar um só objeto 
		
		// OQUE È CLASSE
		// [e um tipo que pode conter membros
		// atributos (dados/campos)
		// memorias (funcoes / operaçoes )

		// a classe tambem pode prover muitos outros recursos, tais como:
		// construtores, sobrecarga, Encapsulamento, herança e polimorfismo

		// Ecemplos
		// Entidades: Produtosm, Clientes, Triangulo
		// Serviçoes: ProdutoService, ClienteService, EmailService, StorageService
		// Controladores: ProdutoController, ClienteController
		// Utilitarios: Calculadora, compactador
		// Outros (views, repositorios, gerenciadores)

		// nas classes temos que delcarar elas e cria -las para queal variavel ela via, exemplo , busquei a variavel
		// X e y como Triangule, e declarei que elas sao do tipo triangule com new triangule
		// para acessar os parametros dessas classes usamos o "." exemplo , x.a para acessar a propriedade x que é da classe triangule




		//// MANEIRA COM POP
			//mas sem metodos na classse



		

		// Scanner sc = new Scanner(System.in);
		// Triangule x,y;
		// x = new Triangule();
		// y = new Triangule();
		// System.out.println("Enter the measures of triangule X:");
		// x.a = sc.nextInt();
		// x.b = sc.nextInt();
		// x.c = sc.nextInt();
		// System.out.println("Enter the measures of triangule Y:");
		// y.a = sc.nextInt();
		// y.b = sc.nextInt();
		// y.c = sc.nextInt();
		// double p = (x.a + x.b + x.c)/2.0;
		// double areaX = Math.sqrt(p * (p -x.a) * (p - x.b) * (p-x.c));
		// p = (y.a + y.b + y.c)/2.0;
		// double areaY = Math.sqrt(p * (p -y.a) * (p - y.b) * (p-y.c));


		// System.out.println("Triangule X area: " + areaX);
		// System.out.println("Triangule X area: " + areaY);

		// if(areaX > areaY){
		// 	System.out.println("maior" + areaX);
		// }else{
		// 	System.out.println("maior" + areaY);
		// }
		// sc.close();




		// Classes Objetos e atributos sao coisas diferentes
		// classes é a definição do tipo
		// objetos sao instancias da classe



		// VAMOS colocar metodos agora na nossa classe
		// COM METODOS

		// Scanner sc = new Scanner(System.in);
		// Triangule x,y;
		// x = new Triangule();
		// y = new Triangule();
		// System.out.println("Enter the measures of triangule X:");
		// x.a = sc.nextDouble();
		// x.b = sc.nextDouble();
		// x.c = sc.nextDouble();
		// System.out.println("Enter the measures of triangule Y:");
		// y.a = sc.nextDouble();
		// y.b = sc.nextDouble();
		// y.c = sc.nextDouble();
		// double areaX = x.area();
		// double areaY = y.area();

		// System.out.println("Triangule X area: " + areaX);
		// System.out.println("Triangule X area: " + areaY);

		// if(areaX > areaY){
		// 	System.out.println("maior" + areaX);
		// }else{
		// 	System.out.println("maior" + areaY);
		// }
		// sc.close();

			// qual saos os beneficios de usarmos metodos
			// reaproveitamento de codigos e delegação de responsabilidades


			// SEGUNDO EXEMPLO

		// Vamos fazer um programa para ler os produtos de um estoque

		Scanner cs = new Scanner(System.in);
		System.out.println("ENTER PRODUCT DATA:");
		System.out.println("NAME:");
		Product product1;
		product1 = new Product();
		product1.name = cs.nextLine();
		System.out.println("Price:");
		product1.price = cs.nextDouble();
		System.out.println("Quantity:");
		product1.quantity = cs.nextInt();
		product1.totalValueUnStock();
		System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d %n Total: %.2f %n", product1.name, product1.price,product1.quantity, product1.totalValueUnStock());
		System.out.println("deseja adicionar quanto ao estoque?");
		product1.addProducts(cs.nextInt());
		System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d %n Total: %.2f %n", product1.name, product1.price,product1.quantity, product1.totalValueUnStock());
		System.out.println("deseja Remover quanto ao estoque?");
		product1.removeProducts(cs.nextInt());
		System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d %n Total: %.2f %n", product1.name, product1.price,product1.quantity, product1.totalValueUnStock());
		
		

		// AGORA Vamos pra OBject e toString()
		
		// Toda classe Java é uma subclasse da classe Object 
		// A classe object possui os seguintes metodos:
		// getClasse --> retorna o tipo do objeto
		//equals --> compara se o objeto é igual ao outro
		// hashcode --> retorna um codigo hash do objeto
		// toString --> converte o objeto para string
		// veremos na pratica

		
		System.out.println("dados do produto: "  + product1);



		cs.close();
		









	}




}
