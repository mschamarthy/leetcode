/**
 * File:	com.mschamarthy.leetcode.algorithms.RomanToInteger.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	November 12, 2017
 * 
 * Below is the solution for practice / challenge problems on LeetCode.
 * Question link:	https://leetcode.com/problems/roman-to-integer/description/
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

public class RomanToInteger {

	public static void main(String args[]) {
		RomanToInteger driver = new RomanToInteger();
		String roman = "XI";
		System.out.println(driver.romanToInt(roman));
	}

	public int romanToInt(String s) {
		int intValue = 0, romanValue = 0;
		int prev = 0;
		for(int i = s.length()-1; i >= 0 ; i--){
			switch(s.charAt(i)){
				case 'M': romanValue = 1000; break;
				case 'D': romanValue = 500; break;
				case 'C': romanValue = 100; break;
				case 'L': romanValue = 50; break;
				case 'X': romanValue = 10; break;
				case 'V': romanValue = 5; break;
				case 'I': romanValue = 1; break;
				default: ;
			}
			intValue += (romanValue<prev?-1:1) * romanValue;
			prev = romanValue;
		}
		return intValue;
	}

}
