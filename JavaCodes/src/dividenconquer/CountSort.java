package week4;

import java.util.Arrays;

public class CountSort {

	public static int[] countSort(int A[], int m){
		int A_Sorted[] = new int[A.length];
		int count[] = new int[m];
		for(int i = 0; i < A.length; i++){
			count[A[i]] = count[A[i]] + 1;
		}
		int pos[] = new int[m];
		for(int i = 1; i < m; i++){
			pos[i] = pos[i-1] + count[i-1];
		}
		for(int j = 0; j < A.length; j++){
			A_Sorted[pos[A[j]]] = A[j];
			pos[A[j]] = pos[A[j]] + 1;
		}
		return A_Sorted;
	}
	public static void main(String[] args) {
		int A[] = {2,3,2,1,3,2,2,3,2,2,2,1,7,7};
		int B[] = countSort(A, 8);
		System.out.println(Arrays.toString(B));
	}

}
