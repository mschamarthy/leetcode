/**
 * File:	com.mschamarthy.leetcode.algorithms.AddTwoNumbers.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	November 11, 2017
 * 
 * Below is the solution for practice / challenge problems on LeetCode.
 * Question link:	https://leetcode.com/problems/add-two-numbers/description/
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

public class AddTwoNumbers {

	public static void main(String args[]) {
		AddTwoNumbers ts = new AddTwoNumbers();
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(3);

		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next.next = new ListNode(4);

		ListNode output = ts.addTwoNumbers(list1, list2);
		while (output != null) {
			System.out.print(output.val + " -> ");
			output = output.next;
		}
	}

	/*
	 * Below inner class is already defined in the problem. Adding it only for
	 * completeness.
	 */
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			throw new IllegalArgumentException("One of the input linked lists is null");
		}
		
		ListNode element1 = l1;
		ListNode element2 = l2;
		ListNode sumListHead = null, sumList = null;
		int sum = 0, carry = 0;

		while (element1 != null || element2 != null) {
			sum = 0;

			if (element1 != null) {
				sum += element1.val;
				element1 = element1.next;
			}

			if (element2 != null) {
				sum += element2.val;
				element2 = element2.next;
			}

			sum += carry;
			carry = sum / 10;
			sum = sum % 10;

			if (sumList == null) {
				sumList = new ListNode(sum);
				sumListHead = sumList;
			} else {
				sumList.next = new ListNode(sum);
				sumList = sumList.next;
			}

		}
		
		if (carry != 0){
			sumList.next = new ListNode(carry);
		}

		return sumListHead;
	}
}
