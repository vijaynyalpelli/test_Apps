
public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberArray = {1,3,2,4,5,6,11,-41,-12,0};
		bubble_Sort(numberArray);
		for(int metric: numberArray)
			System.out.print(metric + " ");
	}
	
	static void bubble_Sort(int[] array) {
		int temp;
		boolean swapped;
		for(int i=0; i< array.length; i ++) {
			swapped = false;
			for(int j=0; j< array.length-i-1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
				break;	// if no swap taken place, break loop since its already sorted
		}
	}

}
