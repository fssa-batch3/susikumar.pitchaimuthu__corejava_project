package day03.practice;

public class User {

	private String name;
	private String email;
	private String password;

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getEmail() {

		return email;

	}

	public String getName() {

		return name;

	}

	public String getPassword() {

		return password;

	}

	public static void main(String[] args) {

		User use = new User("susikumar", "susikumar.pitchaimuthu@fssa.freshworks.com", "susi@123");

		System.out.println("User name : " + use.getName());
		System.out.println("User email : " + use.getEmail());
		System.out.println("User password : " + use.getPassword());

	}

}
