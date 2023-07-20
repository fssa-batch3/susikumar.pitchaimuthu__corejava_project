package day09.practice;

import java.time.LocalDate;
import java.util.*;

class AddTask implements Comparable<AddTask> {
	private int id;
	private String name;
	private LocalDate deadLine;

	public AddTask(String name, int id, String date) {
		this.name = name;
		this.id = id;
		this.deadLine = LocalDate.parse(date);
	}

	public LocalDate getDeadLine() {
		return deadLine;
	}

	@Override
	public String toString() {
		return "Task : " + name + ", Deadline :" + deadLine + ", Id :" + id;
	}

	@Override
	public int compareTo(AddTask task) {
		return this.deadLine.compareTo(task.getDeadLine());
	}
}

public class Task {

	public static void main(String[] args) {
		List<AddTask> arr = new ArrayList<>();
		AddTask task1 = new AddTask("Swimming", 1, "2023-07-22");
		AddTask task4 = new AddTask("Swimming", 1, "2023-07-22");
		AddTask task2 = new AddTask("Gardening", 2, "2015-06-05");
		AddTask task3 = new AddTask("Playing with pets", 3, "2033-09-30");

		arr.add(task1);
		arr.add(task2);
		arr.add(task3);
		arr.add(task4);

		System.out.println(arr);

		Collections.sort(arr);

		System.out.println(arr);

	}

}
