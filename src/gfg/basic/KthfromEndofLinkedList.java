/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class KthfromEndofLinkedList {
	public static class Node{
		int data;
		Node nextNode;
		public Node(int data) {
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node a=new Node(10);
		Node b=new Node(20);
		Node c=new Node(30);
		Node d=new Node(40);
		a.nextNode=b;
		b.nextNode=c;
		c.nextNode=d;
		int k=3;
		int result= getKthFromLast(a,k);
		if (result==-1) {
			System.out.println("invalid kth value");
		} else {
			System.out.println(" the "+k+"th node from the end is "+result);
		}
	}
	private static int getKthFromLast(Node head, int k) {
		Node slow=head;
		Node fast=head;
		for(int i=0;i<k;i++) {
			if (fast==null) {
				return -1;
			}fast=fast.nextNode;
		}
		while(fast!=null) {
			fast=fast.nextNode;
			slow=slow.nextNode;
		}
		return (slow!=null)?slow.data:-1;
	}
}
