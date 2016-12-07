package edu.ilstu;
/*
 * Filename:  BankAccount.java
 *
 * Programmer:
 * ULID: 
 *
 * Date:  
 *
 * Class:  IT 168
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */



/**
 * Handles processing for a bank account
 *
 * @author Cathy Holbrook
 * @author Modified by: 
 *
 */
public class BankAccount 
{
	private final double OVERDRAFT_CHARGE=30.00;
	private String accountNumber;
	private String firstName;
	private String lastName;
	private double balance;

	public BankAccount(String accountNumber, String firstName, String lastName, double balance)
	{
		this.accountNumber=accountNumber;
		this.firstName=firstName;
		this.lastName=lastName;
		this.balance=balance;
		
	}
	/**
	 * No-arg constructor
	 */
	public BankAccount()
	{
	}

	/**
	 * 
	 * Gets the amount the customer wants to withdraw, checks to 
	 * be sure they have enough in their balance for the amount,
	 * process the withdrawal or provide an insufficient funds
	 * message.
	 *
	 * @param: withdrawal
	 *
	 */
	public void processWithdrawal(double withdrawal)
	{
		boolean sufficientFunds = validateWithdrawalAmount(withdrawal);
		
		if (sufficientFunds){
			System.out.printf("$%.2f %s", withdrawal, "\nhas been withdrawn from your account\n");
			balance = balance - withdrawal;
		} else {
			balance = balance -(withdrawal+OVERDRAFT_CHARGE);
			System.out.printf("$%s %.2f", "You do not have sufficient funds to withdraw ", 
					withdrawal);
			System.out.printf("$%s %.2f", OVERDRAFT_CHARGE+ " overdraft charge has been applied");
		}
		System.out.printf("%s $%.2f", "Your current balance is ", balance);	
	}
	
	/**
	 * 
	 * Validates whether there is enough money in the account
	 * for the amount the customer wants to withdraw.
	 *
	 * @param: 	 withdrawal
	 * @return:  sufficientFunds
	 *
	 */
	public boolean validateWithdrawalAmount(double withdrawal)
	{
		boolean sufficientFunds = true;
		
		if (withdrawal >= balance){
			sufficientFunds = false;
		}
		
		return sufficientFunds;
	}
	
	/**
	 *  
	 * Processes a deposit by adding the amount to the balance
	 *
	 * @param: 	 deposit
	 *
	 */
	public void processDeposit(double deposit)
	{
		System.out.printf("\n$%.2f %s", deposit, " has been added to your account");
		balance = balance + deposit;
	}
	
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() 
	{
		return accountNumber;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() 
	{
		return balance;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	public String toString()
	{
		return accountNumber+"/n"+firstName+"/n"+lastName+"/n"+balance;
	}

	
	
}
