package com.yingda.leetcode;

public class Solution82 {

	public static void main(String[] args) {
		ListNode head1 = new ListNode(2,
				new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5))))));
		ListNode node = deleteDuplicates(head1);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode dummy, prev, curr;
		dummy = prev = new ListNode();
		curr = dummy.next = head;
		while (curr != null && curr.next != null) {
			if (curr.val == curr.next.val) {
				prev.next = helper(curr);
				curr = prev.next;
			} else {
				prev = curr;
				curr = curr.next;
			}
		}
		return dummy.next;
	}

	public static ListNode helper(ListNode curr) {
		while (curr.next != null && curr.val == curr.next.val) {
			curr = curr.next;
		}
		curr = curr.next;
		return curr;
	}
}
