
public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[] numberArray = {1,3,2,4,5,6,11,-41,-12,0, 0,-1,-9};
		quick_Sort(numberArray, 0, numberArray.length-1);
		for(int metric: numberArray)
			System.out.print(metric + " ");
	}
	
	static void quick_Sort(int[] numberArray, int start, int end) {
		int pivot;
		if(start < end) {
			pivot = partition(numberArray, start, end);
			quick_Sort(numberArray, start, pivot-1);
			quick_Sort(numberArray, pivot+1, end);
		}
	}
	
	static int partition(int[] numberArray, int start, int end) {
		int pindex = start;
		int pivot = numberArray[end];
		int temp;
		
		for(int i=start; i<end; i++) {
			if(numberArray[i] < pivot) {
				temp = numberArray[i];
				numberArray[i] = numberArray[pindex];
				numberArray[pindex] = temp;
				pindex++;
			}
		}
		
		temp = numberArray[end];
		numberArray[end] = numberArray[pindex];
		numberArray[pindex] = temp;
		
		return pindex;
	}
}


