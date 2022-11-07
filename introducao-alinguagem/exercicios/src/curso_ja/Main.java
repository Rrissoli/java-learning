package curso_ja;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.Style;

public class Main {
	public static void main(String[]args) {
		//Exercícios
		//ex 1
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Escolha um numero");
		// int num1 = sc.nextInt();
		// System.out.println("Escolha outro numero");
		// int num2 = sc.nextInt();
		// int num3 = num1 + num2;
		// System.out.printf("Resultado da soma = %d %n",num3);
		// System.out.println("Fim do exercicio 1");
		// sc.close();
		

		//ex 2
		// Scanner cs = new Scanner(System.in);
		// System.out.println("Coloque o valor de A:");
		// int A, B, C, D ;
		// A = cs.nextInt();
		// System.out.println("Coloque o valor de B:");
		// B = cs.nextInt();
		// System.out.println("Coloque o valor de C:");
		// C = cs.nextInt();
		// System.out.println("Coloque o valor de D:");
		// D = cs.nextInt();
		// int resultado = (A*B) - (C*D);
		// System.out.printf("Seu Resultado é = %d %n", resultado);
		// cs.close();

		//ex3
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Passe o raio do circulo:");
		// double r ;
		// r= sc.nextDouble();
		// double Res = Math.pow(r,2) * 3.14159;
		// System.out.printf("Área do círculo é : %f %n", Res);
		// sc.close();		

		//ex4
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Coloque seu numero:");
		// int num,ht;
		// double vh;
		// num = sc.nextInt();
		// System.out.println("Informe suas horas trabalhadas:");
		// ht = sc.nextInt();
		// System.out.println("Quanto quer ganhar por hora ?");
		// vh = sc.nextDouble();
		// double result = ht * vh;
		// System.out.printf("NUMBER = %d %n SALARY = %.2f %n", num, result);
		// sc.close();

		//ex5
		// Scanner sc = new Scanner(System.in);

		// System.out.print("Vamos as compras , fale o numero da peça 1:");

		// int num, qtd;
		// double preco;
		
		// num = sc.nextInt();
		// System.out.println("quantas peças 1 quer levar ?");
		// qtd = sc.nextInt();
		// System.out.println("Qual valor?");
		// preco = sc.nextDouble();

		// int num2, qtd2;
		// double preco2;
		// System.out.println("Qual código da peça 2?");
		// num2 = sc.nextInt();
		// System.out.println("quantas peças 2 quer levar ?");
		// qtd2 = sc.nextInt();
		// System.out.println("Qual valor?");
		// preco2 = sc.nextDouble();
		// double Total = (qtd * preco) + (qtd2 *preco2);

		// System.out.printf("Valor A PAgar: R$%.2f %n", Total);
		Scanner sc = new Scanner(System.in);
		double A,B,C;
		System.out.println("Escolha A por Base , ou A e B por bases e C por altura");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		double triangulo =  A*C;
		double circulo = C * 3.1415;
		double trapezio = ((A+B)*C)/2;
		double quadrado = Math.pow(C, 2.00);
		double retagulo = A * B; 
System.out.printf("Triangulo: %f %n circulo: %f %n trapezio: %f %n quadrado: %f %n Retangulo: %f %n", triangulo,circulo,trapezio,quadrado,retagulo);


	}
}
