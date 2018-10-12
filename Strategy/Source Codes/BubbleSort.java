package sort;

public class BubbleSort implements ISortStrategy {

	@Override
	public int[] sort(int[] unsortedArray) {
		// TODO Auto-generated method stub
		System.out.println("Bubble Sort Strategy");
		int n = unsortedArray.length;
		
		for(int i = 0 ; i<n ; i++) {
			for(int j=1; j<n-i;j++) {
				if(unsortedArray[j-1]>unsortedArray[j])
					swap(unsortedArray, j-1, j);
			}
		}
		
		return unsortedArray;
	}
	
	private void swap(int[] arr,int index,int index2) {
		int temp = arr[index];
		arr[index] = arr[index2];
		arr[index2] = temp;
	}
	
	

}
