package com.yingda.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution31 {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 1 };
		nextPermutation(arr);
		for (Integer i : arr) {
			System.out.print(i + ",");
		}
		System.out.println("}");
	}

	// 1,2,3,5,4-> 1,2,4,3,5
	// 6,5,4,8,7,5,1 -> 6,5,5,1,4,7,8
	// 3,2,5,4,2,1 -> 3,4,1,2,2,5
	// 3,5,4,2,2,1 ->4,1,2,2,3,5
	// 1,2,7,4,3,1 ->1,3,1,2,4,7
	public static void nextPermutation(int[] nums) {
		int i = nums.length - 1;
		while (i > 0 && nums[i] <= nums[i - 1])
			i--;// nums[i]=8 i=3
		int j = nums.length - 1;
		if (i > 0) {
			while (nums[j] <= nums[i - 1])
				j--;// nums[j]=5;j=5
			swap(nums, i - 1, j);
		}
		reverse(nums, i);
	}

	private static void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}

	private static void reverse(int nums[], int startIndex) {
		int left = startIndex, right = nums.length - 1;
		while (left < right) {
			swap(nums, left, right);
			left++;
			right--;
		}
	}
}
