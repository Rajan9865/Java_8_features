/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class LinkedListSearch {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node aNode = new Node(10);
		Node bNode = new Node(20);
		Node cNode = new Node(40);
		Node dNode = new Node(50);
		Node eNode = new Node(190);
		aNode.next = bNode;
		bNode.next = cNode;
		cNode.next = dNode;
		dNode.next = eNode;
		int target = 50;
		System.out.println("Element found " + search(aNode, target));
	}

	private static boolean search(Node aNode, int target) {
		Node tempNode = aNode;
		while (tempNode != null) {
			if (tempNode.data == target) {
				return true;
			}
			tempNode = tempNode.next;
		}
		return false;
	}
}
