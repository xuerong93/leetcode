/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode l1=head;
        ListNode l2=head.next;
        ListNode prev=dummy;
        prev.next=l1;
        while(l2!=null){
            if(l1.val==l2.val){
            while(l2!=null && l1.val==l2.val){
                l2=l2.next;
            }
            l1=l2;
            prev.next=l1;
            if(l2!=null){
                l2=l2.next;
            }else break;
            }
            else{
                prev=l1;
                l1=l2;
                if(l2!=null){
                    l2=l2.next;
                }else break;
            }
        }
        return dummy.next;
    }
}