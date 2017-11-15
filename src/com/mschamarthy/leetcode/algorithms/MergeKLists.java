/**
 * File:	com.mschamarthy.leetcode.algorithms.MergeKLists.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	November 13, 2017
 * 
 * Below is the solution for practice / challenge problems on LeetCode.
 * Question link:	https://leetcode.com/problems/merge-k-sorted-lists/description/
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

public class MergeKLists {

	public static void main(String args[]) {
		MergeKLists driver = new MergeKLists();
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(7);

		ListNode list2 = new ListNode(3);
		list2.next = new ListNode(5);
		list2.next.next = new ListNode(9);

		ListNode list3 = new ListNode(4);
		list3.next = new ListNode(6);
		list3.next.next = new ListNode(8);
		ListNode output = driver.mergeKLists(new ListNode[] { list1, list2, list3 });

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

	public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length == 0){
			return null;
		}
		return mergeKLists(lists, 0, lists.length - 1);
	}

	public ListNode mergeKLists(ListNode[] lists, int l, int r) {
		if (l == r) {
			return lists[l];
		}

		ListNode leftMergedList = mergeKLists(lists, l, (r + l) / 2);
		ListNode rightMergedList = mergeKLists(lists, (1 + (r + l) / 2), r);

		return merge2Lists(leftMergedList, rightMergedList);
	}

	public ListNode merge2Lists(ListNode leftHead, ListNode rightHead) {
		ListNode addNextNode = new ListNode(Integer.MAX_VALUE);
		ListNode mergedList = addNextNode;
		
		while (leftHead != null && rightHead != null) {
			if (leftHead.val <= rightHead.val) {
				addNextNode.next = leftHead;
				leftHead = leftHead.next;
			} else {
				addNextNode.next = rightHead;
				rightHead = rightHead.next;
			}
			addNextNode = addNextNode.next;
		}
		if (leftHead == null && rightHead != null) {
			addNextNode.next = rightHead;
		} else if (leftHead != null && rightHead == null) {
			addNextNode.next = leftHead;
		}
		return mergedList.next;
	}

}
