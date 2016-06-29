/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        
        ListNode middle = findMiddle(head);
        ListNode temp=middle.next;
        middle.next=null;
        
        ListNode p1=head;
        ListNode p2=reverse(temp);
        
        
        while (p2 != null) {
            if(p1.val != p2.val) return false;
            else{
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        
        return true;
    }
    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        
        while(head!=null){
            ListNode temp = head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
        
    }

}