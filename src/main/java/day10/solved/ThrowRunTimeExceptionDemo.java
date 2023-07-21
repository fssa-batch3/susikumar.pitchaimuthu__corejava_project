package day10.solved;

import day07.practice.Task;

class NewTaskValidator {
       
	public static boolean validate(Task task) {
		
		if (task == null)
			throw new IllegalArgumentException("Task is null");
		else if (  task.getName()== null || "".equals(task.getName()))
			throw new IllegalArgumentException("Task name is empty");
		return true;
	}
}

public class ThrowRunTimeExceptionDemo {
	public static void main(String[] args) {
		Task task = new Task("Swimming", 4,"To do sometihg");

		NewTaskValidator.validate(task);
	}
}
