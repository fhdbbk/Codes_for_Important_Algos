package week5;

import java.util.Hashtable;

public class KnapsackWithMemoization {
	private static int totalWeight;
	private static int noOfItems;
	private static int v[];
	private static int w[];
	private static Hashtable<Integer, Integer> value = new Hashtable<Integer, Integer>();
	
	public static void initialize(int weight, int items, int itemCosts[], int weights[]){
		totalWeight = weight;
		noOfItems = items;
		v = itemCosts;
		w = weights;
	}
		
	public static void main(String[] args) {
		int totalWeight = 10;
		int items = 4;
		int itemCosts[] = {30, 14, 16, 9};
		int weights[] = {6, 3, 4, 2};
		initialize(totalWeight, items, itemCosts, weights);
		System.out.println(knapsack(KnapsackWithMemoization.totalWeight));
	}
	
	public static int knapsack(int weight){
		if(value.containsKey(weight)){
			return value.get(weight);
		}
		value.put(weight, 0);
		for(int i = 1; i <= noOfItems; i++){
			if(w[i-1] <= weight){
				int val = knapsack(weight - w[i-1]) + v[i-1];
				if(val > value.get(weight)){
					value.put(weight, val);
				}
			}
		}
		return value.get(weight);
	}

}
