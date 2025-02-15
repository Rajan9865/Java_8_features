/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class DeleteNodeHavingGreaterValueOnRight {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node a=new Node(10);
		Node b=new Node(20);
		Node c=new Node(30);
		Node d=new Node(40);
		a.next=b;
		b.next=c;
		c.next=d;
		Node result=compute(a);
		printLinkedList(result);
	}
	/**
	 * @param result
	 */
	private static void printLinkedList(Node head) {
		Node tempNode=head;
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
	private static Node compute(Node head) {
		if (head==null) {
			return null;
		}
		head=reverse(head);
		printLinkedList(head);
		Node currentNode=head;
		Node maxNode=head;
		while(currentNode!=null&&currentNode.next!=null) {
			if (currentNode.next.data<maxNode.data) {
				currentNode.next=currentNode.next.next;
			}else {
				maxNode=currentNode.next;
				currentNode=currentNode.next;
			}
		}
		return reverse(head);
	}
	/**
	 * @param head
	 * @return
	 */
	private static Node reverse(Node head) {
		Node prev=null;
		Node current=head;
		while(current!=null) {
			Node temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
		}
		return prev;
	}

}
