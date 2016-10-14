package week4;


public class MergeSort {

	public static void mergeSort(int A[], int l, int r){
		if(l < r){
			int m = (l + r)/2;
			mergeSort(A, l, m);
			mergeSort(A, m+1, r);
			merge(A, l, m, r);
		}
	}
	
	public static void merge(int A[], int l, int m, int r){
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0; i < n1; i++){
			L[i] = A[l + i];
		}
		for(int j = 0; j < n2; j++){
			R[j] = A[m + 1 + j];
		}
		
		int i = 0,j = 0;
		int k = l;
		
		while(i < n1 && j < n2){
			if(L[i] <= R[j]){
				A[k++] = L[i++];
			}
			else{
				A[k++] = R[j++];
			}
		}
		while(i < n1){
			A[k++] = L[i++];
		}
		while(j < n2){
			A[k++] = R[j++];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {7, 2, 5, 3, 13, 1, 6};
		mergeSort(ar, 0, ar.length-1);
		for(int x:ar)
			System.out.print(x + " ");
	}

}
