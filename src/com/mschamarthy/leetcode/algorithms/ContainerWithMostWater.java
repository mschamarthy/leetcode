/**
 * File:	com.mschamarthy.leetcode.algorithms.ContainerWithMostWater.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	November 12, 2017
 * 
 * Below is the solution for practice / challenge problems on LeetCode.
 * Question link:	https://leetcode.com/problems/container-with-most-water/description/
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

public class ContainerWithMostWater {

	public static void main(String args[]) {
		ContainerWithMostWater driver = new ContainerWithMostWater();
		System.out.println(driver.maxArea(new int[] { 1, 2, 3, 2, 3 }));
	}

	public int maxArea(int[] height) {
		int maxArea = 0;
		int i = 0;
		int j = height.length - 1;
		while(i < j){
			maxArea = Math.max(maxArea, (j-i) * Math.min(height[i], height[j]));
			if (height[i] < height[j]){
				i++;
			} else {
				j--;
			}
		}
		return maxArea;
	}

}
