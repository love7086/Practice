package main.com.yingda.leetcode;

public class Solution28 {
	public static void main(String[] args) {
		String s1 = "Heasdasdl54t512lo";
		String s2 = "54t";
		System.out.println(strStr(s1, s2));
	}

	public static int strStr(String haystack, String needle) {
		int l1 = haystack.length(), l2 = needle.length();
		char[] c1 = haystack.toCharArray();
		char[] c2 = needle.toCharArray();
		if (l1 < l2)
			return -1;
		if (l2 == 0)
			return 0;
		for (int i = 0; i <= l1 - l2; i++) {
			int j = 0;
			for (; j < l2; ++j) {
				if (c1[i + j] != c2[j])
					break;
			}
			if (j == l2)
				return i;
		}
		return -1;
	}
}
