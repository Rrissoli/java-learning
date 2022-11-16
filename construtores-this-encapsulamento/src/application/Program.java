package application;

import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        // construtores
        // é uma operação especial da classe , que executa no momento da instanciaçao do objeto
        // usos comuns são , Iniciar valores dos atributos, Permitir ou obrigar que o objetp receba dados / dependencias no momento de suas instanciações
        // Se um construtor customizado não for especificado , a classe disponibiliza o construtor padrão 
        // Product p = new Product();
        // è possivel especificar mais de um construtor na mesma classe ( sobrecarga)
        
        
        // Problema exemplo é o do produto
        
        // Scanner cs = new Scanner(System.in);
		// System.out.println("ENTER PRODUCT DATA:");
		// System.out.println("NAME:");
		// Product product1;
		// product1 = new Product();
		// product1.name = cs.nextLine();
		// System.out.println("Price:");
		// product1.price = cs.nextDouble();
		// System.out.println("Quantity:");
		// product1.quantity = cs.nextInt();
		// product1.totalValueUnStock();
		// System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d %n Total: %.2f %n", product1.name, product1.price,product1.quantity, product1.totalValueUnStock());
		// System.out.println("deseja adicionar quanto ao estoque?");
		// product1.addProducts(cs.nextInt());
		// System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d %n Total: %.2f %n", product1.name, product1.price,product1.quantity, product1.totalValueUnStock());
		// System.out.println("deseja Remover quanto ao estoque?");
		// product1.removeProducts(cs.nextInt());
		// System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d %n Total: %.2f %n", product1.name, product1.price,product1.quantity, product1.totalValueUnStock());
		// cs.close();

        // PROPOSTA DE MELHORIA COM CONSTRUCTOR

        // Scanner cs = new Scanner(System.in);


		// System.out.println("ENTER PRODUCT DATA:");
		// System.out.println("NAME:");
		// String name = cs.nextLine();
		// System.out.println("Price:");
		// double price = cs.nextDouble();
		// System.out.println("Quantity:");
		// int quantity = cs.nextInt();
        // Product product1 = new Product(name, price, quantity);

		// product1.totalValueUnStock();
		// System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d %n Total: %.2f %n", product1.name, product1.price,product1.quantity, product1.totalValueUnStock());
		// System.out.println("deseja adicionar quanto ao estoque?");
		// product1.addProducts(cs.nextInt());
		// System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d %n Total: %.2f %n", product1.name, product1.price,product1.quantity, product1.totalValueUnStock());
		// System.out.println("deseja Remover quanto ao estoque?");
		// product1.removeProducts(cs.nextInt());
		// System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d %n Total: %.2f %n", product1.name, product1.price,product1.quantity, product1.totalValueUnStock());
		// cs.close();


        // nesse caso temos o construtor para evitar que produtos sejam criados sem nome, preco ou quantidadae


        // a palavra this é uma referencia ao proprio objeto 
        // usos comuns , diferenciar atributos de variaveis locais, 
        // Passar o proprio objeto como argumento na chamada de um metodo ou construtor
        // a gente pode passar o proprio objeto dentro do construtor
        // exemplo --> placeNewPiece('e',1, new King(board, Color.WHITE, this)) --> esse ultimo referencia o mesmo lugar















        //Sobrecarga 
        //é um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome , porém com diferentes listas de parametros
        // disponibiliza mais de uma versao para a construção ou metdodo
        
        // Proposta de melhoria
        // a quantidade no estoque tem q ter o valor 0 
        // la no construtor produtos vamos duplica-lo e se ele n receber nada, ira setar em 0

        Scanner cs = new Scanner(System.in);


		System.out.println("ENTER PRODUCT DATA:");
		System.out.println("NAME:");
		String name = cs.nextLine();
		System.out.println("Price:");
		double price = cs.nextDouble();
		
        Product product1 = new Product(name, price);

		product1.totalValueUnStock();
		System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d %n Total: %.2f %n", product1.name, product1.price,product1.quantity, product1.totalValueUnStock());
		
		System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d %n Total: %.2f %n", product1.name, product1.price,product1.quantity, product1.totalValueUnStock());
		System.out.println("deseja Remover quanto ao estoque?");
		product1.removeProducts(cs.nextInt());
		System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d %n Total: %.2f %n", product1.name, product1.price,product1.quantity, product1.totalValueUnStock());
		cs.close();




















        //Encapsulamento
        // é um principio que consiste em esconder detalhes de implementação de uma classe expondo apenas operações seguras e que mantenham os objetos em um estado consistente
        // regta de outo , o objeto deve sempre estar em um estado consistente , e a propria classe deve garantir isso

        // regra gerak basica
        // um objeto nao deve expor nenhum atributo (modificador de acesso private)




    }
}
