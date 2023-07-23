package day02.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {

	@Test
	public void checkUserName() {
		User user = new User();
		String name = "Susikumar";
		user.setName(name);
		System.out.println("User name is : " + name);

		if (user.getName().equals(name)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		assertEquals(user.getName(), name);
	}
	
	@Test
	public void checkEmailId() {
		User user = new User();
		String email = "Susikumar@gmail.com";
		user.setEmail(email);
		System.out.println("User Email ID is : " + email);

		if (user.getEmail().equals(email)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		assertEquals(user.getEmail(), email);
	}
	
	@Test
	public void checkUserPassword() {
		User user = new User();
		String password = "susi@135SM";
		user.setPassword(password);
		System.out.println("User password is : " + password);

		if (user.getPassword().equals(password)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		assertEquals(user.getPassword(), password);
	}
	
	@Test
	public void checkUserPhoneNumber() {
		User user = new User();
		long phone = 8870737612l;
		user.setPhoneNo(phone);
		System.out.println("User mobile number is : " + phone);

		if (user.getPhoneNo() == phone) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		assertEquals(user.getPhoneNo(), phone);
	}

}
