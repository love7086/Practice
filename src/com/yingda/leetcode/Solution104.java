package com.yingda.leetcode;

public class Solution104 {
	int maxDeepth;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2147483647);
		int res = maxDepth(root);
		System.out.println(res);

	}

	public static int maxDepth(TreeNode root) {
		if(root==null)return 0;
		return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
	}


}
