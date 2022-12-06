package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

import entities.enums.OrderStatus;
import entities.enums.WorkerLevel;
import entitiese.Coments;
import entitiese.Department;
import entitiese.HourContract;
import entitiese.Order;
import entitiese.Post;
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
		// Scanner sc = new Scanner(System.in);
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// System.out.println("De qual departamento o trabalhador faz parte ?");
		// Department dpt = new Department(sc.nextLine());
		// System.out.println("Entre com os dados dele");
		// System.out.println("nome:");
		// String nome = sc.nextLine();
		// System.out.println("Nivel de habilidades:");
		// WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
		// System.out.println("base salarial :");
		// Double baseSalary = sc.nextDouble();
		// Workers func = new Workers(nome, level, baseSalary, dpt);
		// System.out.println("quantos contratos ele tera?");
		// int numeroContratos = sc.nextInt();
		// for (int i = 0; i < numeroContratos; i++) {
		// 	sc.nextLine();
		// 	System.out.printf("Coloque dados do contrato numero %d %n", (i+1));
		// 	Date dt = sdf.parse(sc.next());
		// 	System.out.println("Quantas horas trabalhadas?");
		// 	Integer hours = sc.nextInt();
		// 	System.out.println("Qual preco da hora?");
		// 	Double price = sc.nextDouble();
		// 	HourContract contract = new HourContract(dt,price,hours);
		// 	func.addContract(contract);
		// }
		// System.out.println("Digite qual voce quer pesquisar: MM/YYYY");
		// String monthAndYear = sc.next();
		// int month = Integer.parseInt(monthAndYear.substring(0,2));
		// int year = Integer.parseInt(monthAndYear.substring(3));
		// System.out.println("Name:" + func.getName());
		// System.out.println("departamento" + func.getDepartment().getName());
		// double Salary = func.income(year, month);
		// System.out.println("salario" + Salary);
		// sc.close();
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Quantos posts são?");
		// int n = sc.nextInt();
		// List <Post> posts = new ArrayList<>(); 
		// SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// for (int i = 0; i < n; i++) {
		// 	System.out.println("Post" + (i + 1));
		// 	System.out.println("Qual titulo?");
		// 	sc.nextLine();
		// 	String titulo = sc.nextLine();
		// 	System.out.println("Qual o Conteudo do post:");
		// 	String conteudo = sc.nextLine();
		// 	Date momento = new Date(); 
			
		// 	System.out.println("Deseja colocar likes ? (S) ou (N)");
		// 	int resp = sc.nextInt();
		// 	if(resp == 1){
		// 		Post post = new Post(momento, titulo, conteudo);
				
		// 		posts.add(post);
		// 	}else{
		// 		Post post = new Post(momento, titulo, conteudo);
		// 		posts.add(post);
		// 	}	
			
		// }
		// System.out.println("Deseja colocar algum comentario?");
		// int resp2 = sc.nextInt();
		// if(resp2 == 1){
		// 	System.out.println("escolha qual post você quer adicionar");
		// 	int num = sc.nextInt();
		// 	Post postEscolhido = posts.get(num);
		// 	addComentarios(postEscolhido);

		// }else{
		// 	for (Post post : posts) {
		// 		post.toString();
		// 	}
		// }
		// sc.close();

		//Exercicio de fixação
		                                                                                







	}
	// static void addComentarios(Post postEscolhido){
		
	// 	Scanner sc = new Scanner(System.in);
	// 	System.out.println("Quantos comentarios são?");
	// 	int n2= sc.nextInt();
	// 	for (int j = 0; j < n2; j++) {
	// 		sc.nextLine();
	// 		System.out.println("Coloque o comentario: "  + (j+ 1));
	// 		Coments coment = new Coments(sc.nextLine());	
	// 		postEscolhido.addComent(coment);
			
	// 	}
	// 	 postEscolhido.toString();
	// }
	
}
