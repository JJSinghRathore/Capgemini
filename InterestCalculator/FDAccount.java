package Day2.InterestCalculator;

public class FDAccount extends Account {
    double interestRate;
    double amount;
    int noOfDays;
    int ageOfACHolder;

    public FDAccount(double amount, int noOfDays, int ageOfACHolder) throws InvalidValueException{
        if (amount < 0) throw new InvalidValueException("Invalid amount.");
        if (noOfDays < 0) throw new InvalidValueException("Invalid No. of days.");
        if (ageOfACHolder < 0) throw new InvalidValueException("Invalid age.");

        this.amount = amount;
        this.noOfDays = noOfDays;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    double calculateInterest() {

        if(amount<10000000){
            if(noOfDays>=7 && noOfDays<=10){
                interestRate = (ageOfACHolder<60)?4.50:5.00 ;
            }else if(noOfDays>=15 && noOfDays<=29){
                interestRate = (ageOfACHolder<60)?4.75:5.25 ;
            }else if(noOfDays>=30 && noOfDays<=45){
                interestRate = (ageOfACHolder<60)?5.50 :6.00 ;
            }else if(noOfDays>=45 && noOfDays<=60){
                interestRate = (ageOfACHolder<60)?7.00: 7.50 ;
            }else if(noOfDays>=61 && noOfDays<=184) {
                interestRate = (ageOfACHolder < 60) ? 7.50 : 8.00;
            }else if(noOfDays>=185 && noOfDays<=365) {
                interestRate = (ageOfACHolder < 60) ? 8.00 : 8.50;
            }
        }else {
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = 6.50;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                interestRate = 6.75;
            } else if (noOfDays >= 30 && noOfDays <= 45) {
                interestRate = 6.75;
            } else if (noOfDays >= 46 && noOfDays <= 60) {
                interestRate = 8.00;
            } else if (noOfDays >= 61 && noOfDays <= 184) {
                interestRate = 8.50;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                interestRate = 10.00;
            }
        }
        return (amount*interestRate)/100;

    }

}
