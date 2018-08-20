/**
* Selection Sort
*
* Algorithm starts by assuming the first element of an array is the minimum
* The algorithm then iterates through all the remaining elements,
* continuously searching for the smallest, unsorted element and swapping it until it has been completely sorted
*
* Complexity: O(n^2)
* Good For: When simplicity is more important than time complexity
* But: Selection Sort is very slow and it's almost always better to use a faster sorting algorithm like Quick Sort or Merge Sort
*
* @author Sol Kim
* @version 1.0
* @since 8/20/18
*/

public class SelectionSort {
	private static int[] testArray = {};
	
	public static void main(String[] args) {
		for(int i=0; i<testArray.length-1; i++) {
			for(int j=i+1; j<testArray.length; j++) {
				//System.out.println(i + ", " + j); //test to make sure the correct pairs are being tested
				System.out.println(testArray[i] + ", " + testArray[j]); //printing the pairs being compared
              if (testArray[i] > testArray[j]) { //swap if currentSmallest is bigger than the element it is being compared to
                //System.out.println("do a swap"); //test to make sure swaps are happening in the correct place
                int temp = testArray[i];
                testArray[i] = testArray[j];
                testArray[j] = temp;
                for(int element:testArray){System.out.print(element);} //print to get testArrays current state of affairs
                System.out.println();
				}
            }
		}
	}
}