package week3;
import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        double valuePerUnit[] = new double[values.length];
        for(int i = 0; i < values.length; i++){
        	valuePerUnit[i] = (double)values[i] / weights[i];
        }
        for(int i = 0; i < values.length; i++){
        	if(capacity == 0)
        		return value;
        	int maxWeightIndex = -1;
        	double maxValue = 0;
        	for(int j = 0; j < values.length; j++){
        		if(valuePerUnit[j] > maxValue && weights[j] > 0){
        			maxValue = valuePerUnit[j];
        			maxWeightIndex = j;
        		}
        	}
        	int pickWeight = Math.min(weights[maxWeightIndex], capacity);
        	value += pickWeight * (valuePerUnit[maxWeightIndex]);
        	weights[maxWeightIndex] -= pickWeight;
        	capacity -= pickWeight;
        	valuePerUnit[maxWeightIndex] = -1;
        }
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
        scanner.close();
    }
} 
