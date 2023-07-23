package day06.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskTest {

	@Test
	public void checkArrayListTaskNameData() {
		addTask one = new addTask(1, "Finish report", "Complete the quarterly sales report.");
		System.out.println("The task name is : Finish report");
		if (one.getName().equals(one.taskName)) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

		assertEquals(one.getName(), one.taskName);
	}

	@Test
	public void checkArrayListTaskDescriptionData() {
		addTask one = new addTask(1, "Finish report", "Complete the quarterly sales report.");
		System.out.println("The task description is complete the quarterly sales report.");

		if (one.getDescription().equals(one.description)) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

		assertEquals(one.getDescription(), one.description);
	}

	@Test
	public void checkArrayListTaskIdData() {
		addTask one = new addTask(1, "Finish report", "Complete the quarterly sales report.");
		System.out.println("The task ID is " + 1);
		if (one.getId() == one.taskId) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

		assertEquals(one.getId(), one.taskId);
	}

}
