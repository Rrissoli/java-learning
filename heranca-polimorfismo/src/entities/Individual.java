package entities;



public class Individual extends TaxPayer{
    protected Double healthExpendures;

    
    
    public Individual(String name, Double anualCome, Double healthExpendures) {
        super(name, anualCome);
        this.healthExpendures = healthExpendures;
    }

    @Override
    public double tax(){
    double renda = this.getAnualCome() / 100;
    double tax;
    if(renda < 20000.00){
    tax = renda * 0.15;
    }else{
        if(this.healthExpendures > 0){
            tax = (renda *0.25) - (this.healthExpendures * 0.50);
        }else{
            tax = (renda *0.25);
        }
    }
    return tax;
    }

    public Double getHealthExpendures() {
        return healthExpendures;
    }



    public void setHealthExpendures(Double healthExpendures) {
        this.healthExpendures = healthExpendures;
    }
}
