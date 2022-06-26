import java.util.*;
import org.apache.commons.lang3.ArrayUtils;
public class O1Darray {
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	/*public static int[] removeEven(int[] arr) {//to remove even numbers
		int oddCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddCount++;
			}
		}
		int[] result=new int[oddCount];
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				result[idx]=arr[i];
				idx++;
			}
		}
		return result;
	}*/
	
	/*public static void reverse(int[] numbers, int start,int end) {
		while(start<end) {
			int temp=numbers[start];
			numbers[start]=numbers[end];
			numbers[end]=temp;
			start++;
			end--;
		}
	}*/
	
	public static int findMinimum(int[] arr) {
		if(arr==null||arr.length==0) {
			throw new IllegalArgumentException("Invalid input");
		}
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		return min;
	}
	
	public static void moveZeroes(int[] arr,int n) {
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}
	
	/*public static int[] resize(int[] arr, int capacity) {
		int[] temp=new int[capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		return temp;
	}*/
	
	public static int findMissingNumber(int[] arr) {
		int n=arr.length;
		int sum=n*(n+1)/2;
		for(int num:arr) {
			sum=sum-num;
		}
		return sum;
	}
	
	public static void arrayDemo() {
		int[] myArray=new int[5];
		myArray[0]=11;
		myArray[1]=10;
		myArray[2]=0;
		myArray[3]=13;
		myArray[4]=14;
		//printArray(myArray);
		int[] newarr= {1,2,4,5,6};
		System.out.println(findMissingNumber(newarr));
		//int[] result=removeEven(myArray);
		//printArray(result);
		//System.out.print(findMinimum(myArray));
		//reverse(myArray,0,myArray.length-1);
		//printArray(myArray);
		
		//moveZeroes(myArray,myArray.length);
		//printArray(myArray);
		
		//System.out.println("original array"+myArray.length);
		//resize(myArray,23);
		//System.out.println("resized array"+myArray.length);
		
		//System.out.println(myArray.length);
		//System.out.println(myArray[myArray.length-1]);
	}
	
	/*public static boolean Palindrome(String word) {
		char[] charArray=word.toCharArray();
		int start=0;
		int end=word.length()-1;
		while(start<end) {
			if(charArray[start]!=charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}*/
	
	public static void main(String[] args) {
		
		//arrayDemo();
		//StringJoiner StringUtil=new StringJoiner();
		//if(StringUtil.Palindrome("madam")) {
		//	System.out.println("string is palindrome");
		//} else {
		//	System.out.println("not a palindrome");
		//}
		
		
		
	}
}
