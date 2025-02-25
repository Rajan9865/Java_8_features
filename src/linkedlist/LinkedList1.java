/**
 * 
 */
package linkedlist;

/**
 * linkedlist
 * 
 * @author Rajan kumar
 */
public class LinkedList1 {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node a = new Node(5);
		Node b = new Node(10);
		Node c = new Node(15);
		Node d = new Node(20);
		Node e = new Node(25);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		inSertAtEnd(a,1000);
		Node currentNode = a;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
		System.out.println("***********display methods**********");
		displayLinkedlist(a);
		System.out.println(" linked list a lose it");
		displayLinkedlistLoseIta(a);// a lose it
		System.out.println("recursivelt print linkedList");
		displayLinkedlistRecursive(a);// a lose it
		System.out.println("recursivelt Reverse print linkedList");
		displayLinkedlistRecursiveAndAlsoReverse(a);// a lose it
		System.out.println(" count of linkedlist size " + LinkedlistCount(a));

	}

	/**
	 * @param a
	 * @param i
	 */
	private static void inSertAtEnd(Node a, int val) {
		Node tempNode=new Node(val);
		Node t=a;
		while(t.next!=null) {
			t=t.next;
		}
		t.next=tempNode;
	}

	/**
	 * @param a
	 * @return
	 */
	private static int LinkedlistCount(Node a) {
		int count = 0;
		while (a != null) {
			count++;
			a = a.next;
		}
		return count;
	}

	/**
	 * @param a
	 */
	private static void displayLinkedlistRecursiveAndAlsoReverse(Node a) {
		if (a == null) {
			return;
		}
		displayLinkedlistRecursiveAndAlsoReverse(a.next);
		System.out.print(a.data + " ");
	}

	/**
	 * @param a
	 */
	private static void displayLinkedlistRecursive(Node a) {
		if (a == null) {
			return;
		}
		System.out.print(a.data + " ");
		displayLinkedlistRecursive(a.next);
	}

	/**
	 * @param a
	 */
	private static void displayLinkedlistLoseIta(Node a) {
		while (a != null) {
			System.out.print(a.data + " ");
			a = a.next;
		}
		// a lose it in this case
		while (a != null) {
			System.out.print(a.data + " ");
			a = a.next;
		}
	}

	/**
	 * @param a
	 */
	private static void displayLinkedlist(Node a) {
		Node tempNode = a;
		while (tempNode != null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
	}
}
