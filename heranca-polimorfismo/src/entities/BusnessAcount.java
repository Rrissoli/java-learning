package entities;

public final class BusnessAcount extends Account{
    private Double loanLimit;
    public  BusnessAcount(){
        super();

    }
    public BusnessAcount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }
    public void loan(double amount){
         if(amount <= loanLimit){
            balance += amount - 10.0;
         }        
    }
    public Double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
  @Override
		public void Withdraw(double amount){
			super.Withdraw(amount);
			balance -= 2.0;
		}
    
    
}
