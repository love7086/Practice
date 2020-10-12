package com.yingda.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution783 {
	static Integer min = Integer.MAX_VALUE;
	static TreeNode prev;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		root.right = node3;
		node3.left = node2;
		int res = minDiffInBST(root);
		System.out.println(res);
	}

	public static int minDiffInBST(TreeNode root) {
		inOrderTraversal(root);
		return min;
	}

	public static void inOrderTraversal(TreeNode node) {
		if (node == null)
			return;
		inOrderTraversal(node.left);
		if (prev != null)
			min = Math.min(min, node.val - prev.val);
		prev = node;
		inOrderTraversal(node.right);

	}
}
