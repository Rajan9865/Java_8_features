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
		Node head = null; // Changed 'a' to 'head' for clarity
		Node tail = null;
		int size = 0;

		/**
		 * Insert a value at the end of the list.
		 * 
		 * @param val the value to insert
		 */
		void insertAtEnd(int val) {
			Node newNode = new Node(val);
			if (head == null) {
				head = newNode;
			} else {
				tail.next = newNode;
			}
			tail = newNode;
			size++;
		}

		/**
		 * Display the linked list.
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
		 * Insert a value at the beginning of the list.
		 * 
		 * @param val the value to insert
		 */
		public void insertAtBeginning(int val) { 
			Node newNode = new Node(val);
			if (head == null) {
				insertAtEnd(val);
			} else {
				newNode.next = head;
				head = newNode;
			}
			size++;
		}

		/**
		 * Insert a value at the specified index.
		 * 
		 * @param index the index at which to insert
		 * @param val   the value to insert
		 */
		public void insertAtIndex(int index, int val) {
			if (index < 0 || index > size) { // Improved validation
				System.out.println("Invalid index: " + index);
				return;
			}

			Node newNode = new Node(val);
			if (index == size) {
				insertAtEnd(val);
				return;
			} else if (index == 0) {
				insertAtBeginning(val);
				return;
			}

			Node temp = head;
			for (int i = 1; i < index; i++) {
				temp = temp.next;
			}

			newNode.next = temp.next;
			temp.next = newNode;
			size++;
		}

		/**
		 * Get the value at a specified index.
		 * 
		 * @param index the index to retrieve the value from
		 * @return the value at the index, or -1 if the index is invalid
		 */
		public int getAt(int index) {
			if (index < 0 || index >= size) { 
				System.out.println("Invalid index: " + index);
				return -1;
			}

			Node temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp.data;
		}

		/**
		 * Delete the node at a specified index.
		 * 
		 * @param index the index at which to delete the node
		 */
		public void deleteAt(int index) {
			if (index < 0 || index >= size) { // Corrected to check valid index
				System.out.println("Invalid index: " + index);
				return;
			}

			if (index == 0) {
				head = head.next;
				if (head == null) {
					tail = null; // Fix for edge case when list becomes empty
				}
				size--;
				return;
			}

			Node temp = head;
			for (int i = 1; i < index; i++) {
				temp = temp.next;
			}

			if (temp.next == tail) {
				tail = temp; // Update tail if we're deleting the last element
			}
			temp.next = temp.next.next;
			size--;
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(5);
		ll.insertAtEnd(10);
		ll.insertAtEnd(15);
		ll.insertAtEnd(20);
		ll.insertAtBeginning(25); 
		ll.insertAtIndex(5, 100);
		ll.deleteAt(12); 
		ll.display();
		System.out.println("Size of linked list: " + ll.size);
		System.out.println("Get value at index 3: " + ll.getAt(3));
	}
}
