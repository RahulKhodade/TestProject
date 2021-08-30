package classesObject;

import java.util.Scanner;

//Q6

public class Account {
	int accId;
	String name;
	double balance;

	public Account() {

	}

	public Account(int accId,String name,double balance)
	{
		this.accId=accId;
		this.name=name;
		this.balance=balance;

	}

	public void display()
	{
		System.out.println("Acc no is:"+accId+ " Name is:"+name+" Balance:"+balance);
	}
	
	public void deposite(int amt)
	{
		balance=balance+amt;
		System.out.println("Total balance is:"+balance);

	}
	public void withdraw(int withdraw) {


		if(balance<withdraw)
		{
			System.out.println("Insufficient balance");
		}
		else {


			balance=balance-withdraw;
			System.out.println("Withdraw balnce is:"+balance);
		}
	}
	public void checkBalnce()
	{
		System.out.println("Total balance is:"+balance);
	}


	public static void main(String[] args) {

	
		Account a1=new Account(1000,"rahul",6000);
		a1.display();
		
		
	a1.deposite(1000);
	a1.withdraw(2000);
	a1.checkBalnce();


	}

}
