package entities;

import java.util.Date;

public class UsedProduct extends Product{
    protected Date manufactureDate;
    @Override
    public String priceTag(){
        return this.name + " $ " + this.price + "(manufacture date :" + this.manufactureDate + ")";

    }
    public Date getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
   public UsedProduct(){

   }

}
