/**
 * File:	com.mschamarthy.leetcode.algorithms.TwoSum.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	November 11, 2017
 * 
 * Below is the solution for practice / challenge problems on LeetCode.
 * Question link:	https://leetcode.com/problems/two-sum/description/
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

public class TwoSum {
	
	public static void main(String args[]){
		TwoSum ts = new TwoSum();
		int[] nums = {2, 7, 11, 15};
		int target = 13;
		int[] indexes = ts.twoSum(nums, target);
		System.out.println(indexes[0] + " - " + indexes[1]);
	}

	public int[] twoSum(int[] nums, int target) {
		int[] output = new int[2];
		for(int i = 0; i < nums.length; i++){
			for(int j = i+1; j < nums.length; j++){
				if(nums[i] + nums[j] == target){
					output[0] = i;
					output[1] = j;
				}
			}
		}
		
		return output;
	}
}
