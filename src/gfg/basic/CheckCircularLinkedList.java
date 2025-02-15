/**
 * 
 */
package gfg.basic;

import java.nio.Buffer;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class CheckCircularLinkedList {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		a.next = b;
		b.next = c;
		c.next = d;
//		c.next=b;
		System.out.print("linked list is circular " + isCircular(a));
	}

	/**
	 * @param a
	 * @return
	 */
	private static boolean isCircular(Node head) {
		if (head == null) {
			return false;
		}
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}
}
