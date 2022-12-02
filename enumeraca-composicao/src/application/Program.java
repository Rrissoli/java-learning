package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import entities.enums.OrderStatus;
import entities.enums.WorkerLevel;
import entitiese.Department;
import entitiese.HourContract;
import entitiese.Order;
import entitiese.Workers;

public class Program {
	public static void main(String[] args) throws ParseException {
		// TIPOS ENUMERADOS 
		//definição: é um tipo especial que serve para especificar de forma literal um conjunto de contantes relacionadas
		// Palavra chae em Java : enum
		// Vantagem : melhor semântica , código mais legível e auxiliado pelo compilador
		// exemplo : cliclo de vida de pedidos
		// PendingPayment --> Processing --> shipped --> Delivered
		// para ficar melhor do programador trabalha 

		//exemplo
		// package entities.enums;
		// public enum OrderStatus{
			// PENDING_PAYMENT,
			// PROCESSING,
			// SHIPPED,
			// DELIVERED
		// };
			Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
			System.out.println(order);
		//Conversão de string para enum
		// só passar o nome do metodo que vc quer ventro de OrderStatus.valueOf("***")
		Order order2= new Order(1080, new Date(), OrderStatus.valueOf("DELIVERED"));
		System.out.println(order2);

		// vamos falar sobre design 
		//categorias de classes ==> em um sistema orientado a objetos m de modo geral "tudo" é objeto 
		// Por questões de design tais como organização , flexibilidade , reuso, delgalçao e etv há varias categorias de classes como :
		// Views, Controllers, Entitiesm Srvices , Repositories


		//Composição 
		// definição ==> é um tipo de associação que permite que um objeto contenha outro
		// Relação de "tem-um" ou "tem-varios"
		// Vantagens
		// ==> Organização: divisão de responsabilidades
		// ==> Coesão
		// ==> flexibilidade
		// ==> reuso
		
		// Nota : Embora o simbolo UML para composição (todo-parte) seja o diamante preto, neste contexto estamos chamando de composição qualquer associação tipo "tem-um" e "tem-varios"
		// Exercicio Resolvido 1
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("De qual departamento o trabalhador faz parte ?");
		Department dpt = new Department(sc.nextLine());
		System.out.println("Entre com os dados dele");
		System.out.println("nome:");
		String nome = sc.nextLine();
		System.out.println("idade:");
		WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
		System.out.println("base salarial :");
		Double baseSalary = sc.nextDouble();
		Workers func = new Workers(nome, level, baseSalary, dpt);
		System.out.println("quantos contratos ele tera?");
		int numeroContratos = sc.nextInt();
		for (int i = 0; i < numeroContratos; i++) {
			sc.nextLine();
			System.out.printf("Coloque dados do contrato numero %d %n", (i+1));
			Date dt = sdf.parse(sc.next());
			System.out.println("Quantas horas trabalhadas?");
			Integer hours = sc.nextInt();
			System.out.println("Qual preco da hora?");
			Double price = sc.nextDouble();
			HourContract contract = new HourContract(dt,price,hours);
			func.addContract(contract);
		}
		







		sc.close();

	}
}
