package week4;

public class BinarySearch {

	private static int binarySearch(int a[], int low, int high, int key){
		if(high < low){
			return low-1;
		}
		int mid = low + (high - low)/2;
		if(key == a[mid])
			return mid;
		else if(key < a[mid]){
			return binarySearch(a, low, mid - 1, key);
		}
		else
			return binarySearch(a, mid + 1, high, key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {15, 23, 28, 72, 80};
		System.out.println(binarySearch(A, 0, A.length-1, 80));
	}

}
