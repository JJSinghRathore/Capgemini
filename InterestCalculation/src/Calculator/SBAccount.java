package Calculator;

class SBAccount extends Account {

    String accountType;

    SBAccount(double amount, String accountType) {
        this.amount = amount;
        this.accountType = accountType;
    }

    @Override
    double calculateInterest() throws InvalidInputException {

        if (amount < 0)
            throw new InvalidInputException("Invalid Amount");
        if (accountType.equalsIgnoreCase("Normal"))
            interestRate = 4;
        else if (accountType.equalsIgnoreCase("NRI"))
            interestRate = 6;
        else
            throw new InvalidInputException("Invalid Account Type");

        return (amount * interestRate) / 100;
    }
}