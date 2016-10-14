package week2;

public class FibRecurs {

	public static long fiboNumber(long n){
		if(n <= 1)
			return 1;
		return fiboNumber(n-1) + fiboNumber(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45;
		System.out.println(fiboNumber(n));
	}

}
