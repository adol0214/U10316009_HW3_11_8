/**
 * Name:陳信邦
 * ID: U10316009
 * Ex: 11.8
 */
import java.util.Date;
import java.util.ArrayList;

public class Homework3 {
	public static void main (String[] args){
		Account account1 = new Account(1122,1000,"George");

		account1.setAnnualInterestRate(1.5);

		//invoke deposit method
		account1.deposit(30);		
		account1.deposit(40);
		account1.deposit(50);

		//invoke withdraw method
		account1.withdraw(5);
		account1.withdraw(4);
		account1.withdraw(2);

		//print result
		System.out.println(account1.toString());
	}
}

class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	private String name;
	ArrayList<Transaction> transaction = new ArrayList<Transaction>();
	int numbers = 0;
	//constructor
	Account(int newId, double newBalance, String newName){
		name = newName;
		id = newId;
		balance = newBalance;
	}
	
	Account(int newId,double newBalance){
		id = newId;
		balance = newBalance;
	}
	
	//set get
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
		transaction.add(new Transaction('W', amount, balance, "end"));
		System.out.println("\nDetail: " + ((Transaction)transaction.get(numbers)).getDescription());
		numbers ++;
	}

	void deposit(double amount){
		balance += amount;
		transaction.add(new Transaction('D', amount, balance, "end"));
		System.out.println("\nDetail: " + ((Transaction)transaction.get(numbers)).getDescription());
		numbers ++;
	}

	public String toString(){
		return "The account:\n" + "The ID: " + getId() + "\nThe balance: " + getBalance() +
				"\nThe monthly interest: " + getMonthlyInterest() + "\nThe date: " + getDateCreated();
	}
}

class Transaction{
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	//constructor
	Transaction(){
		date = new Date();
		type = '\u0000';
		amount = 0;
		balance = 0;
		description = "";
	}
	
	Transaction(char newType, double newAmount,double newBalance, String newDescription){
		date = new Date();
		type = newType;
		amount = newAmount;
		balance = newBalance;
		description = newDescription;
	}
	
	
	//set get
	void setDate(){
		date = new Date();
	}
	
	void setType(char newType){
		type = newType;
	}
	
	void setAmount(double newAmount){
		amount = newAmount;
	}
	
	void setBalance(double newBalance){
		balance = newBalance;
	}
	
	void setDescription(String newDescription){
		description = newDescription;
	}
	
	Date getDate(){
		return date;
	}
	
	char getType(){
		return type;
	}
	
	double getAmount(){
		return amount;
	}
	
	double getBalance(){
		return balance;
	}
	
	String getDescription(){
		return "\nType : " + getType() + "\nAmount : " + getAmount() + "\nBalance : " + getBalance() + "\nDate : " + getDate();
	}

}
