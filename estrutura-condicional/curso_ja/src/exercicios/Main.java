package exercicios;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
	// ex 1
		// Scanner sc = new Scanner(System.in);
		// int c = sc.nextInt();
		// if(c > 0){
		// 	System.out.println("positivo");
		// }else{
		// 	System.out.println("negativo");
		// }
		// sc.close();
	//ex 8
	Scanner sc = new Scanner(System.in);		
	System.out.println("Qual seu salario?");
	int renda = sc.nextInt();
	double imposto;
	
	if(renda <= 2000){
		imposto = 0.08;
	}else if(renda <= 3400){
		imposto = 0.2;
	}else if(renda <= 4000){
		imposto = 0.7;
	}else{
		imposto  = 0.86;
	}
	double result = renda * imposto;
	double salario = renda - result;
	System.out.println(salario);
sc.close();
	}
		
	}

	
	

