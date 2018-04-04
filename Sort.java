public class Sort{
	
	public void bucketSort(int A[]){
		int max = A[0];
		for(int i = 0; i < A.length; i++)			//find the highest no.
			if(max<A[i])max = A[i];
		
		int bucket[] = new int[max+1];
		
		for(int i = 0; i < A.length; i++) 			//fill in the bucket.
			bucket[A[i]]++;
		
		int current = 0;
		for(int i = 0; i < bucket.length; i++){		//sort.
			for (int j=0; j<bucket[i]; j++)
				A[current++]=i;
		}
		print(A);
	}
	
	public void countingSort(int A[]){
		int max = A[0];
		for(int i = 0; i < A.length; i++)			//find the highest no.
			if(max<A[i])max = A[i];
		
		int sorted[] = new int[A.length];
		int count[] = new int[max+1];
		
		for(int i = 0; i < A.length; i++) 			//fill in the bucket.
			count[A[i]]++;
		
		for(int i = 1; i < count.length; i++)		//find the sum.
			count[i] += count[i-1];
		
		for(int i = 0; i < A.length; i++){ 			//sort.
			sorted[count[A[i]]-1] = A[i];
			count[A[i]]--;
		}
		
		for(int i = 0; i < sorted.length; i++)
			A[i] = sorted[i];
		
		print(A);
	}
	
	private int partition(int A[], int start, int end){
		int pivot = A[end];
		int current = start;
		for(int i = start; i < end; i++){
			if(A[i] <= pivot){
				swap(A,i,current);
				current++;
			}
		}
		swap(A,end,current);
		return current;
	}
	
	public void quickSort(int A[], int start, int end){
		if(start >= end)return;
		
			int pivot = partition(A,start,end);
			quickSort(A,start,pivot-1);
			quickSort(A,pivot+1,end);
		
	}
	
	public void selectionSort(int A[]){
		int min = 0;
		
		for(int i = 0; i < A.length; i++){	
			min = i;
			for(int j = i; j < A.length; j++){		//find the lowest no.
				if(A[min]>A[j])
					min = j;
			}
			swap(A,i,min);							//swap i with min.
		}	
		
		print(A);
	}
	
	private void swap(int A[], int x, int y){
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}
	
	public void print(int A[]){
		for(int i = 0; i < A.length; i++)
			System.out.print(A[i]+" ");
	}
	
}