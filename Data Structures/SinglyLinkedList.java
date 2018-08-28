/**
* An implementation of a Singly Linked List (circular)
*
* Good for:
* But:
*
* @author Sol Kim
* @version 1.0
* @since 8/27/18
*/

public class SinglyLinkedList {
	private Node head;
	private Node tail;

	//TEST SINGLYLINKEDLIST
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		//tested addFirst and display
		
		list.addFirst(new Node(20));
		list.display();
		list.addFirst(new Node(10));
		list.display();
		list.addFirst(new Node(5));
		list.display();
		
		
		//tested addLast and display
		
		list.addLast(new Node(1));
		list.display();
		list.addLast(new Node(2));
		list.display();
		list.addLast(new Node(3));
		list.display();
		
	}
	
	/**
	* Insert node to the beginning of the linked list: O(1)
	*
	* @param
	* @return
	*/
	public void addFirst(Node firstNode) {
		if (head==null && tail==null) { //if the linked list is empty
			head = firstNode;
			tail = firstNode;
			head.next = tail;
			tail.next = head;
		} else {
			firstNode.next = head;
			tail.next = firstNode;
			head = firstNode;
		}
	}
	
	/**
	* Add node to the end of the linked list: O(n)
	*
	* @param
	* @return
	*/
	public void addLast(Node lastNode) {
		if (head==null && tail==null) { //if the linked list is empty
			head = lastNode;
			tail = lastNode;
			head.next = tail;
			tail.next = head;
		} else {
			tail.next = lastNode;
			tail = lastNode;
			tail.next = head;
		}
	}
	
	/**
	* Delete the first node of the linked list: O(1)
	*
	* @param
	* @return
	*/
	public void removeFirst(Node endNode) {
		if (head==null && tail==null) { //if empty
			System.out.println("Linked list is empty! Can't remove!");
		} else {
			
		}
	}
	
	/**
	* Delete the last node of the linked list: O(n)
	*
	* @param
	* @return
	*/
	public void removeLast(Node endNode) {
		//if empty
		//if the only node
	}
	
	/**
	* Returns the size of the linked list: O(n)
	*
	* @param
	* @return
	*/
	public int size() {
		//while linked list node does not equal the head
		return 1; //dummy int
	}
	
	/**
	* Returns the node at given index; if index does not exist prints "INDEX DOES NOT EXIST" and returns a null node: O(n)
	*
	* @param
	* @return
	*/
	public Node getNode() {
		return null; //dummy node
	}
	
	/**
	* Adds a node to the given index. If index does not exist prints "INDEX DOES NOT EXIST": O(n)
	*
	* @param
	* @return
	*/
	public void addNode(Node endNode) {
		
	}
	
	/**
	* Prints the entire linked list: O(n)
	*
	* @param
	* @return
	*/
	public void display() {
		Node printNode = head;
		while(printNode != tail) {
			System.out.print(printNode.data + ", ");
			printNode = printNode.next;
		}
		System.out.println(printNode.data); //last node
		System.out.println(" head is " + head.data + ", tail is " + tail.data);
	}
}

/** NODE CLASS FOR SINGLY LINKED LIST */
class Node {
	//node constructor
	public int data;
	public Node next;
	
	public Node(int nodeData) {
		data = nodeData;
		next = null;
	}
}