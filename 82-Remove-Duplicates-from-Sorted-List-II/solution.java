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
        while(l2!=null){
            if(l1.val==l2.val){
            while(l1.val==l2.val){
                l2=l2.next;
            }
            l1.val=l2.val;
            
            l2=l2.next;
            l1.next=l2;
            }
            if(l2!=null){
                l1=l2;
                l2=l2.next;
            }
        }
        return dummy.next;
    }
}