/**
 * 
 */
package gfgschool;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class DetectLoopinlinkedlist1 {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}
	public static void main(String[] args) {
		Node a=new Node(5);
		Node b=new Node(10);
		Node c=new Node(15);
		Node d=new Node(20);
		Node e=new Node(25);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		System.out.println("detech loop in linked list is "+detectLoop(a));
		e.next=a;
		System.out.println("detech loop in linked list is "+detectLoop(a));
	}
	private static boolean detectLoop(Node head) {
		if (head==null) {
			return false;
		}
		Node slow=head;
		Node fast=head;
		while (fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if (slow==fast) {
				return true;
			}
		}
		return false;
	}
}
