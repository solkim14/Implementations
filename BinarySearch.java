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
	private static int binarySearchI(int elementToFind, int[] arrayToSearch) {
		int elementPosition = -1; //default: -1 means element was not found in the array
		int startPosition = 0;
		int endPosition = arrayToSearch.length - 1;
		int midpoint = arrayToSearch.length/2;
		System.out.println("starting midpoint element: " + arrayToSearch[midpoint]);
		
		while(startPosition <= endPosition) { //while there are still elements to explore
			//if midpoint is equal
			if(arrayToSearch[midpoint] == elementToFind) {
				//set position to current position
				System.out.println("element found!");
				elementPosition = midpoint;
				break;
				//break
			} else if (arrayToSearch[midpoint] > elementToFind) {//else if midpoint is larger
				//limit search to first half
				//move down end position
				System.out.println("search first half");
				endPosition = midpoint-1;
				System.out.println("new ending element: " + arrayToSearch[endPosition]);
			} else { //else midpoint is smaller
				System.out.println("search second half");
			//limit search to second half
				//move up start position
				startPosition = midpoint+1;
				System.out.println("new starting element: " + arrayToSearch[startPosition]);
			}
			
			//calculate midpoint
			midpoint = (startPosition + endPosition)/2;
			System.out.println("midpoint element: " + arrayToSearch[midpoint]); //test to ensure correct midpoint is calculated
		}
		return elementPosition;
	}
	
	public static void main(String[] args) {
		int[] testArray = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int elementToFind = 1;
		
		int position = binarySearchI(elementToFind, testArray);
		System.out.print("The Position of " + elementToFind + " in the array is " + position);
	}
}