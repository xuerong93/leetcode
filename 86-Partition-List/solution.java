/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode after=new ListNode(0);
        ListNode before=new ListNode(0);
        before.next=head;
        ListNode dummy=before;
        ListNode dummy0=after;
        
        while(head!=null){
            if(before.next.val>=x){
                before.next=head.next;
                after.next=head;
                after=after.next;
                head=before.next;
                
            }
            else{
                before=head;
                head=head.next;
            }
        }
        after.next=null;
        before.next=dummy0.next;
        return dummy.next;
    }
}