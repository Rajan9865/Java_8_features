/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class RemoveDuplicatesfromSortedLinkedList {
	public static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node aNode=new Node(10);
		Node bNode=new Node(10);
		Node cNode=new Node(10);
		Node dNode=new Node(30);
		Node eNode=new Node(40);
		aNode.next=bNode;
		bNode.next=cNode;
		cNode.next=dNode;
		dNode.next=eNode;
		Node resultNode=removeDuplicate(aNode);
		printLinkedList(resultNode);
		
	}
	private static void printLinkedList(Node head) {
		Node tempNode=head;
		while(tempNode!=null) {
			System.out.print(tempNode.data+" ");
			tempNode=tempNode.next;
		}
		System.out.println();		
	}
	private static Node removeDuplicate(Node head) {
		if (head==null||head.next==null) {
			return head;
		}
		Node currentNode=head;
		while(currentNode!=null&&currentNode.next!=null) {
			if (currentNode.data==currentNode.next.data) {
				currentNode.next=currentNode.next.next;
			}else {
				currentNode=currentNode.next;
			}
		}
		return head;
	}
}
