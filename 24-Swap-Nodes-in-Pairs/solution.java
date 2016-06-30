/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode p1=head;
        ListNode after=p1.next.next;
        while(p1!=null && p1.next!=null){
            pre.next=p1.next;
            p1.next.next=p1;
            pre=p1;
            pre.next=after;
            p1=after;
            if(after!=null && after.next!=null){
                after=p1.next.next;
            }
        }
        
        
        return dummy.next;
    }
}