/**
 * File:	com.mschamarthy.leetcode.algorithms.Merge2SortedArrays.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	November 13, 2017
 * 
 * Below is the solution for practice / challenge problems on LeetCode.
 * Question link:	https://leetcode.com/problems/merge-sorted-array/description/
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

public class Merge2SortedArrays {

	public static void main(String args[]) {
		Merge2SortedArrays driver = new Merge2SortedArrays();
		int[] list1 = new int[7];
		list1[0] = 4;
		list1[1] = 5;
		list1[2] = 6;

		int[] list2 = new int[3];
		list2[0] = 1;
		list2[1] = 2;
		list2[2] = 3;
		driver.merge(list1, 3, list2, 3);
		for (int ele : list1) {
			System.out.print(ele + " ");
		}
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int nextInsertIndex = m + n - 1;
		int i = m - 1, j = n - 1;
		while (i >= 0 && j >= 0) {
			nums1[nextInsertIndex--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
		}
		while (j >= 0) {
			nums1[nextInsertIndex--] = nums2[j--];
		}
	}

}
