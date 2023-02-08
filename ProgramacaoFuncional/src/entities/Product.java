package entities;

public class Product {
    private String name;
    private double price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100.00;
    }
    public  boolean nonStaticProductPredicate(){
        return price >= 100.00;
    }
    public static void staticUpdatePrice (Product p){
        p.setPrice(p.getPrice() * 1.1);
    }
    public  void nonstaticUpdatePrice (){
        setPrice(getPrice() * 1.1);
    }
    public static String staticUpperCase(Product p){
     return p.getName().toUpperCase();
    }
    public  String nonStaticUpperCase(){
        return getName().toUpperCase();
       }
    
}
