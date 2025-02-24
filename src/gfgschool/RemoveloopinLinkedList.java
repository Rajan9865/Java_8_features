/**
 * 
 */
package gfgschool;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class RemoveloopinLinkedList {
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
		e.next = c;
		removeLoopFromLinkedList(a);
		displayLinkedList(a);
	}

	/**
	 * @param a
	 */
	private static void displayLinkedList(Node a) {
		Node temp = a;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	/**
	 * @param a
	 */
	private static void removeLoopFromLinkedList(Node a) {
		if (a == null || a.next == null) {
			return;
		}
		Node fast = a;
		Node slow = a;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		if (fast == null || fast.next == null) {
			return;
		}
		slow = a;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		while (slow.next != fast) {
			slow = slow.next;
		}
		slow.next = null;
	}
}
