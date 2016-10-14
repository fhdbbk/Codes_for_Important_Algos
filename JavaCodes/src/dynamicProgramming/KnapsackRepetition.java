package week5;

import java.util.Arrays;

public class KnapsackRepetition {

	private static int v[] = {};
	private static int w[] = {};
	
	public static int knapsack(int W){
		int []value = new int[W+1];
		value[0] = 0;
		for(int weight = 1; weight <= W; weight++){
			value[weight] = 0;
			for(int i = 0; i < w.length; i++){
				if (w[i] <= weight){
					int val = value[weight - w[i]] + v[i];
					if(val > value[weight]){
						value[weight] = val;
					}
				}
			}
		}
		System.out.println(Arrays.toString(value));
		return value[W];
	}
	public static void main(String[] args) {
		int weights[] = {6, 3, 4, 2};
		w = weights;
		int values[] = {30, 14, 16, 9};
		v = values;
		System.out.println(knapsack(10));
		
	}

}
