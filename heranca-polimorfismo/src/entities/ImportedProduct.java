package entities;

public class ImportedProduct extends Product{
  protected  Double customsFee;

public Double getCustomsFee() {
    return customsFee;
}

public void setCustomsFee(Double customsFee) {
    this.customsFee = customsFee;
}

public ImportedProduct(String name, Double price, Double customsFee) {
    super(name, price);
    this.customsFee = customsFee;
}
public Double TotalPrice(){
    Double finalPrice =  this.price + this.customsFee;
    return finalPrice;
}
  @Override
  public String priceTag(){
   return this.price + '$' + this.TotalPrice() + " (Customs fee: $" + this.customsFee;
  }
  
}
