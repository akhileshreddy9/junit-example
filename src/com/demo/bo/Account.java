/**
 * 
 */
package com.demo.bo;

/**
 * @author Akhil
 *
 */
public class Account 
{
 private String name;
 double balance;
public String getName() {
	return name;
}
public Account()
{
	balance = 100.00;
	name = "John Smith";
}
public Account(String name, double balance) {
	/*super();*/
	this.name = name;
	this.balance = balance;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public boolean transfer(double amt)
	{
		if(amt>balance)
			return false;
		else
		{
			balance = balance - amt;
			return true;
		}
	}
public double deposit(double amt) {
	balance += amt;
	
	return balance+amt;
}
public Object transfer(int amt) {
	// TODO Auto-generated method stub
	return null;
}

}
