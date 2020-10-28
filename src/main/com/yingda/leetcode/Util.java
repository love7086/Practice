package main.com.yingda.leetcode;

import java.util.List;

public class Util {

	public static void printList(List l) {
		System.out.print("{");
		for (Object o : l) {
			System.out.print(o + ",");
		}
		System.out.println("}");
	}
}
