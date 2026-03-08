package secureSystem;

public class ATMSystem {
	public static void main(String[]args) {
		try {

            ATMAccount acc1 = new SavingAccount(101, "Pragya");
            ATMAccount acc2 = new SalaryAccount(102, "Aniket");

            acc1.withdrawal(5000);
            System.out.println("Savings Balance: " + acc1.getBalance());

            acc2.withdrawal(30000);
            System.out.println("Salary Balance: " + acc2.getBalance());

        }
        catch (InvalidTransactionException e) {
            System.out.println("Invalid Transaction: " + e.getMessage());
        }
        catch (InsufficientFundsException e) {
            System.out.println("Insufficient Funds: " + e.getMessage());
        }
        finally {
            System.out.println("ATM Transaction Finished");
        } 
		
		
	}
}
// interface
interface ATMOperations{
	void withdrawal(double amount) throws InvalidTransactionException, InsufficientFundsException ;
	void withdrawal(double amount, int pin) throws InvalidTransactionException, InsufficientFundsException;
}

// abstract class
abstract class ATMAccount implements ATMOperations{
	private double accNumber;
	private String accHolderName;
	private double balance;
	
	
public ATMAccount(double accNumber, String accHolderName) {
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.balance = 50000;
	}


// getter
	public double getBalance() {
		return balance;
	}
	
// debit method 
	protected void debit(double amount) throws InvalidTransactionException, InsufficientFundsException {
		if(amount<=0) {
			throw new InvalidTransactionException("Amount must be positive");
		}
		if(amount>balance) {
			throw new InsufficientFundsException("Insuffient balance ");
		}
	
		
		balance-=amount;
	}
	
// withdrawal method without pin

	public void withdrawal(double amount) throws InvalidTransactionException, InsufficientFundsException {
		debit(amount); 
		System.out.println("Withdrawal successful: " + amount);
	}
	
// withdrawal method with pin
	public void withdrawal(double amount, int pin) throws InvalidTransactionException, InsufficientFundsException {
		debit(amount);
		System.out.println("Withdrawal successful with PIN: " + amount);
	}
	
}

// checked exception
class InvalidTransactionException extends Exception{
	public InvalidTransactionException(String msg) {
		super(msg);
	}
}

// unchecked exception
class InsufficientFundsException extends RuntimeException{
	public InsufficientFundsException(String msg) {
		super(msg);
	}
}

// saving account
class SavingAccount extends ATMAccount{

	public SavingAccount(double accNumber, String accHolderName) {
		super(accNumber, accHolderName);
	}
	@Override
	public void withdrawal(double amount) throws InvalidTransactionException, InsufficientFundsException{
		if(amount > 20000) {
			   throw new InvalidTransactionException("Limit exceed for today transaction");
		}
		super.withdrawal(amount);
	}
	
	
}

// salary account
class SalaryAccount extends ATMAccount{

	public SalaryAccount(double accNumber, String accHolderName) {
		super(accNumber, accHolderName);
	}
	@Override
    public void withdrawal(double amount)
            throws InvalidTransactionException, InsufficientFundsException {

        if (amount > 50000) {
            throw new InvalidTransactionException(
                    "Salary account daily limit is 50000");
        }

        super.withdrawal(amount);
    }
}
