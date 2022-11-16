package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

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

}