package model.services;

import java.security.InvalidParameterException;

public class BrazilInterestService  implements InterestService{
    Double interestrate;

    public BrazilInterestService(Double interestrate) {
        this.interestrate = interestrate;
    }

    @Override
    public double getInterestRate() {
        return interestrate;
    }
    
    public void setInterestrate(Double interestrate) {
        this.interestrate = interestrate;
    }
   

   
}
