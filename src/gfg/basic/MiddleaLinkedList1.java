/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class MiddleaLinkedList1 {
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
		int result = getMiddle(a);
		System.out.println("middle element is " + result);
	}

	private static int getMiddle(Node head) {
		if ( head==null) {
			return -1;
		}
		Node slowNode=head;
		Node faseNode=head;
		while(faseNode!=null&&faseNode.next!=null) {
			slowNode=slowNode.next;
			faseNode=faseNode.next.next;
		}
		return slowNode.data;
	}
}
