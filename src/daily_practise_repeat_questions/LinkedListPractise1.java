/**
 * 
 */
package daily_practise_repeat_questions;

/**
 * daily_practise_repeat_questions
 *@author Rajan kumar
 */
public class LinkedListPractise1 {
	public static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
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
		Node currentNode=a;
		while(currentNode!=null)
		{
			System.out.print(currentNode.data+" ");
			currentNode=currentNode.next;
		}
	}

}
