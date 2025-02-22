/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class SearchInLinkedList {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node aNode = new Node(10);
		Node bNode = new Node(20);
		Node cNode = new Node(40);
		Node dNode = new Node(160);
		Node eNode = new Node(110);
		aNode.next = bNode;
		bNode.next = cNode;
		cNode.next = dNode;
		dNode.next = eNode;
		int target = 1101;
//		boolean result = searchLinkedList(aNode, target);
		System.out.println("element found in linked list " + searchLinkedList(aNode, target));
	}
	private static boolean searchLinkedList(Node head, int target) {
		Node tempNode = head;
		while (tempNode != null) {
			if (tempNode.data == target) {
				return true;
			}
			tempNode = tempNode.next;
		}
		return false;
	}
}
