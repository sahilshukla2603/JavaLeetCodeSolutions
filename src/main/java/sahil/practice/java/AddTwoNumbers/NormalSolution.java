package sahil.practice.java.AddTwoNumbers;

public class NormalSolution {

}

/**
 * Definition for singly-linked list.*/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode finalList = new ListNode();
        ListNode current = finalList;
        while(l1!=null || l2!=null || carry==1){
            ListNode next=new ListNode();
            int sum =0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){ 
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            sum=sum%10;
            current.val=sum;
                    
            if(!(l1==null && l2==null) || carry==1){
                current.next=next;
                current=next;
            }
        }
        return finalList;
    }
}
