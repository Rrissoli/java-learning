package curso_ja;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusnessAcount;
import entities.Company;
import entities.Employee;
import entities.Individual;
import entities.OutsourcedEmployee;
import entities.SavingsAccount;
import entities.TaxPayer;

public class Main {

	public static void main(String[]args) {
		// Herança
		// é o tipo de associação que permite que uma classe herde todos os dados e comportamentos de outra 
		// vantagens => reuso e polimorfismo
		// sintaxe => class A extends B
		// é uma classe base / superclasse
		//heranca é uma associação entre classes

		  //UPCASTING 
		  // Casting da subclasse ára a superclasse
		  // Uso comum : Polimorfismo

		  //DownCasting 
		  // Casting da superclasse para subclasse
		  // palavra instanceof
		  // Uso comum métodos que recebem parametros genericos
		
		// Account acc = new Account(1001, "Raphael",0.0);
		// BusnessAcount bcc = new BusnessAcount(1002, "Maria", 0.0, 500.0);

		// // Upcasting exemplo1
		// // pega uma variavel subclasse e atribui ela pra uma classe principal 
		// Account acc1 = bcc;
		// acc1.getBalance();
		// // exemplo 2
		// Account acc2 = new SavingsAccount(1004, "rober", 100.0, 0.01);
		// // Accont --> BusnessAcount
		// //       |--> SavingAccount

		//Downcasting
		//BusnessAcount acc4 = acc2; NAO PODEMOS FAZER ISSO 
		//TEMOS QUE FAZER UM CASTING MANUAL
		// BusnessAcount acc4 = (BusnessAcount) acc2;
		// acc4.loan(100.0);
		// essa operação nao é permitida . mas como meu programa não sabe que acc2 é savingsAccount
		// então ele só da problema no terminal
		// BusnessAcount acc6 = (BusnessAcount) acc2;
		// resolver esse problema com instanceOf
		// if (acc2 instanceof BusnessAcount) {
		// 	BusnessAcount acc5 = (BusnessAcount)acc2;
		// 	acc5.loan(299.0);
		// 	System.out.println("loan");

		// }
		// if (acc2 instanceof SavingsAccount) {
		// 	SavingsAccount acc5 = (SavingsAccount)acc2;
		// 	acc5.updateBalance();
		// 	System.out.println("Update");
		// }
		


		// SOBREPOSIÇÂO ou SOBRESCRITA 
		//É a implementação de um método de uma superclasse em uma subclasse
		// É fortemente recomendável usar a anotação @Override em um método sobrescrito
		// -> Facilita a leitura e compreensão do código
		// -> Avisamos ao compilador ( boa Prática)
		// Account acc7 = new Account(1001, "Alex", 1000.0);
		// acc7.Withdraw(200.0);
		// System.out.println(acc7.getBalance());
		// Account acc8 = new SavingsAccount(1001, "Alexa", 1000.0, 0.01);
		// acc8.Withdraw(200.0);
		// System.out.println(acc8.getBalance());
		// alteramos withdraw em SavingsAccount, tiramos a taxa , houve uma reescrita da função 

		// Palavra Super
		// É possicel chamar a implementação de superclasse usando a palavra super
		// Exemplo: suponha que m na classe BusinessAccount  a regra para saque seja realizar o saque normalmente da superclasse descontar mais 2.0 
		//@Override
		// public void Withdraw(double amount){
			//super.Withdraw(amount)
			//balance -= 2.0;
		// }
		Account acc9 =  new BusnessAcount(1002, "Maria", 1000.0, 500.0);
		acc9.Withdraw(200.0);
		System.out.println(acc9.getBalance());

		// CLASSES E METODOS FINAL
		// Classe : evita que a classe seja herdada:
		// public final class SavingsAccount {}
		// Método : evita que o metodo sobreposto seja sobreposto novamente
		// Exemplo de classe final -> se a gente quiser evitar que seja criada subclasses de uma classe
		
		// Pilare do OOP
		// Encapsulamento 
		// Herança 
		// Polimorfismo

		// POLIMORFISMO
		// Em programação orientada a objetos, polimorfismo é recurso que permite variaveis de um mesmo tipo mais generico possam apontar para objetos de tipos específicos diferentes
		// tendo assim comportamentos diferentes conforme cada tipo especificp

		// Account x = new Account(1020, "Alexando", 1000.0);
		// Account y = new SavingsAccount(1023, " Maria", 1000.0, 0.01);

		// x.Withdraw(50);
		// y.Withdraw(50);
		// System.out.println(x.getBalance());
		// System.out.println(y.getBalance());
		// eu estou tendo a mesma operação e comportamentos diferentes para cada classe

		// IMPORTANTE ENTENDER 
		// A associação do tipo com o tipo generico é feita em tempo de execução (upcasting)
		// O compilador não sabe para qual tipo especifico a chamada do método Withdraw está sendo feita ( ele só sabe que são duas variavies tipo Account)

		// CLASSES ABSTRATAS
		// são classes que não podem ser instanciadas 
		// É uma forna de garantir herança total : somente subclasses não abstratas podem ser instanciadas , mas nunca a superclasse abstrata
		//EXEMPLO
		// Suponha que em um negocio relacionado a banco , apenas contas poupança e contas para empresas são permitidas. 
		// não existem  conta comum
		// Para garantir que contas comuns não possam ser instanciadas , basta acrescentarmos a palavra "abstract" na declaração da classe.
		// public abstract class Account{...}
		// Account acc78 = new Account(1009, "maria", 1000.0);
		// agora não posso instanciar essa classe
		// Porque então só não criamos classes Savings e Busness?
		// Account acc79 = new SavingsAccount(1000, "rober", 10000.0, 0.001);
		// Account acc89 = new BusnessAcount(10001,"romilo",1000.0, 100.0);
		// // Por causa do Reuso e do Polimorfismo : como  a super classe genérica nos permite tratar de melhor forma o resto das outras subclasses
		// suponha que voce queira : Totalizar o saldo de todas as contas e depositar 10 em todas as contas 
		// exemplo 
		// List<Account> list = new ArrayList<>();
		
		// list.add(acc79);
		// list.add(acc89);
		// list.add(new SavingsAccount(1001,"Alex", 100.0, 0.01));
		// list.add(new BusnessAcount(10009, "qwei", 100.0, 1000.0));
		// double sum = 0;
		// for (Account account : list) {
		// 	System.out.println(account);
		// 	sum += account.getBalance();
		// }
		// System.out.println(sum);
		// exercicio de fixação
		// 1
		// Locale.setDefault(Locale.US);
		// Scanner sc = new Scanner(System.in);

		// List <Employee> employees = new ArrayList<>();
		// System.out.println("Enter number of  employees");
		// int n = sc.nextInt();
		
		
		// for (int i = 0; i < n; i++) {
		// 	sc.nextLine();
		// 	System.out.printf("Employee #%d %n", (i+1));
		// 	System.out.println("Outsourced ?");
		// 	char resp = sc.next().charAt(0);
		// 	sc.nextLine();
		// 	System.out.println("Whats name of Employee");
		// 	String name = sc.nextLine();
		// 	System.out.println("How many hours he/she do?");
		// 	int hours = sc.nextInt();
		// 	System.out.println("How many recived for work hours?");
		// 	double valueHours = sc.nextDouble();
		// 	if(resp == 'y'){
		// 		System.out.println("How many charge additional ?");
		// 		Double addcharge = sc.nextDouble();
		// 		Employee emp = new OutsourcedEmployee(name,hours,valueHours, addcharge);
		// 		employees.add(emp);
		// 	}else{
		// 		Employee emp = new Employee(name, hours, valueHours);
		// 		employees.add(emp);
		// 	}
			
		
		// }
		// for (Employee employee : employees) {
		// 	Double selfPayment = employee.payment();
		// 	System.out.printf("%s - R$%.2f %n", employee.getName(), selfPayment);
		// }
		
		// sc.close();
		
		//exercício de fixação 2
		Scanner sc = new Scanner(System.in);
		List <TaxPayer> payers = new ArrayList<TaxPayer>();
		System.out.print("Enter with numbers of taxpayers: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Taxpayer" + (i +1) + " data:");
			System.out.println("Is a individual or company? (i/c) ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("what ur name ?");
			String name = sc.nextLine();
			System.out.println("What is ur anual income:");
			Double anualIncome = sc.nextDouble();
			
			if(resp == 'i'){
				System.out.println("How Many u pay for health expendures?");
				Double healthExpendures = sc.nextDouble();
				System.out.println("swedf");
				TaxPayer payerIndividual = new Individual(name, anualIncome, healthExpendures);
				payers.add(payerIndividual);
			}
			else{
				System.out.println("How Many employees work in the company?");
				int numberOfEmployees = sc.nextInt();
				TaxPayer payerCompany = new Company(name, anualIncome, numberOfEmployees);
				payers.add(payerCompany);
			}
			
		}
		for (TaxPayer taxPayer : payers) {
			System.out.println("TAXES PAID: ");
			System.out.printf("%s: $ %.2f", taxPayer.getName(), taxPayer.tax());
		}
	
		sc.close();





		// Métodos  abstratos
		//==> são métodos que não possuem implementação 
		// --> métodos precisam ser abstrados quando a classe é generica demais para conter sua implementação
		// Se uma classe possuir pelo menos um metodo abstrato , então esta classe tambem é abstrata
		// notação uml : itálico
		 

	}
}
