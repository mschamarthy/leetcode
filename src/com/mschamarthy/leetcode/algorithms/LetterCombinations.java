/**
 * File:	com.mschamarthy.leetcode.algorithms.LetterCombinations.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	November 13, 2017
 * 
 * Below is the solution for practice / challenge problems on LeetCode.
 * Question link:	https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

	public static void main(String args[]) {
		LetterCombinations driver = new LetterCombinations();
		System.out.println(driver.letterCombinations("230"));
		System.out.println(driver.letterCombinations("23"));
		System.out.println(driver.letterCombinations(""));
	}

	public List<String> letterCombinations(String digits) {
		List<String> combinations = new ArrayList<String>();
		Map<String, String[]> numberMapping = new HashMap<String, String[]>();
		numberMapping.put("2", new String[] { "a", "b", "c" });
		numberMapping.put("3", new String[] { "d", "e", "f" });
		numberMapping.put("4", new String[] { "g", "h", "i" });
		numberMapping.put("5", new String[] { "j", "k", "l" });
		numberMapping.put("6", new String[] { "m", "n", "o" });
		numberMapping.put("7", new String[] { "p", "q", "r", "s" });
		numberMapping.put("8", new String[] { "t", "u", "v" });
		numberMapping.put("9", new String[] { "w", "x", "y", "z" });

		letterCombination(combinations, numberMapping, "", digits);
		return combinations;
	}

	public void letterCombination(List<String> combinations, Map<String, String[]> numberMapping, String prefix,
			String digits) {
		if (digits.length() == 0 && prefix.length() == 0) {
			return;
		} else if (digits.length() == 0){
			combinations.add(prefix);
			return;
		}
		if ("01*#".contains(digits.charAt(0) + "")) {
			combinations = null;
		}
		if (combinations == null) {
			return;
		}
		String firstDigit = digits.charAt(0) + "";
		for (String letter : numberMapping.get(firstDigit)) {
			letterCombination(combinations, numberMapping, prefix + letter, digits.substring(1));
		}

		return;
	}

}
