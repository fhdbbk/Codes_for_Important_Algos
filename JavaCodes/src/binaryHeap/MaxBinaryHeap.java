package week2;

public class MaxBinaryHeap {

	private int maxSize;
	private int H[];
	private int size;
	
	public int parent(int i){
		return (int)Math.floor(i);
	}
	
	public int left(int i){
		return (2 * i);
	}
	
	public int right(int i){
		return (2 * i + 1);
	}
	
	public void siftUp(int i){
		while (i > 1 && H[i] > H[parent(i)]){
			int temp = H[i];
			H[i] = H[parent(i)];
			H[parent(i)] = temp;
			i = parent(i);
		}
	}
	
	public void siftDown(int i){
		int maxIndex = i;
		int l = left(i);
		if(l <= size && H[maxIndex] < H[l]){
			maxIndex = l;
		}
		int r = right(i);
		if(r <= size && H[maxIndex] < H[r]){
			maxIndex = r;
		}
		if(maxIndex != i){
			int temp = H[maxIndex];
			H[maxIndex] = H[i];
			H[i] = temp;
			siftDown(maxIndex);
		}
	}
	
	public void insert(int p){
		if (size == maxSize)
			System.out.println("ERROR: Heap full!");
		else{
			size++;
			H[size] = p;
			siftUp(size);
		}
	}
	
	public int extractMax(){
		int result = H[1];
		H[1] = H[size];
		size--;
		siftDown(1);
		return result;
	}
	
	public void remove(int i){
		H[i] = Integer.MAX_VALUE;
		siftUp(i);
		extractMax();
	}
	
	public void changePriority(int i, int p){
		int oldp = H[i];
		H[i] = p;
		if(p > oldp)
			siftUp(i);
		else
			siftDown(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
