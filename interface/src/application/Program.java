package application;
// anotações 
// A partir do java 8 , Interfaces podem ter "default methods "ou "defender metodos"
// Isso possui implicações conceituais e práticas, que serão discutidas mais à frente neste capítulo
// Primeiro vamos trablhar com a definição "classica" de interfaces.
// Depois vamos acrescentar o conceito default methods

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Contract;
import model.entities.Employees;
import model.entities.Installment;
import model.entities.Vehicle;
import model.services.BrazilInterestService;
import model.services.BrazilTaxService;
import model.services.ContractService;
import model.services.InterestService;
import model.services.PaypalService;
import model.services.RentalService;

//Interface
//Interface é um tipo que define um conjunto de operações que uma classe deve implementar 
// A interface  estabelece um contrato que a classe deve cumprir
// Para que serve interface?
// para criar sistemas de baixo acoplamento e flexíveis

// solução 1 SEM INTERFACE
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter dtft =   DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter data of cara: ");
		// System.out.println("model car:");
		// String carName = sc.nextLine();
		// System.out.println("Start (dd/MM/yyyy):");
		// LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtft);
		// System.out.println("Finish (dd/MM/yyyy):");
		// LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtft);
		// CarRental cr = new CarRental(start, finish, new Vehicle(carName));
		
		// System.out.println("Enter with price per hour: " );
		// double pricePerHour = sc.nextDouble();
		// System.out.println("Enter with price per day: " );
		// double pricePerDay = sc.nextDouble();
		// RentalService rentalService = new RentalService(pricePerHour, pricePerDay,new BrazilTaxService());

		// rentalService.processInvoice(cr);

		// System.out.println("Fatura");
		// System.out.println("Pagamento Basico" + cr.getInvoice().getBasicPayment());
		// System.out.println("Imposto" + cr.getInvoice().getTax());
		// System.out.println("Pagamento total" + cr.getInvoice().getTotalPayment());
		// sc.close();
		// conceitos aprendidos
		// INVERSÃO DE CONTROLE
		// Padrao de desenvolvimento que consiste em retirar da classe a responsabilidade de instanciar suas dependencias 
		// Injeção de dependência
		// É a forma de realizar a inversão de controle : um componente externo instancia a dependencia, que é então injetada no objeto "pai". pode ser implementada de várias formas

		



		//EXERCICIO DE FIXAÇÃO 
		// System.out.print("Entre com os dados do contrato: ");
		// System.out.print("Numero: ");
		// int number = sc.nextInt();
		// System.out.println("Data dd/MM/yyyy: ");
		// LocalDate date = LocalDate.parse(sc.next(), dtft);
		// System.out.println("valor do contratos: ");
		// double value = sc.nextDouble();
		// Contract contract = new Contract(number, date, value);
		// System.out.println("Entre com o numero  de parcelas: " );
		// int n = sc.nextInt();
		
		// ContractService contractService = new ContractService(new PaypalService());
		// contractService.processContract(contract, n);
		// System.out.println("Parcelas: ");
		// for (Installment installment : contract.getInstallments()) {
		// 	System.out.println(installment);
		// }
		// sc.close();
		

		// herança vs cumprir contrato 
		// aspectos em comum entre herança e interfaces
		// 1-Relção "é-um"
		// 2-Generalização/especialização
		// 3-Polimorfismo
		// DIFERENÇA
		// Herança => Reuso
		// Interface => contrato a ser cumprido
		// e se eu precisar implementar Shape como interface, porém também quiser definir uma estrutura comum reutilizável para todas figuras
		// faça a seguinte estrutura 
		// Shape(interface)<area():Double --> abstract shape(ojetct abstract)<color> __> Rectangle and circle
		
		//herança multipla e o problema do diamante
		// O que é o problema do diamante, a herança multipla pode gerar uma ambiguidade causada pela existencia do mesmo método
		// em mais de uma superclasse
		// herança multipla não é permitida na maioria das linguagens
		// como resolver ?
		// nos implementamos ao inves de ser duas classes concretas, cria-se duas interfaces
		// e a classe que tinha ambiguidade, a gente deriva ele da classe abstrata principal e deixa as duas que derivam serem interfaces
		
		// interface comparable
			// List<Employees> list = new ArrayList<>();
			// String path = "/home/user/Área de Trabalho/Java-Learning/in.txt";
			// try (BufferedReader br = new BufferedReader(new FileReader(path))){
			// 	String employeeCsv = br.readLine();
			// 	while(employeeCsv != null) {
			// 		String[] fields = employeeCsv.split(",");
			// 		list.add(new Employees(fields[0],Double.parseDouble(fields[1])));
			// 		employeeCsv = br.readLine();
			// 	}
			// 	Collections.sort(list);
			// 	for (Employees emp : list) {
			// 		System.out.println(emp.getName() + "," + emp.getSalary());
			// 	}	
			// } catch (IOException e) {
			// 	System.out.println("Error " + e.getMessage());
			// }
			
		
		
		//Default Methods
		// a partir do java 8 , interfaces podem conter metodos concretos
		// A intenção basica é ṕrover implementação padrão para todos os metodos
		// de modo a evitar:
		// 1- repetição de implementação em toda classe que implemente a interface
		// 2- a necessidade de ser criar classes abstratas para prover reuso da implementação
		// outras vantagens?
		// 1- manter a retricinoatibilidade com sistemas existentes
		// 2- Permitir que "interfaces funcionais"(que devem conter apenas um metodo)
		// possam prover outras operações padrão reutilizaveis

		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Mouths: ");
		int month = sc.nextInt();

		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount,month);
		System.out.println("Oayment after " + month + " Mounths: ");
		System.out.println(String.format("%.2f" , payment));
		sc.close();
	}	

}
