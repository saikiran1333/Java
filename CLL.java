import java.util.*;

public class CLL {
	private ListNode last;
	private int length;
	
	private class ListNode{
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	public CLL() {
		last=null;
		length=0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length==0;
	}
	public void createCLL() {
		ListNode first=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		ListNode fifth=new ListNode(14);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=first;
		last=fifth;
		
	}
	public void display() {
		if(last==null) {
			return;
		}
		ListNode first=last.next;
		while(first!=last) {
			System.out.print(first.data+"-->");
			first=first.next;
		}
		System.out.print(first.data);
	}
	public void insertFirst(int data) {
		ListNode temp=new ListNode(data);
		if(last==null) {
			last=temp;
		}
		else {
			temp.next=last.next;
		}
		last.next=temp;
		length++;
	}
	public void insertLast(int data) {
		ListNode temp=new ListNode(data);
		if(last==null) {
		last=temp;
		last.next=last;
		} 
		else {
			temp.next=last.next;
			last.next=temp;
			last=temp;
		}
		length++;
	}
	public ListNode removeFirst() {
		if(isEmpty()) {
			throw new NOSuchElementException();//("circular singly linked list is empty");
		}
		ListNode temp=last.next;
		if(last.next==last) {
			last=null;
		}else {
			last.next=temp.next;
		}
		temp.next=null;
		length--;
		return temp;
	}
	public static void main(String[] args) {
		CLL cll=new CLL();
		cll.createCLL();
		cll.display();
		cll.insertFirst(33);
		System.out.println();
		cll.display();
		cll.insertLast(88);
		System.out.println();
		cll.display();
		cll.removeFirst();
		System.out.println();
		cll.display();
	}
}
