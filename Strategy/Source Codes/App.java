package sort;

public class App {

	public static void main(String args[]) {
		ISortStrategy bubbleSort = new BubbleSort();
		ISortStrategy selectionSort =  new SelectionSort();
		Context con = new Context(bubbleSort);
		int[] arr = {3,5,6,8,1,2,40,35,12,14};
		int[] temp = con.sort(arr);
		
		for(int i =0; i<temp.length;i++ )
			System.out.print(temp[i]+" ");
		System.out.println();
		
		con.setSortStrategy(selectionSort);
		
		temp = con.sort(arr);
		
		for(int i =0; i<temp.length;i++ )
			System.out.print(temp[i]+" ");
		
	}
}
