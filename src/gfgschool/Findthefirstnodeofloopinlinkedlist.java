/**
 * 
 */
package gfgschool;

/**
 * gfgschool
 *@author Rajan kumar
 */
public class Findthefirstnodeofloopinlinkedlist {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node a=new Node(10);//47 24 22 3
		Node b=new Node(20);
		Node c=new Node(30);
		Node d=new Node(40);
//		Node e=new Node(50);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=c;
//		e.next=c;
//		displayLinkedList(a);
		Node loopLode=findFirestNode(a);
		if (loopLode!=null) {
			System.out.println("the first node of the loop is "+loopLode.data);
		} else {
			System.out.println("no loop detect in the linked list");
		}
		
	}
	/**
	 * @param a
	 */
	private static void displayLinkedList(Node a) {
		Node tempNode=a;
		while(tempNode!=null) {
			System.out.print(tempNode.data+" ");
			tempNode=tempNode.next;
		}
		System.out.println();
	}
	/**
	 * @param a
	 * @return
	 */
	private static Node findFirestNode(Node a) {
		if (a==null||a.next==null) {
			return null;
		}
		Node slow=a;
		Node fast=a;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			System.out.println(slow.data);
			fast=fast.next.next;
			System.out.println(fast.data);
			if (slow==fast) {
				break;
			}
		}
		if (fast==null||fast.next==null) {
			return null;
		}
		slow=a;
		while(slow!=fast)
		{
			slow=slow.next;
			System.out.println(slow.data);
			fast=fast.next;
			System.out.println(fast.data);
		}
		return slow;
	}

}
