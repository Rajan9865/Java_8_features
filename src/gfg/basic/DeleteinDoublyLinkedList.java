/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class DeleteinDoublyLinkedList {
	public static class Node {
		int data;
		Node next;
		Node prev;

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

		b.prev = a;
		b.next = c;

		c.prev = b;
		c.next = d;

		d.prev = c;
		System.out.println("Original Linked List:");
		printList(a);
		int positionToDelete = 3;
		Node result = deleteNode(a, positionToDelete);
		System.out.println("Linked List after deleting node at position " + positionToDelete + ":");
		printList(result);

	}

	/**
	 * @param a
	 * @param positionToDelete
	 * @return
	 */
	private static Node deleteNode(Node head, int positionToDelete) {
		if (head == null) {
			return null;
		}
		if (positionToDelete == 1) {
			head = head.next;
			if (head != null) {
				head.prev = null;
			}
			return head;
		}
		Node current = head;
		int count = 1;
		while (current != null && count < positionToDelete) {
			current = current.next;
			count++;
		}
		if (current == null) {
			return head;
		}
		if (current.next != null) {
			current.next.prev = current.prev;
		}
		if (current.prev != null) {
			current.prev.next = current.next;
		}
		return head;
	}

	/**
	 * @param a
	 */
	private static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
