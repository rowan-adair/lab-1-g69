/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author 40226787
 *
 */
public class Transaction {
	private String account_number;
	private double transaction_amount;
	private Date transaction_date;
	/**
	 * @param account_number
	 * @param transaction_amount
	 * @param transaction_date
	 */
	public Transaction(String account_number, double transaction_amount, Date transaction_date) {
		super();
		this.account_number = account_number;
		this.transaction_amount = transaction_amount;
		this.transaction_date = transaction_date;
	}
	/**
	 * @return the account_number
	 */
	public String getAccount_number() {
		return account_number;
	}
	/**
	 * @param account_number the account_number to set
	 */
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	/**
	 * @return the transaction_amount
	 */
	public double getTransaction_amount() {
		return transaction_amount;
	}
	/**
	 * @param transaction_amount the transaction_amount to set
	 */
	public void setTransaction_amount(double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	/**
	 * @return the transaction_date
	 */
	public Date getTransaction_date() {
		return transaction_date;
	}
	/**
	 * @param transaction_date the transaction_date to set
	 */
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	@Override
	public String toString() {
		return "Transfer [account_number=" + account_number + ", transaction_amount=" + transaction_amount
				+ ", transaction_date=" + transaction_date + "]";
	}
	
	
}
