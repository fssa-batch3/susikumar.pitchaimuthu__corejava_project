package day06.practice;

import java.util.ArrayList;

import day06.practice.addTask;

public class TaskTest {

	public static void main(String[] args) {

		ArrayList<addTask> taskList = new ArrayList<>();

		taskList.add(new addTask(1, "Swimming", "Complete the quarterly sales report."));
		taskList.add(new addTask(2, "Play", "Purchase items for the week."));
		taskList.add(new addTask(3, "Gardening", "Prepare for the upcoming Java exam."));

		for (addTask task : taskList) {
			System.out.println(task);
		}

		Task one = new Task();

		boolean result = one.findTaskByName("Finish report", taskList);
		System.out.println("Your given task present is " + result);

	}

}
