/**
* Insertion Sort
*
* Algorithm loops through each element of the array, sorted elements on the left and unsorted on the right of the "iterative pointer"
* each unsorted element is swapped one by one with all smaller left adjacent sorted element (if applicable) until each element is sorted
* into its inorder place 
*
* Complexity: O(N^2)
* Good For: When an array is mostly sorted (better than Quick Sort in this situation!)
* But: Insertion Sort is slow (but faster than Selection Sort) and it's almost always better to use a faster sorting algorithm like Quick Sort or Merge Sort
*
* @author Sol Kim
* @version 1.0
* @since 8/20/18
*/