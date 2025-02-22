/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class MiddleaLinkedList {
	public static class Node {
		int data;
		Node next;
		public Node(int data) {
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
		int result = getMiddle(a);
		System.out.println("middle element is " + result);
	}
	private static int getMiddle(Node head) {
		int count = 0;
		if (head == null) {
			return -1;
		}
		Node tempNode = head;
		while (tempNode != null) {
			count++;
			tempNode = tempNode.next;
		}
		tempNode = head;
		for (int i = 0; i < count / 2; i++) {
			tempNode = tempNode.next;
		}
		return tempNode.data;
	}
}
