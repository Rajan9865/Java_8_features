/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class DeleteNode {
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
		int target = 3;
		Node result = deleteNode(a, target);
		printLinkedList(result);
	}

	/**
	 * @param result
	 */
	private static void printLinkedList(Node result) {
		Node temp = result;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	/**
	 * @param a
	 * @param target
	 * @return
	 */
	private static Node deleteNode(Node head, int target) {
		if (head == null) {
			return null;
		}
		if (target == 1) {
			return head.next;
		}
		Node temp = head;
		int count = 1;
		while (count < target - 1 && temp.next != null) {
			temp = temp.next;
			count++;
		}
		if (temp == null && temp.next == null) {
			return head;
		}
		temp.next = temp.next.next;
		return head;
	}
}
