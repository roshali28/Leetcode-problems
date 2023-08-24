import java.util.*;
public class merge_using_SLL {
	public class ListNode{
	      int val;
	        ListNode next;
	        ListNode() {}
	        ListNode(int val) { 
	    	   this.val = val; 
	    	   }
	        ListNode(int val, ListNode next) {
	    	   this.val = val; 
	    	   this.next = next;
	    	   }
	}
	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode l1 = new ListNode();
	        
	        while(list1 != null && list2 != null) {
	        	if(list1.val < list2.val) {
	        		l1.next = list1;
	        		list1=list1.next;
	        	}
	        	else {
	        		l1.next=list2;
	        		list2.next = list2;
	        	}
	        	l1=l1.next;
	        }
			if(list1 != null) {
				l1.next = list1;
			}
			else {
				l1.next = list2;
			}
	        return l1;   
	    }
	public static void main(String[] args) {
		
			}
}
