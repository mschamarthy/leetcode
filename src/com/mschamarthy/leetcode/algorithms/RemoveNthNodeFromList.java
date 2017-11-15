/**
 * File:	com.mschamarthy.leetcode.algorithms.RemoveNthNodeFromList.java
 * 
 * Author:	Mohan Shashanka C
 * Email:	c.mohan.shashanka [at] gmail.com
 * Date:	November 13, 2017
 * 
 * Below is the solution for practice / challenge problems on LeetCode.
 * Question link:	https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
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

public class RemoveNthNodeFromList {

	public static void main(String args[]) {
		RemoveNthNodeFromList driver = new RemoveNthNodeFromList();
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode(4);
		list1.next.next.next.next = new ListNode(5);
		ListNode output = driver.removeNthFromEnd(list1, 2);
		
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

	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nodePointer = head;
        ListNode removeNextNode = head;
        for (int i = 0; i < n && nodePointer != null; i++) {
            nodePointer = nodePointer.next;
        }
        
        if (nodePointer == null){
            head = head.next;
        } else {
            while(nodePointer.next != null){
                nodePointer = nodePointer.next;
                removeNextNode = removeNextNode.next;
            }
            removeNextNode.next = removeNextNode.next.next;
        }
        
        return head;
    }

}
