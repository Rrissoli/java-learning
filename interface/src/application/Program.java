package application;
// anotações 
// A partir do java 8 , Interfaces podem ter "default methods "ou "defender metodos"
// Isso possui implicações conceituais e práticas, que serão discutidas mais à frente neste capítulo
// Primeiro vamos trablhar com a definição "classica" de interfaces.
// Depois vamos acrescentar o conceito default methods

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
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
		DateTimeFormatter dtft =   DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data of cara: ");
		System.out.println("model car:");
		String carName = sc.nextLine();
		System.out.println("Start (dd/MM/yyyy):");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtft);
		System.out.println("Finish (dd/MM/yyyy):");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtft);
		CarRental cr = new CarRental(start, finish, new Vehicle(carName));
		
		System.out.println("Enter with price per hour: " );
		double pricePerHour = sc.nextDouble();
		System.out.println("Enter with price per day: " );
		double pricePerDay = sc.nextDouble();
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay,new BrazilTaxService());

		rentalService.processInvoice(cr);

		System.out.println("Fatura");
		System.out.println("Pagamento Basico" + cr.getInvoice().getBasicPayment());
		System.out.println("Imposto" + cr.getInvoice().getTax());
		System.out.println("Pagamento total" + cr.getInvoice().getTotalPayment());
		sc.close();

		
		sc.close();

	}

}
