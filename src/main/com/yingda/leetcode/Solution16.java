package main.com.yingda.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution16 {

	public static void main(String[] args) {
		int row = 10, col = 5;
		List<List<Integer>> res = generate(row);
		for (List<Integer> l : res) {
			System.out.print("[");
			for (Integer i : l) {
				System.out.print(i + ",");
			}
			System.out.println("]");
		}
		System.out.println(generate(row, col));
	}

	// -4,-1,1,2 1
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new LinkedList();
		List<Integer> row = new LinkedList();
		while (numRows-- > 0) {
			for (int i = 0; i < row.size() - 1; i++) {
				row.set(i, row.get(i) + row.get(i + 1));
			}
			row.add(0, 1);
			res.add(new LinkedList(row));
		}
		return res;
	}

	public static Integer generate(int rowNum, int colNum) {
		List<List<Integer>> res = new LinkedList();
		List<Integer> row = new LinkedList();
		while (rowNum-- > 0) {
			for (int i = 0; i < row.size() - 1; i++) {
				row.set(i, row.get(i) + row.get(i + 1));
			}
			row.add(0, 1);
			res.add(new LinkedList(row));
		}
		return row.get(colNum);
	}
}
