package org.apache.commons.lang3;

public class HashTable {
	
	
	private static int capacity;
	private HashNode[] buckets;
 	private int numOfBuckets;
	private int size;
	
	public HashTable() {
		this(capacity= 10);//default capacity
	}
	public HashTable(int capacity) {
		this.numOfBuckets=capacity;
		buckets=new HashNode[numOfBuckets];
		this.size=0;
	}
	
	private class HashNode{
		private Integer key;
		private String value;
		private HashNode next;
		
		public HashNode(Integer key,String value) {
			this.key=key;
			this.value=value;
		}
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void put(Integer key,String value) {
		if(key==null||value==null) {
			throw new IllegalArgumentException("key or value is null");
		}
		int bucketIndex=getBucketIndex(key);
		HashNode head=buckets[bucketIndex];
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		size++;
		head=buckets[bucketIndex];
		HashNode node=new HashNode(key,value);
		node.next=head;
		buckets[bucketIndex]=node;
	}
	private int getBucketIndex(Integer key) {
		return key % numOfBuckets;
	}
	public String get(Integer key) {
		return null;
	}
	public String remove(Integer key) {
		return null;
	}
	public static void main(String args[]) {
		int capacity;
		HashTable table=new HashTable(capacity=10);
		table.put(105, "Tom");
		table.put(21, "sai");
		table.put(21, "kiran");
		System.out.println(table.size());
	}
}
