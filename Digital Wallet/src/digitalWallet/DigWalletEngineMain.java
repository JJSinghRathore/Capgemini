package digitalWallet;

// interface 
interface TransactionOperations{
	void addMoney(double amount ,String mode ) throws InvalidAmountException;

	void transferMoney(double amount) throws InvalidAmountException, InsufficientBalanceException;
	void transferMoney(double amount, String remark)throws InvalidAmountException, InsufficientBalanceException;
}

// abstract Wallet
abstract class DigWalEngineMain implements TransactionOperations{

	private String walletId;
	private String ownerName;
	private double balance;
	
	public DigWalEngineMain(String walletId, String ownerName) {
		this.walletId = walletId;
		this.ownerName = ownerName;
		this.balance = 0.0;
	}
	// getter method 
	public double getBalance() {
		return balance;
	}
	public String getWalletId() {
		return walletId;
	}
	public String getOwnerName() {
		return ownerName;
	}

	// protected methods for credit and debit
	protected void credit(double amount) throws InvalidAmountException{
		if(amount<=0) {
			 throw new InvalidAmountException("Amount must be Positive");
		}
		balance+=amount;
		
	}
	
	protected void debit(double amount) throws InvalidAmountException, InsufficientBalanceException {
		if(amount<=0) {
			 throw new InvalidAmountException("Amount must be Positive");
		}
		if(amount>balance) {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		
		balance-=amount;
	}


}

// creating basic wallet class
class BasicWallet extends DigWalEngineMain{

	public BasicWallet(String walletId, String ownerName) {
		super(walletId, ownerName);
	}
	
	@Override
	public void addMoney(double amount, String mode) throws InvalidAmountException{
		credit(amount);
		System.out.println("Basic Wallet: Money added via "+ mode);
	}
	
	@Override
	public void transferMoney(double amount) throws InvalidAmountException, InsufficientBalanceException{
		debit(amount);
		System.out.println("Basic Wallet transfer successful: "+ amount);
	}
	
	@Override
	public void transferMoney(double amount, String remarks) throws InvalidAmountException, InsufficientBalanceException{
		debit(amount);
		System.out.println("Basic Wallet transfer successful: "+ amount+" | Remarks: "+ remarks);
	}
		
}

// creating premium wallet class
class PremiumWallet extends DigWalEngineMain{

	public PremiumWallet(String walletId, String ownerName) {
		super(walletId, ownerName);
	}
	
	@Override
	public void addMoney(double amount, String mode) throws InvalidAmountException{
		credit(amount);
		System.out.println("Premium Wallet: Money added via "+ mode);
	}
	
	@Override
	public void transferMoney(double amount) throws InvalidAmountException, InsufficientBalanceException{
		debit(amount);
		System.out.println("Premium Wallet transfer successful: "+ amount);
	}
	
	@Override
	public void transferMoney(double amount, String remarks) throws InvalidAmountException, InsufficientBalanceException{
		debit(amount);
		System.out.println("Premium Wallet transfer successful: "+ amount+" | Remarks: "+ remarks);
	}
		
}

// Checked exception
class InvalidAmountException extends Exception {
	public InvalidAmountException(String message) {
		super(message);
	}

}

// Unchecked exception
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}

}


// main class

public class DigWalletEngineMain{
	public static void main(String[] args)  {
		try {
			DigWalEngineMain bWallet=new BasicWallet("w101", "Pragya");
			DigWalEngineMain pWallet=new PremiumWallet("w102", "Aniket");
			
			bWallet.addMoney(5000, "UPI");
			bWallet.transferMoney(2000);
			bWallet.transferMoney(500, "Food payment");
			System.out.println("Basic wallet Balance: "+ bWallet.getBalance());
			System.out.println("---------------------------");
			pWallet.addMoney(10000, "CARD");
			pWallet.transferMoney(2000);
			pWallet.transferMoney(1500, "Shopping");

	        System.out.println("Wallet2 Balance: " + pWallet.getBalance());
		}catch (InvalidAmountException e) {
            System.out.println("Invalid amount: " + e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction process finished.");
        }
		

	}
}