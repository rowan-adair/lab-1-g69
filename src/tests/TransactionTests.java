package tests;

import java.time.LocalDateTime;
import java.util.Date;

import model.Transaction;

public class TransactionTests {
	public static void main(String [] args) {
		
		String test_account_number = "12345678";
		Double test_transaction_amount = 100.00;
		Date test_date = new Date();
		
		Transaction testTransaction = new Transaction(test_account_number, test_transaction_amount, test_date);
		
		assert testTransaction.getAccount_number() == test_account_number;
		assert testTransaction.getTransaction_amount() == test_transaction_amount;
		assert testTransaction.getTransaction_date() == test_date;
		
		System.out.println("All assertions have passed.");
	}
}
