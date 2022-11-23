package src.application;

import java.util.Scanner;

import src.entities.Enquilinos;
import src.entities.Pessoa;

public class exercicios {
    public static void main(String[] args) {

        // ex 1
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Quantos numeros ira digitar?");
        // int N = sc.nextInt();
        // int[] vect = new int[N];
        // for (int i = 0; i < vect.length; i++) {
        // sc.nextLine();
        // int num = sc.nextInt();
        // vect[i] = num;}
        // for (int i = 0; i < vect.length; i++) {
        //     if(vect[i] < 0){
        //         System.out.println(vect[i]);
        //     }}




        //ex 2
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Quantos numeros voce vai digitar ?");
        // int num = sc.nextInt();
        // int[] vect = new int[num];
        // for (int i = 0; i < vect.length; i++) {
        //     sc.nextLine();
        //     int numero = sc.nextInt();
        //     vect[i] = numero;
        // }
        // int soma =0;
        // System.out.print("Numeros:    ");
        // for (int i = 0; i < vect.length; i++) {
        //     System.out.printf("%d   ", vect[i]);
        //     soma += vect[i];
        // }
        // System.out.printf(" %n soma: %d %n",soma);
        // double avg = soma/num;
        // System.out.printf("media: %.2f %n", avg);
        // sc.close();
        


        //ex3
        Scanner sc=new Scanner(System.in);
        
        // System.out.println("uantas pessoas serao cadastradas ?");
        // int num = sc.nextInt();
        // Pessoa[] vect = new Pessoa[num];
        // for (int i = 0; i < vect.length; i++) {
        //     sc.nextLine();
        //     System.out.println("nome:");
        //     String nome = sc.nextLine();
        //     System.out.println("idade:");
        //     int idade = sc.nextInt();
        //     System.out.println("altura:");
        //     double altura = sc.nextDouble();
        //     vect[i] = new Pessoa(nome, idade, altura);
        // }
        // for (int i = 0; i < vect.length; i++) {
        //     sc.nextLine();
        //     System.out.printf("Dados da %da pessoa %n", i);
        //     System.out.printf("nome: %s %n", vect[i].getNome());
        //     System.out.printf("idade: %s %n", vect[i].getIdade());
        //     System.out.printf("altura: %s %n", vect[i].getAltura());
        // }
        // double soma = 0;
        // for(int i = 0; i < vect.length; i++){
        //     soma += vect[i].getAltura();
        // }
        // double mediaAltura = soma / num;
        // double somaIdade = 0;
        // for (int i = 0; i < vect.length; i++) {
        //     if(vect[i].getIdade() > 14){
        //     somaIdade += vect[i].getIdade();
        //     }
        // }
        // double percentual = (somaIdade*100.0)/num;
        // System.out.printf("Meida de alturas: %.2f %n", mediaAltura);
        // System.out.printf("porcentagem abaixo de 14: %.1f%% %n", percentual);
        
        System.out.println("Quantos quartos serao alugados");
        int num = sc.nextInt();
        Enquilinos[] vect = new Enquilinos[10];
        for (int i = 0; i < num; i++) {
            sc.nextLine();
            System.out.println("nome:");
            String nome = sc.nextLine();
            System.out.println("email:");
            String email = sc.nextLine();
            System.out.println("quarto:");
            int quarto = sc.nextInt();
            vect[quarto]= new Enquilinos(nome,email,quarto);
        }
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ":" + vect[i]);   
            }
            
        }


        
        sc.close();
        }
}
