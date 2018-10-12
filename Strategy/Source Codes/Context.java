package sort;

public class Context {
	private ISortStrategy sortStrategy;
	
	public Context(ISortStrategy sortStrategy) {
		setSortStrategy(sortStrategy);
	}
	
	public void setSortStrategy(ISortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
	
	public int[] sort(int[] unsortedArray) {
		return sortStrategy.sort(unsortedArray);
	}
}
