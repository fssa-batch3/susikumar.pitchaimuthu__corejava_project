package day09.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TaskTest {

	@Test
	public void checkTaskData() {

		List<AddTask> arr = new ArrayList<>();
		AddTask task1 = new AddTask("Swimming", 1, "2023-07-22");
		AddTask task4 = new AddTask("Swimming", 1, "2023-08-22");
		AddTask task2 = new AddTask("Gardening", 2, "2015-06-05");
		AddTask task3 = new AddTask("Playing with pets", 3, "2033-09-30");

		arr.add(task1);
		arr.add(task2);
		arr.add(task3);
		arr.add(task4);

		System.out.println(arr);
		List<AddTask> arr2 = new ArrayList<>();
		AddTask task5 = new AddTask("Gardening", 2, "2015-06-05");
		AddTask task6 = new AddTask("Swimming", 1, "2023-07-22");
		AddTask task7 = new AddTask("Swimming", 1, "2023-08-22");
		AddTask task8 = new AddTask("Playing with pets", 3, "2033-09-30");

		arr2.add(task5);
		arr2.add(task6);
		arr2.add(task7);
		arr2.add(task8);

		Collections.sort(arr);

		System.out.println(arr);
		System.out.println(arr2);

		assertEquals(arr, arr2);

	}

}
