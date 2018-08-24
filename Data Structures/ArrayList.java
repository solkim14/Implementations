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
	private Object[] objectArray = new Object[10];
	private int lastObjectIndex = 0;
	
	/**
	* adds an element to the ArrayList
	*
	* @param element element to add to the ArrayList
	* @return none
	*/
	private void add(Object element) {
		System.out.println("added object!");
		
		if(lastObjectIndex == objectArray.length) { //check if array is out of space
			System.out.println("size is" + objectArray.length);
			resize();
			System.out.println("new size is" + objectArray.length);
		}
		//insert object at the end of the array
		objectArray[lastObjectIndex++] = element;
		return;
	}
	
	/**
	* returns the element in the ArrayList at the given index
	*
	* @param index the index of the element to be returned
	* @return element the element at the given index
	*/
	private Object get(int index) {
		System.out.println("got object!");
		
		if(index < 0 || index > objectArray.length-1) { //check to make sure index is valid
			System.out.println("not valid!");
		}
		return objectArray[index];
	}
	
	/**
	* removes the given element from the ArrayList
	*
	* @param index index of element to be removed
	* @return element element removed from the ArrayList
	*/
	private Object remove(int index) {
		System.out.println("removed object!");
		if(index < 0 || index > objectArray.length-1) { //check to make sure index is valid
			System.out.println("not valid!");
		}
		//remove object
		Object objectRemoved = objectArray[index];
		//shift all the stuff over
		for(int i=index+1; i<objectArray.length; i++) {
			objectArray[i-1] = objectArray[i];
		}
		lastObjectIndex--;
		return objectRemoved;
	}

	/**
	* returns the size of the ArrayList
	*
	* @param none
	* @return size size of the ArrayList
	*/
	private int size() {
		System.out.println("got size");
		return lastObjectIndex;
	}
	
	/**
	* doubles the size of the array to accomodate growing array size
	*
	* @param none
	* @return none
	*/
	private void resize() { //look into copyof array function
		Object[] tempArray = new Object[objectArray.length*2];
		for(int i=0; i<objectArray.length; i++) { //copy contents of objectArray into tempArray
			tempArray[i] = objectArray[i];
		}
		objectArray = tempArray;
	}
	
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();
		
		myArrayList.add("whoo");
		System.out.println(myArrayList.get(0));
		System.out.println(myArrayList.remove(0));
		System.out.println(myArrayList.size());
	}
}