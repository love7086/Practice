package com.yingda.leetcode;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 23, 3, 42, 5, 31, 32, 6, 20,985 };// 0-9
//		int[] arr = new int[] { 1, 23, 3, 42, 5, 31, 32, 6, 20 };// 0-9
//		int[] arr = new int[] { 31, 32, 23, 42 };// 0-9
		// 1,6,3,42,5,31,32,23,20
		// 1,6,3,5,42,31,32,23,20
		helper(arr, 0, arr.length - 1);

	}

	private static void helper(int[] nums, int left, int right) {
		if (nums == null || nums.length <= 1 || left >= right)
			return;
		int pivot = right;
		int i = left, j = pivot - 1;
		while (i < j) {
			while (nums[i] < nums[pivot] && i < j)
				i++;
			while (nums[j] > nums[pivot] && i < j)
				j--;
			swap(nums, i, j);
		}
		System.out.println(i + " " + j);
		if (nums[pivot] < nums[j]) {
			swap(nums, pivot, j);
			j--;
		}
		print(nums);

		helper(nums, left, j );
		helper(nums, j + 1, right);
	}

	private static void swap(int[] nums, int left, int right) {
		int tmp = nums[left];
		nums[left] = nums[right];
		nums[right] = tmp;
	}

	private static void print(int[] nums) {
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
}