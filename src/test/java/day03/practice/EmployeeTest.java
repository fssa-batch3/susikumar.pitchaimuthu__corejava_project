package day03.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
	@Test
	public void checkEmployeeId() {

		Employee one = new Employee(130, "Susikumar");
		int id = 130;
		System.out.println("Employee ID is : "+ id);
		
		if(one.getInt() == id) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		assertEquals(one.getInt(), id);

	}
	
	@Test
	public void checkEmployeeName() {

		Employee one = new Employee(130, "Susikumar");
		String name = "Susikumar";
		System.out.println("Employee Name is : "+ name);
		
		if(one.getString().equals(name)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		assertEquals(one.getString(), name);

	}

}
