/**
* Insertion Sort
*
* Algorithm loops through each element of the array, sorted elements on the left side of the 'i' position of the array and unsorted on the right.
* Each unsorted element is swapped one by one with all smaller left adjacent sorted element (if applicable) until each element is sorted into correct position
*
* Complexity: O(n^2)
* Good For: When an array is mostly sorted (better than Quick Sort in this situation!)
* But: Insertion Sort is slow (but faster than Selection Sort) and it's almost always better to use a faster sorting algorithm like Quick Sort or Merge Sort
*
* @author Sol Kim
* @version 1.0
* @since 8/20/18
*/

public class InsertionSort {
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

	public static void main(String[] args) {
		int[] testArray = {2, 3, 4000, 1, 800, 4, 0};
		
		if(testArray.length<=1) { //if array is size 1 or less no need to sort
			printLoop(testArray);
		} else {
			for(int i=1; i<testArray.length; i++) { //element to sort
				int currentElement = testArray[i];
				for(int j=i-1; j>=0; j--) { //previous elements to sort against
					if(testArray[i] < testArray[j]) {
						int temp = testArray[i];
						testArray[i] = testArray[j];
						testArray[j] = temp;
						i--;
					} else {// element has been put in its proper sorted position: break
						break;
					}
				}
			}
		printLoop(testArray); //print sorted array
		}
	}
}