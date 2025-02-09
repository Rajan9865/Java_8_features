/**
 * 
 */
package gfg.basic;

import java.util.HashSet;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class RemoveDuplicatesfromUnSortedLinkedList {
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
		Node cNode = new Node(10);
		Node dNode = new Node(30);
		Node eNode = new Node(10);
		Node fNode = new Node(40);
		aNode.next = bNode;
		bNode.next = cNode;
		cNode.next = dNode;
		dNode.next = eNode;
		eNode.next = fNode;
		Node resultNode = removeDuplicate(aNode);
		printLinkedList(resultNode);
	}

	private static Node removeDuplicate(Node aNode) {
		if (aNode == null || aNode.next == null) {
			return aNode;
		}
		HashSet<Integer> numberHashSet = new HashSet<>();
		Node currentNode = aNode;
		Node prev = null;
		while (currentNode != null) {
			if (numberHashSet.contains(currentNode.data)) {
				prev.next = currentNode.next;
			} else {
				numberHashSet.add(currentNode.data);
				prev = currentNode;
			}
			currentNode = currentNode.next;
		}
		return aNode;
	}

	private static void printLinkedList(Node resultNode) {
		Node tempNode = resultNode;
		while (tempNode != null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
		System.out.println();
	}

}
