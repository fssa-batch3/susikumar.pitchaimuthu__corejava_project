package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PrioTask implements Comparable<PrioTask> {
	private int id;
	private String name;
	private LocalDate deadLine;
	private int priority;

	public PrioTask(String name, int id, String date, int priority) {
		this.name = name;
		this.id = id;
		this.deadLine = LocalDate.parse(date);
		this.priority = priority;
	}

	public LocalDate getDeadLine() {
		return deadLine;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "Task : " + name + ", Deadline :" + deadLine + ", Id :" + id + ", Priority" + priority;
	}

	@Override
	public int compareTo(PrioTask task) {
		if (priority == task.getPriority()) {
			return 0;
		} else {
			if (this.priority > task.getPriority()) {
				return 1;
			} else {
				return -1;
			}

		}
	}
}

public class PriorityTask {

	public static void main(String[] args) {
		List<PrioTask> array = new ArrayList<>();
		PrioTask task1 = new PrioTask("Swimming", 1, "2023-07-22", 2);
		PrioTask task4 = new PrioTask("Swimming", 1, "2023-07-22", 2);
		PrioTask task2 = new PrioTask("Gardening", 2, "2015-06-05", 1);
		PrioTask task3 = new PrioTask("Playing with pets", 3, "2033-09-30", 3);
		array.add(task1);
		array.add(task2);
		array.add(task3);
		array.add(task4);

		System.out.println(array);

		Collections.sort(array);

		System.out.println(array);

	}

}
