package tests;

import java.util.Date;

import model.Account;

public class AccountTests {

	
	public static void main(String [] args) {
		String test_account_number = "12345";
		String test_username_of_account_holder = "jim";
		String test_account_type = "checking";
		Date test_account_opening_date = new Date();
		
		Account testAccount = new Account(test_account_number,test_username_of_account_holder, test_account_type, test_account_opening_date);
		
		assert testAccount.getAccount_number() == test_account_number;
		assert testAccount.getUsername_of_account_holder() == test_username_of_account_holder;
		assert testAccount.getAccount_type() == test_account_type;
		assert testAccount.getAccount_opening_date() == test_account_opening_date;
		
		System.out.println("All assertions have passed.");
		
	}
}
