package Calculator;

class RDAccount extends Account {

    int noOfMonths;
    int age;
    double monthlyAmount;

    RDAccount(double monthlyAmount, int noOfMonths, int age) {
        this.monthlyAmount = monthlyAmount;
        this.noOfMonths = noOfMonths;
        this.age = age;
    }

    @Override
    double calculateInterest() throws InvalidInputException {

        if (monthlyAmount < 0 || noOfMonths < 0)
            throw new InvalidInputException("Invalid Input");

        if (noOfMonths == 6)
            interestRate = (age >= 60) ? 8.00 : 7.50;

        else if (noOfMonths == 9)
            interestRate = (age >= 60) ? 8.25 : 7.75;

        else if (noOfMonths == 12)
            interestRate = (age >= 60) ? 8.50 : 8.00;

        else if (noOfMonths == 15)
            interestRate = (age >= 60) ? 8.75 : 8.25;

        else if (noOfMonths == 18)
            interestRate = (age >= 60) ? 9.00 : 8.50;

        else if (noOfMonths == 21)
            interestRate = (age >= 60) ? 9.25 : 8.75;

        else
            throw new InvalidInputException("Invalid Months");

        double totalAmount = monthlyAmount * noOfMonths;
        return (totalAmount * interestRate) / 100;
    }
}