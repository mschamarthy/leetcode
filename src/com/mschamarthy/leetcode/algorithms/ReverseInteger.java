/**
 * File:	com.mschamarthy.leetcode.algorithms.ReverseInteger.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	November 11, 2017
 * 
 * Below is the solution for practice / challenge problems on LeetCode.
 * Question link:	https://leetcode.com/problems/reverse-integer/description/
 * 
 * DISCLAIMER:
 * 		This code is published with no warranties or liabilities of any kind. Use the
 * code at your discretion. Its encouragReverseIntegered to code solutions to the problem without help.
 * Please do not copy this code to solve any of the coding challenges. Use this solution
 * just as a reference. The author is not responsible for any use of the below solution
 * or consequences arising out of such use. Author is not responsible for any Resemblance 
 * of the code/solution in any manner and it is purely coincidental.
 */
package com.mschamarthy.leetcode.algorithms;

public class ReverseInteger {

	public static void main(String args[]) {
		ReverseInteger driver = new ReverseInteger();
		int input = 120;
		System.out.println(driver.reverse(input));
		;

	}

	public int reverse(int x) {
		StringBuilder rev = new StringBuilder();
		if (x < 0) {
			rev.append('-');
		}

		int y = x;
		while (y != 0) {
			rev.append(Math.abs(y % 10));
			y = y / 10;
		}

		try {
			return Integer.parseInt(rev.toString());
		} catch (NumberFormatException nfe) {
			return 0;
		}
	}
}
