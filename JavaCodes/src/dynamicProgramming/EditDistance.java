package week5;


//This computes the number of changes required in 2 strings
//to make them similar.
public class EditDistance {
	private static int D[][] = {};
	public static int editDistance(String A, String B){
		D = new int[A.length() + 1][B.length() + 1];
		for(int i = 0; i <= A.length(); i++){
			D[i][0] = i;
		}
		for(int j = 0; j <= B.length(); j++){
			D[0][j] = j;
		}
		for(int j = 1; j <= B.length(); j++){
			for(int i = 1; i <= A.length(); i++){
				int insertion = D[i][j-1] + 1;
				int deletion = D[i-1][j] + 1;
				int match = D[i-1][j-1];
				int mismatch = D[i-1][j-1] + 1;
				if(A.substring(i-1, i).equals(B.substring(j-1, j))){
					D[i][j] = Math.min(Math.min(insertion, deletion), match);
				}
				else{
					D[i][j] = Math.min(Math.min(insertion, deletion), mismatch);
				}
			}
		}
		return D[A.length()][B.length()];
	}
	public static void print2DArray(){
		for(int i = 0; i <= 7; i++){
			for(int j = 0; j <= 8; j++){
				System.out.print(D[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println(editDistance("EDITING", "DISTANCE"));
		print2DArray();
	}

}
