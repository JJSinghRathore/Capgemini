package Day2.InterestCalculator;

public class SBAccount extends Account {

    double interestRate;
    double amount;
    String accountType;

    public SBAccount(String accountType, double amount) throws InvalidValueException{
        if (amount < 0) throw new InvalidValueException("Invalid amount.");
        this.accountType = accountType;
        this.amount = amount;
    }
    @Override
    double calculateInterest() {
        if(this.accountType.equalsIgnoreCase("Normal")) {
            interestRate = 4;
        }else if(this.accountType.equalsIgnoreCase("NRI")) {
            interestRate = 6;
        }else{
            System.out.println("Invalid Account Type");
        }
        return (amount*interestRate)/100;
    }

}
