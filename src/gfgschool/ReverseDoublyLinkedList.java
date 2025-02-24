/**
 * 
 */
package gfgschool;

import java.util.ArrayList;

/**
 * gfgschool
 *@author Rajan kumar
 */
public class ReverseDoublyLinkedList {
	public static class Node{
		int data;
		Node prev;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node a = new Node(1);
        a.next = new Node(2);
        a.next.prev = a;
        a.next.next = new Node(3);
        a.next.next.prev = a.next;

        ArrayList<Integer> result = displayList(a);
        System.out.println(result); 
		
	}
	private static ArrayList<Integer> displayList(Node head) {
		ArrayList<Integer>arrayList=new ArrayList<>();
		Node tempNode=head;
		while(tempNode!=null)
		{
			arrayList.add(tempNode.data);
			tempNode=tempNode.next;
		}
		return arrayList;
	}
}
