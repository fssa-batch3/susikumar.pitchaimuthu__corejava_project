package day02.practice;

public class User {

	String name;
	String email;
	String password;
	long phoneNo;

	 String getName() {
		return name;
	}

	void setName(String newName) {
		name = newName;
	}

	 String getEmail() {
		return email;
	}

	 void setEmail(String newEmail) {
		email = newEmail;
	}

	 long getPhoneNo() {
		return phoneNo;
	}

	 void setPhoneNo(long newPhoneNo) {
		phoneNo = newPhoneNo;
	}

	 String getPassword() {
		return password;
	}

	 void setPassword(String newPassword) {
		password = newPassword;
	}

	public String toString() {
		String userDetails = "{ name: " + name + " email: " + email + " phoneNo: " + phoneNo + " }";
		System.out.println(userDetails);
		return userDetails;
	}

	private static void main(String[] args) {

		User user1 = new User();
		user1.setName("Surya");
		user1.setEmail("surya@gmail.com");
		user1.setPhoneNo(9876543210L);
		user1.setPassword("supersecretpassword");

		user1.toString();

		User user2 = new User();
		user2.setName("Vijay");
		user2.setEmail("vijay@gmail.com");
		user2.setPhoneNo(9876543210L);
		user2.setPassword("highlysecurepassword");
		user1.toString();

	}
}
