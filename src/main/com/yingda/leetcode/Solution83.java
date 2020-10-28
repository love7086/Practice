package main.com.yingda.leetcode;

public class Solution83 {

	public static void main(String[] args) {
		ListNode head1 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(3, new ListNode(3)))));
		ListNode node = deleteDuplicates(head1);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if(head==null)return head;
		ListNode curr = head;
		while (curr.next != null) {
			if (curr.val == curr.next.val) {
				curr.next = curr.next.next;
			}else {
				curr=curr.next;
			}
		}
		return head;
	}
}
