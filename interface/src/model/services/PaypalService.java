package model.services;

public class PaypalService implements OnlinePayment{
   
    public double paymentFee(Double amount){
        return amount * 0.02;
    }
    @Override
    public double interest(Double amount, int months) {
        return amount * 0.01 * months;
    }
    
}
