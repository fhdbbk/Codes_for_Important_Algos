package week5;

public class KnapsackWithoutRepetition {

	private static int totalWeight;
	private static int noOfItems;
	private static int values[][];
	private static int v[];
	private static int w[];
	public static int knapsack(){
		values = new int[noOfItems + 1][totalWeight + 1];
		for(int j = 0; j <= totalWeight; j++){
			values[0][j] = 0;
		}
		for(int i = 0; i <= noOfItems; i++){
			values[i][0] = 0;
		}
		for(int i = 1; i <= noOfItems; i++){
			for(int j = 1; j <= totalWeight; j++){
				values[i][j] = values[i-1][j];
				if(w[i-1] <= j){
					int val = values[i-1][j - w[i-1]] + v[i-1];
					if (val > values[i][j]){
						values[i][j] = val;
					}
				}
			}
		}
		return values[noOfItems][totalWeight];
	}
	public static void initialize(int weight, int items, int itemCosts[], int weights[]){
		totalWeight = weight;
		noOfItems = items;
		v = itemCosts;
		w = weights;
	}
	
	public static void printValues(){
		for(int i=0; i<=noOfItems; i++){
			for(int j = 0; j <= totalWeight; j++){
				System.out.print(values[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int totalWeight = 10;
		int items = 4;
		int itemCosts[] = {30, 14, 16, 9};
		int weights[] = {6, 3, 4, 2};
		initialize(totalWeight, items, itemCosts, weights);
		System.out.println(knapsack());
		printValues();
	}

}
