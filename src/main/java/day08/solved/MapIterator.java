package day08.solved;

import java.util.HashMap;

public class MapIterator {

	public static void main(String[] args) {

		HashMap<String, Integer> deptMap = new HashMap<String, Integer>();
		deptMap.put("HR", 5);
		deptMap.put("ADMIN", 10);
		deptMap.put("DEVELOPERS", 300);

		deptMap.forEach((k, v) -> System.out.println(k + " : " + (v + 10)));

	}

}
