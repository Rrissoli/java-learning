package model.services;

import java.text.DateFormat;
import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
    private OnlinePayment onlinePayment;
    
    public ContractService(OnlinePayment onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getValue()/months;
        for (int i = 1; i < months; i++) {
            LocalDate duedate =  contract.getDate().plusMonths(i);
            double interest = onlinePayment.interest(basicQuota, i);
            double fee = onlinePayment.paymentFee(interest);
            Double parcela = basicQuota + interest + fee ;
            contract.getInstallments().add(new Installment(duedate, parcela));
        }
    }
}
