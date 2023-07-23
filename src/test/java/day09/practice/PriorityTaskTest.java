package day09.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PriorityTaskTest {

	@Test
	public void testSortTasksByPriority() {
		
		List<PrioTask> array = new ArrayList<>();
		PrioTask task1 = new PrioTask("Gardening", 2, "2015-06-05", 1);
		PrioTask task2 = new PrioTask("Swimming", 1, "2023-07-22", 2);
		PrioTask task3 = new PrioTask("Swimming", 1, "2023-08-22", 2);
		PrioTask task4 = new PrioTask("Playing with pets", 3, "2033-09-30", 3);
		array.add(task1);
		array.add(task2);
		array.add(task3);
		array.add(task4);
		
		List<PrioTask> sortedArray = new ArrayList<>();
		PrioTask task5 = new PrioTask("Swimming", 1, "2023-07-22", 2);
		PrioTask task6 = new PrioTask("Swimming", 1, "2023-08-22", 2);
		PrioTask task7 = new PrioTask("Gardening", 2, "2015-06-05", 1);
		PrioTask task8 = new PrioTask("Playing with pets", 3, "2033-09-30", 3);
		sortedArray.add(task5);
		sortedArray.add(task6);
		sortedArray.add(task7);
		sortedArray.add(task8);
		System.out.println(array);
	
		
		Collections.sort(sortedArray);
		System.out.println(sortedArray);
		
		assertEquals(array, sortedArray);
	}

	

}
