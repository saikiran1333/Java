package org.apache.commons.lang3;

public class FibonacciNumber {
	
	/*public int fib(int n) {//bottom up approach using dynamic programming
		int[] table=new int[n+1];
		table[0]=0;
		table[1]=1;
		for(int i=2;i<=n;i++) {
			table[i]=table[i-1]+table[i-2];	
		}
		return table[n];
	}*/
	
	public int fibi(int[] memo,int n) {
		if(memo[n]==0) {
			if(n<2) {
				memo[n]=n;//0 and 1
			}else {
				int left=fibi(memo,n-1);
				int right=fibi(memo,n-2);
				memo[n]=left+right;
			}
		}
		return memo[n];
	}
	
	public static void main(String args[]) {
		FibonacciNumber fibonaccinum=new FibonacciNumber();
		//System.out.println("the 8th fibonacci number is: "+fibonaccinum.fib(8));
		System.out.println("the 8th fibonacci number is: "+fibonaccinum.fibi(new int [8+1], 8));
	}
}
