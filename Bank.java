import java.io.*;

class BankAccount{
	float balance = 12;
	void deposit(int amt){
		balance = balance + amt;
		System.out.println("The deposited amount is : " + amt);
		System.out.println("The total balance is : " +balance);
	}
}

class Bank{
	public static void main(String[] args){
		BankAccount acc =new BankAccount();
		acc.deposit(1000);

	}
}