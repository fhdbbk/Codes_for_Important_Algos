package week5;

import java.util.Arrays;

public class ExpressionValue {

	private static int[] digits;
	private static char[] ops;
	private static int[][] m;
	private static int[][] M;
	
	public static void initialize(String exp){
		char[] ex = exp.toCharArray();
		int noOfDigits = (int)Math.ceil(exp.length()/2.0);
		digits = new int[noOfDigits];
		ops = new char[noOfDigits - 1];
		for(int i = 0, j = 0, k = 0; i < ex.length; i++){
			if(i % 2 == 0){
				digits[j++] = Integer.parseInt(String.valueOf(ex[i]));
			}
			else
				ops[k++] = ex[i];
		}
		m = new int[noOfDigits+1][noOfDigits+1];
		M = new int[noOfDigits+1][noOfDigits+1];
		System.out.println("Digits array:");
		System.out.println(Arrays.toString(digits));
		System.out.println("Operators array:");
		System.out.println(Arrays.toString(ops));
	}
	
	public static int Parenthesis(){
		for(int i = 1; i <= digits.length; i++){
			m[i][i] = digits[i-1];
			M[i][i] = digits[i-1];
		}
		//printMinArr();
		int n = digits.length;
		for(int s = 1; s <= n - 1; s++){
			for(int i = 1; i <= n - s; i++){
				int j = i + s;
				int minmax[] = MinAndMax(i, j);
				m[i][j] = minmax[0];
				M[i][j] = minmax[1];
			}
		}
		return M[1][n];
	}
	
	public static int[] MinAndMax(int i, int j){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int k = i; k <= j-1; k++){
			//System.out.println("M[" + i + "][" + k + "] " + ops[k-1] + "M[" + (k+1) + "][" + j + "] = " + M[i][k] + " " + M[k+1][j]);
			//System.out.println("m[" + i + "][" + k + "] " + ops[k-1] + "m[" + (k+1) + "][" + j + "] = " + m[i][k] + " " + m[k+1][j]);
			int a = evaluate(M[i][k], ops[k-1], M[k+1][j]);
			int b = evaluate(M[i][k], ops[k-1], m[k+1][j]);
			int c = evaluate(m[i][k], ops[k-1], M[k+1][j]);
			int d = evaluate(m[i][k], ops[k-1], m[k+1][j]);
			min = minimum(min, a, b, c, d);
			max = maximum(max, a, b, c, d);
		}
		int result[] = {min, max};
		return result;
	}
	
	public static int minimum(int... a){
		int min = Integer.MAX_VALUE;
		for(int x: a){
			if (x < min)
				min = x;
		}
		return min;
	}
	
	public static int maximum(int... a){
		int max = Integer.MIN_VALUE;
		for(int x: a){
			if (x > max)
				max = x;
		}
		return max;
	}
	
	public static int evaluate(int x, char op, int y){
		int result = 0;
		//System.out.print("Evaluating " + x + " " + op + " " + y);
		if(op == '+'){
			result = x + y;
		}
		else if(op == '-'){
			result = x - y;
		}
		else if(op == '*'){
			result = x * y;
		}
		else if(op == '/'){
			result = x / y;
		}
		//System.out.println(" and result is: " + result);
		return result;
	}
	
	public static void printMinArr(){
		System.out.println("Min Array:");
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m.length; j++){
				System.out.printf("%10d ", m[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void printMaxArr(){
		System.out.println("Max Array:");
		for(int i = 0; i < M.length; i++){
			for(int j = 0; j < M.length; j++){
				System.out.printf("%10d ", M[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String exp = "5-8+7*4-8+9";
		initialize(exp);
		System.out.println(Parenthesis());
		printMinArr();
		printMaxArr();
		//System.out.println(minimum(Integer.MAX_VALUE, 34, 7, 8, 4));
		//System.out.println(maximum(Integer.MIN_VALUE, 34, 7, 8, 4));
	}

}
