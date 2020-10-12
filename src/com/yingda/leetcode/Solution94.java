package com.yingda.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution94 {

	public static void main(String[] args) {
		//1
		//	3
		// 2  
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		root.right = node2;
		node2.left = node3;
		List<Integer> res = inorderTraversal(root);
		System.out.println(res.size());
		for (Integer i : res) {
			System.out.println(i);
		}
	}

//	public static List<Integer> inorderTraversal(TreeNode root) {
//		List<Integer> res = new LinkedList();
//		if (root != null) {
//			List<Integer> left = inorderTraversal(root.left);
//			res.addAll(left);
//			res.add(root.val);
//			List<Integer> right = inorderTraversal(root.right);
//			res.addAll(right);
//		}
//		return res;
//	}
	public static List<Integer> inorderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack();
		TreeNode curr = root;
		List<Integer> list = new LinkedList();
		while (curr != null || !s.isEmpty()) {
			while (curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			list.add(curr.val);
			curr = curr.right;
		}
		return list;
	}
}
