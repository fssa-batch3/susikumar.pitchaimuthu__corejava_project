package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortList {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your number of inputs :");
		int number = scan.nextInt();

		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.println("Enter your integers value :");

		for (int i = 0; i < number; i++) {
			array.add(scan.nextInt());
		}

		Collections.sort(array);

		System.out.println("Your sorted array is : " + array);

		scan.close();

	}

}
