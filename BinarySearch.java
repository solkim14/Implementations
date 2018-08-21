/**
* Binary Search
*
* Searches a sorted array by repeatedly dividing the search interval in half
*
* Complexity: O(log(n))
* Good For: 
* But:
*
* @author Sol Kim
* @version 1.0
* @since 8/20/18
*/

public class BinarySearch {
	/**
	* Loops through a given array and prints out its contents
	*
	* @param the array to print
	* @return none
	*/
	private static void printLoop(int[] arrayToPrint) {
		for(int element : arrayToPrint) {System.out.print(element + " ");}
		System.out.println();
	}
	
	/**
	* Binary Search implemented iteratively
	* @param arrayToSearch the array you are searching
	* @return position the position of the integer you are searching for
	*/
	private static int binarySearchI(int[] arrayToSearch) {
		return 0; //dummy int
	}
	
	public static void main(String[] args) {
		int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int elementToFind = 4;
		
		int position = binarySearchI(testArray);
		System.out.print("The Position of " + elementToFind + " in the array is " + position);
	}
}