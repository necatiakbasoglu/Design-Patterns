package sort;

public class SelectionSort implements ISortStrategy {

	@Override
	public int[] sort(int[] unsortedArray) {
		// TODO Auto-generated method stub
		System.out.println("Selection Sort Strategy");
		int n = unsortedArray.length;
		
		for(int i=0; i<n-1; i++) {
			int minIndexUnsorted = i;
			for(int j = i+1; j<n;j++) {
				//System.out.print(unsortedArray[j] + " "+ j+" ");
				if(unsortedArray[j]<unsortedArray[minIndexUnsorted])
					minIndexUnsorted = j;
			}
			swap(unsortedArray,i,minIndexUnsorted);
		}
		return unsortedArray;
	}
	
	private void swap(int[] arr,int index,int index2) {
		int temp = arr[index];
		arr[index] = arr[index2];
		arr[index2] = temp;
	}
	
	

}
