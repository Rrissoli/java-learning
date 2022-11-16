package application;

import java.util.Scanner;

import entities.Funcionario;
import entities.Retangule;
import entities.Student;

public class Exercicios {
    public static void main(String[] args) {
        // exercicio 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("coloque os lados do Retangulo:");
        // System.out.println("altura");
        // Retangule retangulo1;
        // retangulo1 = new Retangule();
        // retangulo1.Heigth = sc.nextDouble();
        // System.out.println("largura do retangulo:");
        // retangulo1.Width = sc.nextDouble();
        // sc.close();
        // System.out.println(retangulo1);


        // //exercicio 2
        // Scanner cs = new Scanner(System.in);
        // Funcionario funcionario1;
        // funcionario1 = new Funcionario();
        // System.out.println("Coloque nome do funcionario, salario bruto e imposto que ele paga:");
        // funcionario1.name = cs.next();
        // funcionario1.salarioBruto = cs.nextDouble();
        // funcionario1.imposto = cs.nextDouble();
        // System.out.println(funcionario1);
        // System.out.println("quanto quer de aumento?");
        // funcionario1.aumentoDeSalario(cs.nextInt());
        // System.out.println(funcionario1);

        // exercicio 3
        Scanner pw = new Scanner(System.in);
        Student estudante1;
        estudante1 = new Student();
        System.out.println("Seu nome e suas 3 notas");
        estudante1.nome = pw.nextLine();
        estudante1.nota1= pw.nextDouble();
        estudante1.nota2= pw.nextDouble();
        estudante1.nota3= pw.nextDouble();
        System.out.println(estudante1.sePassou());
        pw.close();





        // cs.close();
    }
}
