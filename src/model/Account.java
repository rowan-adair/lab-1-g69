package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 40226787
 *
 */
public class Account {

	private String account_numner;
	private String username_of_account_holder;
	private String account_type;
	private Date account_opening_date;
	
	/**
	 * @param account_numner
	 * @param username_of_account_holder
	 * @param account_type
	 * @param account_opening_date
	 */
	public Account(String account_numner, String username_of_account_holder, String account_type,
			Date account_opening_date) {
		super();
		this.account_numner = account_numner;
		this.username_of_account_holder = username_of_account_holder;
		this.account_type = account_type;
		this.account_opening_date = account_opening_date;
	}

	/**
	 * @return the account_numner
	 */
	public String getAccount_numner() {
		return account_numner;
	}

	/**
	 * @param account_numner the account_numner to set
	 */
	public void setAccount_numner(String account_numner) {
		this.account_numner = account_numner;
	}

	/**
	 * @return the username_of_account_holder
	 */
	public String getUsername_of_account_holder() {
		return username_of_account_holder;
	}

	/**
	 * @param username_of_account_holder the username_of_account_holder to set
	 */
	public void setUsername_of_account_holder(String username_of_account_holder) {
		this.username_of_account_holder = username_of_account_holder;
	}

	/**
	 * @return the account_type
	 */
	public String getAccount_type() {
		return account_type;
	}

	/**
	 * @param account_type the account_type to set
	 */
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	/**
	 * @return the account_opening_date
	 */
	public Date getAccount_opening_date() {
		return account_opening_date;
	}

	/**
	 * @param account_opening_date the account_opening_date to set
	 */
	public void setAccount_opening_date(Date account_opening_date) {
		this.account_opening_date = account_opening_date;
	}

	@Override
	public String toString() {
		return "Account [account_numner=" + account_numner + ", username_of_account_holder="
				+ username_of_account_holder + ", account_type=" + account_type + ", account_opening_date="
				+ account_opening_date + "]";
	}
}
