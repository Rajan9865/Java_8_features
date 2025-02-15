/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class ArraytoLinkedList {
	public static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 6, 7, 9, 2, 10 };
		System.out.println("Original array");
		printArray(arr);
		Node headNode = constructALinkedList(arr);
		System.out.println("linkedList array");
		printLinkedList(headNode);
	}

	/**
	 * @param arr
	 */
	private static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	/**
	 * @param headNode
	 */
	private static void printLinkedList(Node headNode) {
		Node tempNode = headNode;
		while (tempNode != null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
	}

	/**
	 * @param arr
	 * @return
	 */
	private static Node constructALinkedList(int[] arr) {
		Node head = new Node(arr[0]);
		Node tempNode = head;
		for (int i = 1; i < arr.length; i++) {
			Node newNode = new Node(arr[i]);
			tempNode.next = newNode;
			tempNode = newNode;
		}
		return head;
	}

}
