/**
 * File:	com.mschamarthy.leetcode.algorithms.NumberPalindrome.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	November 12, 2017
 * 
 * Below is the solution for practice / challenge problems on LeetCode.
 * Question link:	https://leetcode.com/problems/palindrome-number/description/
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

public class NumberPalindrome {

	public static void main(String args[]) {
		NumberPalindrome driver = new NumberPalindrome();
		int i = -10;
		System.out.println(driver.isPalindrome(i));
	}

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int noOfDigits = String.valueOf(x).length();
		System.out.println(noOfDigits);
		for (int i = 0; i < noOfDigits / 2; i++) {
			int iDigit = ((x % (int) Math.pow(10, i + 1)) - (i > 0 ? x % (int) Math.pow(10, i - 1) : 0))
					/ (int) Math.pow(10, i);
			int niDigit = ((x % (int) Math.pow(10, noOfDigits - i))
					- (i > 0 ? x % (int) Math.pow(10, noOfDigits - i - 2) : 0))
					/ (int) Math.pow(10, noOfDigits - i - 1);
			if (iDigit != niDigit) {
				return false;
			}
		}
		return true;
	}

}
