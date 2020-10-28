package main.com.yingda.leetcode;

import java.util.HashMap;

public class Solution1 {

	public static void main(String[] args) {
		int[] nums=new int[] {2,11,15,7};
		int target=9;
		int[] result=twoSum(nums,target);
		for(int i:result) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] {i,map.get(target-nums[i])};
			}
			map.put(nums[i],i);
		}
		return new int[]{};
	}
}
