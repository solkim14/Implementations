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
		/**
		list.addFirst(new Node(20));
		list.display();
		list.addFirst(new Node(10));
		list.display();
		list.addFirst(new Node(5));
		list.display();
		*/
		
		//tested addLast and display
		
		list.addLast(new Node(1));
		list.display();
		list.addLast(new Node(2));
		list.display();
		list.addLast(new Node(3));
		list.display();
		
		
		//tested removeFirst and display
		/**
		list.removeFirst();
		list.display();
		list.removeFirst();
		list.display();
		list.removeFirst();
		list.display();
		*/
		
		//tested removeLast and display
		list.removeLast();
		list.display();
		list.removeLast();
		list.display();
		list.removeLast();
		list.display();
	
		
	}
	
	/**
	* Insert node to the beginning of the linked list: O(1)
	*
	* @param firstNode the node to add to the beginning of the list
	* @return none
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
	* Add node to the end of the linked list: O(1)
	*
	* @param lastNode the node to add to the end of the linked list
	* @return none
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
	* Remove the first node of the linked list: O(1)
	*
	* @param none
	* @return the first node of the linked list removed
	*/
	public Node removeFirst() {
		Node firstNode = null;
				
		if (head==null && tail==null) { //if empty
			System.out.println("Linked list is empty! Can't remove!");
			//System.out.println("test 1");
		} else if (head == tail) { //if only one element in the linked list
			head = tail = null;
			//System.out.println("test 2");
		} else {
			//System.out.println("test 3");
			firstNode = head;
			head = head.next;
			firstNode.next = null;
			tail.next = head;
		}
		return firstNode;
	}
	
	/**
	* Remove the last node of the linked list: O(n)
	*
	* @param none
	* @return the last node of the linked list removed
	*/
	public Node removeLast() {
		Node lastNode = null;
		Node findNode = head;
		Node secondToLast = null;
				
		if (head==null && tail==null) { //if empty
			System.out.println("Linked list is empty! Can't remove!");
		} else if (head == tail) { //if only one element in the linked list
			head = tail = null;
		} else {
			while (findNode != tail) { //find the second to last node
				if (findNode.next == tail) { //found it
					secondToLast = findNode;
					break;
				}
				findNode = findNode.next;
			}
			lastNode = tail;
			lastNode.next = null;
			tail = secondToLast;
			tail.next = head;
		}
		return lastNode;
	}
	
	/**
	* Returns the size of the linked list: O(n)
	*
	* @param none
	* @return the size of the linked list
	*/
	public int size() {
		//while linked list node does not equal the head
		return 1; //dummy int
	}
	
	/**
	* Returns the node at given index; if index does not exist prints "INDEX DOES NOT EXIST" and returns a null node: O(n)
	*
	* @param index the index of the node to be returned
	* @return the node at the given index
	*/
	public Node getNode(int index) {
		return null; //dummy node
	}
	
	/**
	* Adds a node to the given index. If index does not exist prints "INDEX DOES NOT EXIST": O(n)
	*
	* @param index the index of the node to be added
	* @return none
	*/
	public void addNode(int index) {
		
	}
	
	/**
	* Prints the entire linked list: O(n)
	*
	* @param none
	* @return none
	* @throws NullPointerException
	*/
	public void display() {
		//System.out.println("i'm in display");
		Node printNode = head;
		
		if (printNode != null) { //only display if the linked list is not empty
			while(printNode != tail) {
				System.out.print(printNode.data + ", ");
				printNode = printNode.next;
			}
			System.out.println(printNode.data); //last node
			System.out.println(" head is " + head.data + ", tail is " + tail.data);
		} else {
			System.out.println("No nodes to display :/");
		}
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