package entities;

public class Product {
    protected String name;
    protected Double price;
    public String priceTag(){
        return  "R$" + this.price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public Product() {
       
    }
}
