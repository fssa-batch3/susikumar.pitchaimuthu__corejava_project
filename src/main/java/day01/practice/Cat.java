package day01.practice;

import day01.solved.packageOne.Dog;

public class Cat {

	private boolean hasDots;
	private String color;
	private int age;
	private String speak;

	// Constructor
	public Cat(int age, String color, String speak) {

		this.color = color;
		this.age = age;
		this.speak = speak;
	}

	// Getters and setters

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getspeak() {
		return speak;
	}

	public void setSpeak(String speak) {
		this.speak = speak;
	}

	public static void main(String[] args) {

		Cat cat1 = new Cat(4, "purple", "Meow!");
		Cat cat2 = new Cat(3, "blue", "Meow!");

		System.out.println("Cat 1:");
		System.out.println("Age : " + cat1.getAge());
		System.out.println("Color: " + cat1.getColor());
		System.out.println("Speak :" + cat1.getspeak());

		System.out.println("Cat 2:");
		System.out.println("Age : " + cat2.getAge());
		System.out.println("Color: " + cat2.getColor());
		System.out.println("Speak :" + cat2.getspeak());

	}

}
