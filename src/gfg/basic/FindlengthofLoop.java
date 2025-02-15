/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class FindlengthofLoop {
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
		e.next = b;
		int result = countNodeInLoop(a);
		if (result > 0) {
			System.out.println("loop is detected " + result + " nodes");
		} else {
			System.out.println(" llopp is not detected ");
		}
	}

	/**
	 * @param a
	 * @return
	 */
	private static int countNodeInLoop(Node head) {
		if (head == null || head.next == null) {
			return 0;
		}
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return countLoopNodes(slow);
			}
		}
		return 0;
	}

	/**
	 * @param slow
	 * @return
	 */
	private static int countLoopNodes(Node slow) {
		int count = 1;
		Node temp = slow;
		while (temp.next != slow) {
			count++;
			temp = temp.next;
		}
		return count;
	}
}
