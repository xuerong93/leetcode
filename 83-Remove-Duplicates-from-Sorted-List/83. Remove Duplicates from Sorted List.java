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
        if(head==null) return null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode p1=head;
        ListNode p2=p1.next;
        while(p2!=null){
            while(p2!=null && p1.val==p2.val){
                p2=p2.next;
                p1.next=p2;
            }
            if(p2!=null){
                p1=p2;
                p2=p2.next;
            }
        }
        return dummy.next;
    }
}