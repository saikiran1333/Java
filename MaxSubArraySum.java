package org.apache.commons.lang3;

public class MaxSubArraySum { //kadane's algorithm for maximum subarray
	
	public static int maxSubArraySum(int[] arr) {
		int currentMax=arr[0];
		int maxSoFar=arr[0];
		for(int i=1;i<arr.length;i++) {
			currentMax=currentMax+arr[i];//where elements became part of current sub array
			if(currentMax<arr[i]) {
				currentMax=arr[i];//element decides to start its own subarray
			}
			if(maxSoFar<currentMax) {
				maxSoFar=currentMax;
			}
		}
		return maxSoFar;
	}
	
	public static void main(String[] args) {
		int[] arr= {4,3,-2,6,-12,7,-1,6};
		System.out.println(maxSubArraySum(arr));
	}
}
