package SLL;

public class Linearsearch {
	public int search(int[] arr,int n,int x) {
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {5,1,3,2,6,7};
		Linearsearch ls=new Linearsearch();
		System.out.println(ls.search(arr, arr.length, 6));
	}
}
