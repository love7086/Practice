package main.com.yingda.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution15 {

	public static void main(String[] args) {
		int[] nums = new int[] { -2, 0, 0, 2, 2 };
		List<List<Integer>> res = threeSum(nums);
		for (List<Integer> l : res) {
			System.out.print("[");
			for (Integer i : l) {
				System.out.print(i + ",");
			}
			System.out.println("]");
		}
	}

	// -4,-1,-1,0,1,2
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new LinkedList();
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int target = -nums[i];
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				if (nums[i] > 0)
					break;
				if (nums[left] + nums[right] == target) {
					List<Integer> list = new LinkedList();
					list.add(nums[i]);
					list.add(nums[left]);
					list.add(nums[right]);
					res.add(list);
					while (left < right && nums[left + 1] == nums[left])
						left++;
					while (left < right && nums[right - 1] == nums[right])
						right--;
					left++;
					right--;
				} else if (nums[left] + nums[right] < target) {
					left++;
				} else {
					right--;
				}
			}
		}
		return res;
	}
}
