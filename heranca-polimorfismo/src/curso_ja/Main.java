package curso_ja;

import entities.Account;
import entities.BusnessAcount;
import entities.SavingsAccount;

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
		
		Account acc = new Account(1001, "Raphael",0.0);
		BusnessAcount bcc = new BusnessAcount(1002, "Maria", 0.0, 500.0);

		// Upcasting exemplo1
		// pega uma variavel subclasse e atribui ela pra uma classe principal 
		Account acc1 = bcc;
		acc1.getBalance();
		// exemplo 2
		Account acc2 = new SavingsAccount(1004, "rober", 100.0, 0.01);
		// Accont --> BusnessAcount
		//       |--> SavingAccount

		//Downcasting
		//BusnessAcount acc4 = acc2; NAO PODEMOS FAZER ISSO 
		//TEMOS QUE FAZER UM CASTING MANUAL
		// BusnessAcount acc4 = (BusnessAcount) acc2;
		// acc4.loan(100.0);
		// essa operação nao é permitida . mas como meu programa não sabe que acc2 é savingsAccount
		// então ele só da problema no terminal
		// BusnessAcount acc6 = (BusnessAcount) acc2;
		// resolver esse problema com instanceOf
		if (acc2 instanceof BusnessAcount) {
			BusnessAcount acc5 = (BusnessAcount)acc2;
			acc5.loan(299.0);
			System.out.println("loan");

		}
		if (acc2 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc2;
			acc5.updateBalance();
			System.out.println("Update");
		}
		


		// SOBREPOSIÇÂO ou SOBRESCRITA 
		//É a implementação de um método de uma superclasse em uma subclasse
		// É fortemente recomendável usar a anotação @Override em um método sobrescrito
		// -> Facilita a leitura e compreensão do código
		// -> Avisamos ao compilador ( boa Prática)
		Account acc7 = new Account(1001, "Alex", 1000.0);
		acc7.Withdraw(200.0);
		System.out.println(acc7.getBalance());
		Account acc8 = new SavingsAccount(1001, "Alexa", 1000.0, 0.01);
		acc8.Withdraw(200.0);
		System.out.println(acc8.getBalance());
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
		// Método : evita que o metodo sob seja sobreposto 
		// Exemplo de classe final -> se a gente quiser evitar que seja criada subclasses de uma classe
		
	}
}
