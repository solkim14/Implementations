/**
* ArrayList
*
* A simple implementation of an ArrayList with add(), get(), remove(), and size() functions
*
* Good for:
* Bad for:
*
* @author Sol Kim
* @version 1.0
* @since 8/23/18
*/

public class MyArrayList {
	
	/**
	* adds an element to the ArrayList
	*
	* @param element element to add to the ArrayList
	* @return none
	*/
	private void add(Object element) {
		return;
	}
	
	/**
	* returns the element in the ArrayList at the given index
	*
	* @param index the index of the element to be returned
	* @return element the element at the given index
	*/
	private Object get(int index) {
		Object dummy = new Object();
		return dummy;
	}
	
	/**
	* removes the given element from the ArrayList
	*
	* @param index index of element to be removed
	* @return element element removed from the ArrayList
	*/
	private Object remove(int index) {
		Object dummy = new Object();
		return dummy;
	}
	

	/**
	* returns the size of the ArrayList
	*
	* @param none
	* @return size size of the ArrayList
	*/
	private int size() {
		int size = 0;
		return size;
	}
	
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();
		
		myArrayList.add("whoo");
		myArrayList.get(1);
		myArrayList.remove(1);
		myArrayList.size();
	}
}