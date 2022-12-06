package entitiese;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;
   
    public Integer getQuantity() {
        return quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    
    public OrderItem() {
    }
    public Double subTotal (){
        double priceFinal = this.price * this.quantity;
        return priceFinal;
    }
    @Override
    public String toString() {
        return  product.getName() + "," + this.price + "quantity:" + this.quantity + "Subtotal:" + this.subTotal();
    }
    
}
