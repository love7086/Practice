package com.yingda.leetcode;

public class Solution98 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2147483647);
		boolean res = isValidBST(root);
		System.out.println(res);

	}

	public static boolean isValidBST(TreeNode root) {
		return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public static boolean helper(TreeNode root, long minVal, long maxVal) {
		if (root == null)
			return true;
		if (root.val >= maxVal || root.val <= minVal)
			return false;
		return helper(root.left, minVal, root.val) && helper(root.right, root.val, maxVal);
	}

}
