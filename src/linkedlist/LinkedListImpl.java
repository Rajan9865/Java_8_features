/**
 * 
 */
package linkedlist;

/**
 * linkedlist
 * 
 * @author Rajan kumar
 */
public class LinkedListImpl {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static class LinkedList {
		Node head = null;
		Node tail = null;
		int size = 0;

		/**
		 * @param i
		 */
		void insertAtEnd(int val) {
			Node temp = new Node(val);
			if (head == null) {
				head = temp;
			} else {
				tail.next = temp;
			}
			tail = temp;
			size++;
		}

		/**
		 * 
		 */
		public void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

		/**
		 * @return
		 */
		/*
		 * int size() { Node temp = head; int count = 0; while (temp != null) { count++;
		 * temp = temp.next; } return count; }
		 */

		/**
		 * @param i
		 */
		public void insertAtHead(int val) {
			Node temp = new Node(val);
			if (head == null) {
//				head=tail=temp;
				insertAtEnd(val);
			} else {
				temp.next = head;
				head = temp;
			}
			size++;
		}

		/**
		 * @param i
		 * @param j
		 */
		public void insertAtIndex(int idx, int val) {
			Node t = new Node(val);
			Node temp = head;
			if (idx == size) {
				insertAtEnd(val);
				return;
			} else if (idx == 0) {
				insertAtHead(val);
				return;
			} else if (idx < 0 || idx > size) {
				System.out.println("you entered wrong indes " + idx);
				return;
			}
			for (int i = 1; i <= idx - 1; i++) {
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;
			size++;
		}

		/**
		 * @param i
		 * @return
		 */
		public int getAt(int idx) {
			Node temp = head;
			if (idx < 0 || idx > size) {
				System.out.println("you entered wrong indes " + idx);
				return -1;
			}
			for (int i = 1; i <= idx; i++) {
				temp = temp.next;
			}
			return temp.data;
		}

		/**
		 * @param i
		 */
		public void DeleteAt(int idx) {
			if (idx == 0) {
				head = head.next;
				size--;
				return;
			} else if (idx < 0 || idx > size) {
				System.out.println("you entered wrong indes " + idx);
				return;
			}
			Node temp = head;
			for (int i = 1; i <= idx - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			tail = temp;
			size--;
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(5);
		ll.insertAtEnd(10);
		ll.insertAtEnd(15);
		ll.insertAtEnd(20);
		ll.insertAtHead(25);
		ll.insertAtIndex(5, 100);
		ll.DeleteAt(12);
		ll.display();
		System.out.println("size of linkedlist: " + ll.size);
		System.out.println("get index of linkedList :" + ll.getAt(3));

	}

}
