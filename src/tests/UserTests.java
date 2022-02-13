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
						
		String [] failure_results = {"TC1 Failed: username did not match", "TC2 Failed: password did not match","TC3 Failed: first name did not match", "TC4 Failed: last name did not match", "TC5 Failed: mobile number did not match"};
		String [] success_results = {"TC1 Succeeded: username did match", "TC2 Succeeded: password did match", "TC3 Succeeded: first name did match", "TC4 Succeeded: last name did match", "TC5 Succeeded: mobile number did match"};
		
		User testUser = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);
		
		Boolean passed = true;
	
		if (testUser.getUsername() != test_username) {
			System.out.println(failure_results[0]);
			passed = false;
		} else {
			System.out.println(success_results[0]);
		}
		if(testUser.getPassword() != test_password) {
			System.out.println(failure_results[1]);
			passed = false;
		} else {
			System.out.println(success_results[1]);
		}
		
		if(testUser.getFirst_name() != test_first_name) {
			System.out.println(failure_results[2]);
			passed = false;
		} else {
			System.out.println(success_results[2]);
		}
		if(testUser.getLast_name() != test_last_name) {
			System.out.println(failure_results[3]);
			passed = false;
		} else {
			System.out.println(success_results[3]);
		}
		if(testUser.getMobile_number() != test_mobile_number) {
			System.out.println(failure_results[4]);
			passed = false;
		} else {
			System.out.println(success_results[4]);
		}
		

		
		if(passed) {
			System.out.println("All test conditions passed");
		} else {
			System.out.println("One of the test conditions have failed.");
		}
		
		// Assertions
		assert testUser.getUsername() == test_username;
		assert testUser.getPassword() == test_password;
		assert testUser.getFirst_name() == test_first_name;
		assert testUser.getLast_name() == test_last_name;
		assert testUser.getMobile_number() == test_mobile_number;
		
		assert 1==2;
		
		System.out.println("All Java assertions in the test suite passed (none failed).");
		
	}
}
