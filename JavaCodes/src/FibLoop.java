package week2;

public class FibLoop {

	public static long getFiboNumber(long n){
		if(n <= 1){
			return n;
		}
		long a = 0, b = 1;
		long fib = 0;
		int i = 2;
		while(i <= n){
			fib = a + b;
			a = b;
			b = fib;
			i++;
		}
		return fib;
	}
	
	public static long getFiboList(int n){
		long F[] = new long[n+1];
		F[0] = 0;
		F[1] = 1;
		for(int i = 2; i <= n; i++){
			F[i] = F[i-1] + F[i-2];
		}
		return F[n];
	}
	public static void main(String[] args) {
		int n = 100;
		long t1 = System.currentTimeMillis();
		System.out.println(getFiboNumber(n));
		long t2 = System.currentTimeMillis();
		long tsec = (t2-t1);
		System.out.println("Seconds used in loops: " + tsec);
		t1 = System.currentTimeMillis();
		System.out.println(getFiboList(n));
		t2 = System.currentTimeMillis();
		tsec = (t2-t1);
		System.out.println("Seconds used in table: " + tsec);
	}

}
