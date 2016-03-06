package stack;

public class SpanComputer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stockPrices[] = {15, 40, 13, 10, 28, 8};
		int S[] = computeSpan(stockPrices);
		for(int i = 0; i < S.length; i++)
			System.out.print(S[i] + ", ");

	}
	
	public static int[] computeSpan(int P[]){
		int N = P.length;
		int S[] = new int[N];
		
		ArrayStack D = new ArrayStack(10);
		for(int i = 0; i < N; i++){
			boolean done = false;
			int h = 0;
			while (!D.isEmpty() && !done){
				//System.out.println("Value of i: " + i);
				int k = (Integer)D.top();
				if (P[i] >= P[k])
					D.pop();
				else
					done = true;
			}
			if(D.isEmpty()){
				h = -1;
			}				
			else{
				h = (Integer)D.top();
			}
						
			S[i] = i - h;
			D.push(new Integer(i));
		}
		return S;
	}

}
