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
		//if its the only node
	}
	
	/**
	* Delete the first node of the linked list: O(1)
	*
	* @param
	* @return
	*/
	public void removeFirst(Node endNode) {
		//if empty
		//if the only node
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
			System.out.println("Node: " + printNode.data);
			printNode = printNode.next;
		}
		System.out.println("Last Node: " + printNode.data);
	}
	
	//TEST
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addFirst(new Node(20));
		list.display();
		list.addFirst(new Node(10));
		list.display();
		list.addFirst(new Node(5));
		list.display();
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