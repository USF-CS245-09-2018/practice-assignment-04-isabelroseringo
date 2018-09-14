public class BubbleSort implements SortingAlgorithm {

	/*
		- loop through array - if element is greater than one in front, swap
		- do so until you do not need to make any swaps
	*/
	public void sort(int[] a) {
		boolean swapped = true; 
		int last = 0; 
		while (swapped) {
			swapped = false; 
			for (int i = 0; i < a.length - 1 - last; i++) {
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1); 
					swapped = true; 
				}
			}
			last++; 
		}
	}	

	public void swap(int[] a, int x, int y) {
		int temp = a[x]; 
		a[x] = a[y]; 
		a[y] = temp; 
	}
}