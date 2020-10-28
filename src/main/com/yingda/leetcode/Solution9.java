package main.com.yingda.leetcode;

public class Solution9 {

	public static void main(String[] args) {
		int i=121;
		System.out.println(isPalindrome(i));
	}

	//1123573  0->
	public static boolean isPalindrome(int x) {
//		char[] chars =String.valueOf(x).toCharArray();
//		int left=0,right=chars.length-1;
//		while(left<right) {
//			if(chars[left]!=chars[right])
//				return false;
//			left++;
//			right--;
//		}
//		return true;
		int a=0;
		int b=x;
		while(b>0) {
			a=a*10+b%10;
			b/=10;
		}
		return a==x;
	}
}
