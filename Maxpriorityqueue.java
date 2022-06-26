
public class Maxpriorityqueue {
	public Integer[] heap;
	public int n;//size of max heap
	
	public Maxpriorityqueue(int capacity) {
		heap=new Integer[capacity+1];//index 0 is kept as empty
		n=0;
	}
	
	public boolean isEmpty() {
		return n==0;
	}
	public int size() {
		return n;
	}
	
	public void resize(int capacity) {
		Integer[] temp=new Integer[capacity];
		for(int i=0;i<heap.length;i++) {
			temp[i]=heap[i];
		}
		heap=temp;
	}
	
	public void insert(int x) {
		if(n==heap.length -1) {
			resize(2*heap.length);
		}
		n++;
		heap[n]=x;
		swim(n);
	}
	public void swim(int k) {
		while(k>1&&heap[k/2]<heap[k]) {
			int temp=heap[k];
			heap[k]=heap[k/2];
			heap[k/2]=temp;
			k=k/2;//cox we need to continue shifting up till new value inserted is at correct position;	
			
		}
	}
	
	public void printMaxheap() {
		for(int i=1;i<=n;i++) {
			System.out.print(heap[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Maxpriorityqueue mq= new Maxpriorityqueue(5);
	    System.out.println(mq.size());
		//System.out.println(mq.isEmpty());
	    mq.insert(54);
	    mq.insert(3);
	    mq.insert(4);
	    mq.insert(1);
	    mq.insert(56);
	    System.out.println(mq.size());
	    mq.printMaxheap();
	}
} 
