import java.util.Scanner;

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
		
		while(startPosition <= endPosition) { //while there are still elements to explore
			int midpoint = (startPosition + endPosition)/2; //find new midpoint
		
			if(arrayToSearch[midpoint] == elementToFind) { //found the element
				elementPosition = midpoint;
				break;
			} else if (arrayToSearch[midpoint] > elementToFind) {//element is before the midpoint
				endPosition = midpoint-1;
			} else { //element is after the midpoint
				startPosition = midpoint+1;
			}
		}
		return elementPosition;
	}
	
	public static void main(String[] args) {
		int[] testArray = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int elementToFind = 0;
		
		Scanner scanner = new Scanner(System.in);;
		try {
		    System.out.println("Enter an integer to find and we will return its position in our array (if applicable): ");
		    elementToFind = scanner.nextInt();
		    int position = binarySearchI(elementToFind, testArray);
    		
    		if (position != -1) {
    		    System.out.print("The Position of " + elementToFind + " in the array is " + position);
    		} else {
    		    System.out.print("The array does not contain " + elementToFind);
    		}
		} /**catch (InputMismatchException imEx) {
		    System.out.println("You did not enter an integer! Please enter an integer to continue: ");
		} catch (NoSuchElementException nseEx) {
		    nseEx.printStackTrace();
		} catch (IllegalStateException isEx) {
		    isEx.printStackTrace();
		} */ finally {
            scanner.close();
		}
	}
}