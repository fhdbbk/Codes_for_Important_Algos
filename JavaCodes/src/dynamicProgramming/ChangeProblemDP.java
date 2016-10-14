package week5;

public class ChangeProblemDP {
	private static int MinNumCoins[] = {};
	public static int DPChange(int money, int coins[]){
		MinNumCoins = new int[money+1];
		MinNumCoins[0] = 0;
		for(int m = 1; m <= money; m++){
			MinNumCoins[m] = Integer.MAX_VALUE;
			for(int i = 0; i < coins.length; i++){
				if(m >= coins[i]){
					int numCoins = MinNumCoins[m - coins[i]] + 1;
					if(numCoins < MinNumCoins[m])
						MinNumCoins[m] = numCoins;
				}
			}
		}
		return MinNumCoins[money];
	}
	public static void main(String[] args) {
		int []coins = {1, 5, 6};
		System.out.println(DPChange(76, coins));

	}

}
