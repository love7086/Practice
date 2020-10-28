package main.com.yingda.leetcode;

import java.util.LinkedList;
import java.util.List;

public class NKSum {
	static List<List<Integer>> res = new LinkedList();

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 2, 3, 3, 4, 5, 8 };
//		int[] nums = new int[] { 1, 1, 3, 3, 5 };
		NKSum(nums, 4, 10);

	}

	public static List<List<Integer>> NKSum(int[] nums, int n, int k) {
		helper(nums, n, k, 0, new LinkedList());

		return res;
	}

	public static void helper(int[] nums, int n, int k, int left, List<Integer> tmp) {
		if (n == 0 && k == 0) {
			res.add(new LinkedList(tmp));
			Util.printList(tmp);
		}
		if (n <= 0 || k <= 0 || left == nums.length) {
			return;
		}

//		System.out.println("n= " + n + " k= " + k + " left= " + left);
		for (int i = left; i < nums.length; i++) {
			tmp.add(nums[i]);
			helper(nums, n - 1, k - nums[i], i + 1, tmp);
			tmp.remove(tmp.size() - 1);
		}
	}
}
