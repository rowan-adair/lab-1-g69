package tests;

import model.User;

public class UserTests {

	public static void main(String[] args) {
//		User testUser = new User("mike", "my_password", "Mike", "Smith", "07771234567");
//		
//		System.out.println(testUser);
			
		// 1 - Setup the object and test data
		// See the four steps in:
		
		String test_username = "mike";
		String test_password = "my_password";
		String test_first_name = "Mike";
		String test_last_name = "Smith";
		String test_mobile_number = "07771234567";
		
		User testUser = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);
		
		Boolean passed = true;
		
		if (testUser.getUsername() != test_username) {
			System.out.println("TC1 Failed: username did not match");
			passed = false;
		} else {
			System.out.println("TC1 Succeeded: username did match");	
		}
		
		if(testUser.getPassword() != test_password) {
			System.out.println("TC2 Failed: password did not match");
			passed = false;
		} else {
			System.out.println("TC2 Succeeded: password did match");	
		}
		
		if(testUser.getFirst_name() != test_first_name) {
			System.out.println("TC3 Failed: first name did not match");
			passed = false;
		} else {
			System.out.println("TC3 Succeeded: first name did match");	
		}
		
		if(testUser.getLast_name() != test_last_name) {
			System.out.println("TC4 Failed: last name did not match");
			passed = false;
		} else {
			System.out.println("TC4 Succeeded: last name did match");	
		}
		
		if(testUser.getMobile_number() != test_mobile_number) {
			System.out.println("TC5 Failed: mobile number did not match");
			passed = false;
		} else {
			System.out.println("TC5 Succeeded: mobile number did match");	
		}
		
		if(passed) {
			System.out.println("All test conditions passed");
		} else {
			System.out.println("One of the test conditions have failed.");
		}

	}
}
