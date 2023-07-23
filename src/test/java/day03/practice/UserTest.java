package day03.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {

	@Test
	public void checkUserName() {
		User user = new User("Susikumar", "susikumar.pitchaimuthu@fssa.freshworks.com", "susi@123");
		String name = "Susikumar";
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
		User user = new User("Susikumar", "susikumar.pitchaimuthu@fssa.freshworks.com", "susi@123");

		String email = "susikumar.pitchaimuthu@fssa.freshworks.com";

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
		User user = new User("Susikumar", "susikumar.pitchaimuthu@fssa.freshworks.com", "susi@123");

		String password = "susi@123";
		System.out.println("User password is : " + password);

		if (user.getPassword().equals(password)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		assertEquals(user.getPassword(), password);
	}

	

}
