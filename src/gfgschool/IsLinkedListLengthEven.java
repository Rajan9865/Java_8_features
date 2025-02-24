/**
 * 
 */
package gfgschool;

import java.awt.font.TextMeasurer;

import gfgschool.RemoveloopinLinkedList.Node;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class IsLinkedListLengthEven {
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
		Node e = new Node(50);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		boolean result = isLengthEven(a);
		System.out.println(result);
	}

	private static boolean isLengthEven(Node a) {
		Node tempNode = a;
		int count = 0;
		while (tempNode != null) {
			count++;
			tempNode = tempNode.next;
		}
		if (count % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
