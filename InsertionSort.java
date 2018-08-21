/**
* Insertion Sort
*
* Algorithm loops through each element of the array, sorted elements on the left and unsorted on the right of the "iterative pointer"
* each unsorted element is swapped one by one with all smaller left adjacent sorted element (if applicable) until each element is sorted
* into its inorder place 
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
	public static void main(String[] args) {
		int[] testArray = {2, 3, 4000, 1, 800, 4, 0};
		
		if(testArray.length<=1) {
			for(int element : testArray) {System.out.print(element + " ");}
		} else {
			//loop all elements of array (starting at 1 going up)
			for(int i=1; i<testArray.length; i++) {
				//loop all previous elements (starting at 0 going backwards)
				int currentElement = testArray[i];
				for(int j=i-1; j>=0; j--) {
					//System.out.println(i + ", " + j); //test to make sure correct pairs are being checked
					//if previous element is greater swap
					if(testArray[i] < testArray[j]) {
						int temp = testArray[i];
						testArray[i] = testArray[j];
						testArray[j] = temp;
						i--;
						for(int element : testArray) {System.out.print(element + " ");} //test to make sure swaps are happening
						System.out.println();
					} else {//else break
						break;
					}
				}
			}
		}
		for(int element : testArray) {System.out.print(element + " ");} //print sorted array
	}
}