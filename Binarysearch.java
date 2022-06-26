package SLL;

public class Binarysearch {
	public int Binarysearch(int[] nums,int key) {
		int low=0;
		int high=nums.length-1;
		while(low<=high) {
			int mid=(high+low)/2;
			if(nums[mid]==key) {
				return mid;
			}
			if(key<nums[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Binarysearch bs=new Binarysearch();
		int[] num= {21,43,23,53,32,33,46};
		System.out.println(bs.Binarysearch(num,53));
	}
}
