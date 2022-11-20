package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class Exercicio {
    public static void main(String[] args) {
    

// ex:
    Scanner sc = new Scanner(System.in);
    ContaBancaria conta1;
    System.out.println("qual seu nome?");
    String nome = sc.nextLine();
    System.out.println("qual seu numero de conta ?");
    int numero = sc.nextInt();
    System.out.println("tem deposito inicial ?");
    char resposta = sc.next().charAt(0);
    if(resposta == 's'){
    System.out.println("qual valor?");
    double valor = sc.nextDouble();
     conta1 = new ContaBancaria(nome, numero,valor);
    }else{
         conta1 = new ContaBancaria(nome, numero);
    }    
    System.out.println("confirmando");
    System.out.println(conta1);
    System.out.println(" valor do deposito");
    conta1.deposito(sc.nextDouble());
    System.out.println(conta1);
    System.out.println("valor para saque");
    conta1.saque(sc.nextDouble());
    System.out.println(conta1);
    
    
    
    sc.close();
      
    }

}
