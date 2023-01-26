package model.services;

public interface OnlinePayment {
    double paymentFee(Double amount);
    double interest(Double amount, int months);
}
