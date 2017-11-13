/**
 * File:	com.mschamarthy.leetcode.algorithms.LongestCommonPrefix.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	November 12, 2017
 * 
 * Below is the solution for practice / challenge problems on LeetCode.
 * Question link:	https://leetcode.com/problems/longest-common-prefix/description/
 * 
 * DISCLAIMER:
 * 		This code is published with no warranties or liabilities of any kind. Use the
 * code at your discretion. Its encouraged to code solutions to the problem without help.
 * Please do not copy this code to solve any of the coding challenges. Use this solution
 * just as a reference. The author is not responsible for any use of the below solution
 * or consequences arising out of such use. Author is not responsible for any Resemblance 
 * of the code/solution in any manner and it is purely coincidental.
 */
package com.mschamarthy.leetcode.algorithms;

public class LongestCommonPrefix {

	public static void main(String args[]) {
		LongestCommonPrefix driver = new LongestCommonPrefix();
		String str1 = "aababc";
		String str2 = "aabbc";
		System.out.println(driver.longestCommonPrefix(new String[] { str1, str2 }));
	}

	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0){
			return "";
		}else if(strs.length == 1){
			return strs[0];
		}
		String commonPrefix = longestCommonPrefix(strs[0], strs[1]);
		for(int i = 2; i < strs.length; i++){
			commonPrefix = longestCommonPrefix(commonPrefix, strs[i]);
		}
		return commonPrefix;
	}

	public String longestCommonPrefix(String str1, String str2) {
		StringBuilder commonStr = new StringBuilder();
		int minLoop = Math.min(str1.length(), str2.length());
		for (int index = 0; index < minLoop ; index++) {
			if(str1.charAt(index) != str2.charAt(index)){
				break;
			}
			commonStr.append(str1.charAt(index));
		}
		return commonStr.toString();
	}

}
