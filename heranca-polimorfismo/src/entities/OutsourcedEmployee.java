package entities;

public class OutsourcedEmployee extends Employee{
    protected Double additionalCharge;
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge ) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee() {
        super();
    }
    @Override
    public Double payment (){
        double aumenta = this.additionalCharge * 1.1;
        double value = super.payment();
        return aumenta + value;
    }
}
