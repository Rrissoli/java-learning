package entities;

public class Company extends TaxPayer {
    
    protected Integer numberOfEmployees;
    

    public Company(String name, Double anualCome, Integer numberOfEmployees) {
        super(name, anualCome);
        this.numberOfEmployees = numberOfEmployees;
    }
    public Company() {
    }

    @Override
    public double tax(){
        double tax = this.getAnualCome();
        if(numberOfEmployees > 10){
            tax = tax * 0.14;
        }else{
            tax = tax * 0.16;
        }
        return tax;
    }


    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }


    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
