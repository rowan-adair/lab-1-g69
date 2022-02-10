/**
 * 
 */
package model;

/**
 * @author 40226787
 *
 */
public class User {
	private String username;
	private String password;
	private String first_name;
	private String last_name;
	private String mobile_number;
	
	/**
	 * @param username
	 * @param password
	 * @param first_name
	 * @param last_name
	 * @param mobile_number
	 */
	public User(String username, String password, String first_name, String last_name, String mobile_number) {
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_number = mobile_number;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return the mobile_number
	 */
	public String getMobile_number() {
		return mobile_number;
	}

	/**
	 * @param mobile_number the mobile_number to set
	 */
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	@Override
	public String toString() {
		return username + " " + password + " " + first_name + " "
				+ last_name + " " + mobile_number;
	}
	
	
	
}
