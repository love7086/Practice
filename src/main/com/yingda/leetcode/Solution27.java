package main.com.yingda.leetcode;

public class Solution27 {

	public static void main(String[] args) {
//		int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		int[] nums = new int[] { 3, 2, 2, 2, 3 };
		int target = 3;
		int result = removeElement(nums, target);
		System.out.println(result);
		for (int i : nums) {
			System.out.println(i);
		}
	}

	// { 0, 1, 2, 2, 2, 0, 4, 3 };
	public static int removeElement(int[] nums, int val) {
		int length = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val) {
				nums[length++]=nums[i];
			}
		}
		return length;
	}
}
