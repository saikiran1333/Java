//Singly Linked List
package SLL;

public class SLL{
	 ListNode head;
	
	 private static class ListNode{
		 private int data;
		 private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data + "-->");
			current=current.next;
	}
		System.out.print("null");
}
	public int length() {
		if(head==null) {
			return 0;
		}
		int count=0;
		ListNode current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	/*public void insertFirst(int value) {
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	public void insertpos(int position,int value) {
		ListNode node=new ListNode(value);
		if(position==1) {
			node.next=head;
			head=node;
		}
		else {
			ListNode previous=head;
			int count=1;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=node;
			node.next=current;
		}
	}*/
	/*public void insertLast(int value) {
		ListNode newNode=new ListNode(value);
		if(head==null) {
			head=newNode;
			return;
		}
		ListNode current=head;
		while(null!=current.next) {
			current=current.next;
		}
		current.next=newNode;
	}*/
	/*public ListNode deleteFirst() {
		if(head==null) {
			return null;
		}
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	}*/
	/*public ListNode deleteLast() {
		
		if(head==null || head.next==null) {
			return head;
		}
		ListNode current=head;
		ListNode previous = null;
		while(current.next!=null) {
			previous=current;
			current=current.next;
		}
		previous.next=null;//break the chain 
		return current;
	}*/
	/*public void deleteposi(int position) {
		if(position==1) {
			head=head.next;
		}else {
			ListNode previous=head;
			int count=1;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=current.next;
		}
	}
	*/
	/*public boolean find(ListNode head,int searchKey) {
		if(head==null) {
			return false;
		}
		ListNode current=head;
		while(current!=null) {
			if(current.data==searchKey) {
				return true;
			}
			current=current.next;
		}
		return false;
	}*/
	/*public ListNode reverse(ListNode head) {
		if(head==null) {
			return head;
		}
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}*/
	/*public ListNode getMiddleNode() {
		if(head==null) {
			return null;
		}
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
	}*/
	public ListNode getNthNodeFrmEnd(int n) {
		if(head==null) {
			return null;
		}
		if(n<=0) {
			throw new IllegalArgumentException("Invalid value: n-"+n);
		}
		ListNode mainPtr=head;
		ListNode refPtr=head;
		int count=0;
		while(count<n) {
			if(refPtr==null) {
				throw new IllegalArgumentException(n+"is greater than the no of noded in list");
			}
			refPtr=refPtr.next;
			count++;
		}
		while(refPtr!=null) {
			refPtr=mainPtr.next;
			mainPtr=mainPtr.next;			
		}
		return mainPtr;
	}
	
	public void removedup() {
		if(head==null) {
			return;
		}
		ListNode current=head;
		while(current!=null && current.next!=null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}
			else {
				current=current.next;
			}
		}
	}
	public static void main(String[] args) {
		SLL sll=new SLL();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(3);
		ListNode third=new ListNode(4);
	    ListNode fourth=new ListNode(11);
		//connecting
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		//sll.insertFirst(32);
		//sll.insertFirst(38);
		//sll.insertFirst(12);
		//sll.insertLast(56);
		//sll.insertLast(54);
		//sll.insertpos(2,89);
		
		sll.display();
		System.out.println();
		//System.out.println(sll.deleteFirst().data);
	    //System.out.println(sll.deleteLast().data);
		//System.out.println(sll.deleteLast().data);
		//sll.deleteposi(1);
		
		/*if(sll.find(head,4)) {
			System.out.println("search key found");
		}
		else {
			System.out.println("searh key not found");
		}*/
		
		//sll.display(head);
		//ListNode reverseList=sll.reverse(head);
		//display(reverseList);
		
		//ListNode middleNode=sll.getMiddleNode();
		//System.out.println(middleNode.data);
		
		ListNode nthNode=sll.getNthNodeFrmEnd(2);
		System.out.println(nthNode);
		
		sll.display();
		System.out.println();
		int b=sll.length();
		System.out.println("the length is "+b);
	}
	}