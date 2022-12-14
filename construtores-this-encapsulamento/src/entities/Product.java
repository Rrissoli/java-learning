package entities;

import java.util.jar.Attributes.Name;

public class Product {

    // aqui vem a logica do encapsulamento, vamos tornar todo mundo privado , pq utilizaremos getters para pegar e setters para setar
    

    private String name;
    private double price;
    private int quantity;

    //modificadores de acesso
    // private : o membro só pode ser acessado na propria classe 
    // (nada) : o membro só pode ser acessado nas classes do mesmo pacote
    // protected : o membro so pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes
    // public : p membro é acessavel por todas as classes (ao menos que ele resida em um modulo diferente que nao exporte o pacote onde ele está )
    


    // delcarando getters
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }



    
    
    // declarando setters
     public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    // aqui nao coloco um setquantity por conta do acesso a ela , nao quero que um metodo setter qualquer use ela 
    // quero obrigar a usar a função que faça isso 
    



    //construtor
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    //sobrecarga do construtor 
    // se a pessoa nao colocar a quantidade , caira nesse construror e setara 0
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        quantity = 0;
    }

   

    //metodos

    public double totalValueUnStock(){
        return price * quantity;
    }
    public  void addProducts(int quantity){
        this.quantity += quantity;
        
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
        
    }
    public String toString(){
        return name + ", $ " + price + " , " + quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}