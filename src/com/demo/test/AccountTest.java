package com.demo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.bo.Account;

public class AccountTest 
{

	/*@Test
	public void test() 
	{
		fail("Not yet implemented"); // TODO
	}*/
	Account account = new Account();
	Account account2 = new Account();

	@Test
	public void testInitialBalance()
	{
		Account account = new Account();
		assertEquals(account.transfer(50), true);
	}
	@Test
	public void testWithInitialBalance()
	{
		Account account = new Account();
		assertEquals(account.transfer(50), true);
	}
	@Test
	public void testWithCustomerBalance()
	{
		Account account2 = new Account("Tommy",250);
		
		assertEquals(account2.transfer(500), false);
	}
}
