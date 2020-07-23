/*
A Simple in Java in order to solve simple banking stuffs
*/

//Code is below:

import java.util.*;

class Account			//Created a account class
{
    int acc_no;
	String name;
	int amount;
	int w;
	int d;
    public void accountdata()		//User Input function
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Account No: ");
		acc_no = scan.nextInt();
		System.out.println("Enter name: ");
		name = scan.next();
		System.out.println("Enter initial amount in account: ");
		amount = scan.nextInt();
    }
	public void display()		//Display Function
	{
		System.out.println("Your account number is: "+acc_no);
		System.out.println("Your account name is: "+name);
	}	
    public void check()			//Check function in order to check the balance
    {
		if (amount > 0)
			System.out.println("Your balance is: "+amount);
		else
			System.out.println("Your balance is null");
	}
	public void withdraw()		//function Withdrawing the money
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw: ");
		w = scan.nextInt();
		amount = amount - w;
	}
	public void deposit()		//function Depositing the money
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount you want deposit: ");
		d = scan.nextInt();
		amount = d + amount;
	}
}
class Bank				//Main class
{
    public static void main(String args[])	//Main Function
    {
        Account A1 = new Account();		//Object Creation
		A1.accountdata();
		A1.display();
		A1.check();
		A1.deposit();
		A1.check();
		A1.withdraw();
		A1.check();
    }
}
