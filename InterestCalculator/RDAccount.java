package Day2.InterestCalculator;

public class RDAccount extends Account {

    double interestRate;
    double amount;
    int noOfMonths;
    double monthlyAmount;
    int ageOfACHolder;

    public RDAccount(int noOfMonths, double monthlyAmount, int ageOfACHolder) throws InvalidValueException {
        if (monthlyAmount < 0) throw new InvalidValueException("Invalid amount.");
        if (noOfMonths < 0) throw new InvalidValueException("Invalid Number of months.");
        if (ageOfACHolder < 0) throw new InvalidValueException("Invalid age.");
        this.noOfMonths = noOfMonths;
        this.monthlyAmount = monthlyAmount;
        this.ageOfACHolder = ageOfACHolder;
    }
    @Override
    double calculateInterest() {
        if(noOfMonths > 0 && noOfMonths <=6) {
            interestRate = (ageOfACHolder<60)?7.50:8.00 ;
        }else if(noOfMonths > 6 && noOfMonths <=9) {
            interestRate = (ageOfACHolder<60)?7.75:8.25;
        }else if(noOfMonths > 9 && noOfMonths <=12) {
            interestRate = (ageOfACHolder<60)?8.00:8.50;
        }else if(noOfMonths > 12 && noOfMonths <=15) {
            interestRate = (ageOfACHolder<60)?8.25:8.75;
        }else if(noOfMonths > 15 && noOfMonths <=18) {
            interestRate = (ageOfACHolder<60)?8.50:9.00;
        }else if(noOfMonths > 18 && noOfMonths <=21) {
            interestRate = (ageOfACHolder<60)?8.75:9.25;
        }
        else{
            System.out.println("Invalid");
        }
        return (amount*interestRate)/100;
    }
}
