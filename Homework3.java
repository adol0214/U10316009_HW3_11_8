/**
 * Name:陳信邦
 * ID: U10316009
 * Ex: 11.8
 */
import java.util.Date;

public class Homework3 {
	public static void main (String[] args){
		
	}
}

class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	String name;
	Account(String newName, int newId, double newBalance){
		name = newName;
		id = newId;
		balance = newBalance;
	}
	
	Account(int newId,double newBalance){
		id = newId;
		balance = newBalance;
	}
	
	void setId(int newId){
		id = newId;
	}
	
	void setBalance(double newBalance){
		balance = newBalance;
	}
	
	void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	int getId(){
		return id;
	}
	
	double getBalance(){
		return balance;
	}
	
	double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	Date getDateCreated(){
		return dateCreated ;
	}

	double getMonthlyInterestRate(){
		return annualInterestRate/1200 ;
	}

	double getMonthlyInterest(){
		return balance*(annualInterestRate/1200);
	}

	void withdraw(double amount){
		balance -= amount;
	}

	void deposit(double amount){
		balance += amount;
	}

	public String toString(){
		return "The account:\n" + "The ID: " + getId() + "\nThe balance: " + getBalance() +
				"\nThe monthly interest: " + getMonthlyInterest() + "\nThe date: " + getDateCreated();
	}
}

class Transaction{
	Date date;
	char type;
	double amount;
	double balance;
	String description;
	Transaction(char newType, double newAmount,double newBalance, String newDescription){
		type = newType;
		amount = newAmount;
		balance = newBalance;
		description = newDescription;
	}
	
}
