package com.yingda.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution118 {

	public static void main(String[] args) {
		int[] nums = new int[] { -4, -1, 1, 2 };
		int res = threeSumClosest(nums, 1);
		System.out.println(res);
	}

	// -4,-1,1,2 1
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int res = Integer.MAX_VALUE, diff = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int left = i + 1, right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == target)
					return sum;
				if (sum == target)
					break;
				if (sum > target) {
					right--;
				} else {
					left++;
				}
				int d = Math.abs(sum - target);
				if (d < diff) {
					diff = d;
					res = sum;
				}
			}
		}
		return res;
	}
}
