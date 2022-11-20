package src.application;

import java.util.Scanner;

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
        
        System.out.println("uantas pessoas serao cadastradas ?");
        int num = sc.nextInt();
        Pessoa[] vect = new Pessoa[num];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(nome, idade, altura);
        }
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa %n", i);
            System.out.printf("nome: %s %n", vect[i].getNome());
            System.out.printf("idade: %s %n", vect[i].getIdade());
            System.out.printf("altura: %s %n", vect[i].getAltura());
        }

        
        
        
        
        sc.close();
        }
}
