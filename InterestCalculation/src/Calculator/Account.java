package Calculator;

abstract class Account {
    double interestRate;
    double amount;

    abstract double calculateInterest() throws InvalidInputException;
}
