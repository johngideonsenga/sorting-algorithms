public class main{
	public static void main(String args[]){
		int A[]={1,0,2,9,3,8,4,7,6,5};
		Sort sort = new Sort();
		
		System.out.print("Unsorted: ");
		sort.print(A);
		
		System.out.print("\nBucket Sort: ");
		sort.bucketSort(A);
		System.out.print("\nCounting Sort: ");
		sort.countingSort(A);
		System.out.print("\nQuick Sort: ");
		sort.quickSort(A,0,A.length-1);
		sort.print(A);
		System.out.print("\nSelection Sort: ");
		sort.selectionSort(A);
	}
}