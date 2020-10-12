package com.yingda.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution450 {
	static Integer min = Integer.MAX_VALUE;
	static TreeNode prev;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		root.right = node3;
		node3.left = node2;
		TreeNode res = deleteNode(root, 3);
		System.out.println(res);
	}

	public static TreeNode deleteNode(TreeNode root, int key) {
		if (root == null)
			return root;
		if (root.val > key) {
			root.left = deleteNode(root.left, key);
		} else if (root.val < key) {
			root.right = deleteNode(root.right, key);
		} else {
			root.val = findMin(root.right);
			root.right = deleteNode(root.right, root.val);
		}
		return root;
	}

	public static Integer findMin(TreeNode node) {
		while (node != null && node.left != null) {
			node = node.left;
		}
		return node.val;
	}
}
