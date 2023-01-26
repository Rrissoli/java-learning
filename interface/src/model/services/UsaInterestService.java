package model.services;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService {
    Double interestrate;

    public UsaInterestService(Double interestrate) {
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
