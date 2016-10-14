package week4;

import java.util.Arrays;

public class QuickSort {
	int A[] = {};

	public void quickSort(int l, int r){
		if(l < r){
			int k = (int)(Math.random() * (r - l + 1) + l);
			int temp = A[k];
			A[k] = A[l];
			A[l] = temp;
			int m = partition(l, r);
			quickSort(l, m-1);
			quickSort(m+1, r);
		}
	}
	
	public int partition(int l, int r){
		int x = A[l];
		int j = l;
		int i = j + 1;
		while(i <= r){
			if(A[i] <= x){
				j++;
				int temp = A[j];
				A[j] = A[i];
				A[i] = temp;
			}
			i++;
		}
		int temp = A[l];
		A[l] = A[j];
		A[j] = temp;
		return j;
	}
	public static void main(String[] args) {
		
		int Ar[] = {7, 2, 5, 3, 13, 1, 6};
		QuickSort qs = new QuickSort();
		qs.A = Ar;
		qs.quickSort(0, 6);
		System.out.println(Arrays.toString(qs.A));
		
	}

}
