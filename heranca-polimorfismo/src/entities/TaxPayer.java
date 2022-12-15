package entities;

public abstract class TaxPayer {
    protected String  name;
    protected Double anualCome;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAnualCome() {
        return anualCome;
    }
    public void setAnualCome(Double anualCome) {
        this.anualCome = anualCome;
    }
    public TaxPayer(String name, Double anualCome) {
        this.name = name;
        this.anualCome = anualCome;
    }
    public TaxPayer() {
    }
   public abstract double tax();
    
}
