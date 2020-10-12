package com.yingda.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution46 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4 };
		List<List<Integer>> res = permute(arr);
		for (List<Integer> l : res) {
			System.out.print("{");
			for (Integer i : l) {
				System.out.print(i + ",");
			}
			System.out.println("}");
		}
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new LinkedList();
		helper(nums, new LinkedList(), res, new boolean[nums.length]);
		return res;
	}

	private static void helper(int[] nums, List<Integer> tmp, List<List<Integer>> res, boolean[] visited) {
		if (tmp.size() == nums.length)
			res.add(new LinkedList(tmp));
		else {
			for (int i = 0; i < nums.length; i++) {
				if (!visited[i]) {
					tmp.add(nums[i]);
					visited[i] = true;
					helper(nums, tmp, res, visited);
					visited[i] = false;
					tmp.remove(tmp.size() - 1);
				}
			}
		}
	}
}
