/*
A Simple in Java in order to solve simple banking stuffs
*/

//Code is below:

import java.util.*;

class Account
{
    int acc_no;
	String name;
	int amount;
	int w;
	int d;
    public void accountdata()
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Account No: ");
		acc_no = scan.nextInt();
		System.out.println("Enter name: ");
		name = scan.next();
		System.out.println("Enter initial amount in account: ");
		amount = scan.nextInt();
    }
	public void display()
	{
		System.out.println("Your account number is: "+acc_no);
		System.out.println("Your account name is: "+name);
	}	
    public void check()
    {
		if (amount > 0)
			System.out.println("Your balance is: "+amount);
		else
			System.out.println("Your balance is null");
	}
	public void withdraw()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw: ");
		w = scan.nextInt();
		amount = amount - w;
	}
	public void deposit()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount you want deposit: ");
		d = scan.nextInt();
		amount = d + amount;
	}
}
class Bank
{
    public static void main(String args[])
    {
        Account A1 = new Account();
		A1.accountdata();
		A1.display();
		A1.check();
		A1.deposit();
		A1.check();
		A1.withdraw();
		A1.check();
    }
}
