/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        while(head.next!=null){
            head.next=reverseList(head.next);
            head=head.next;
        }
    }
    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=head.next;
        ListNode after=cur.next;
        head.next=null;
        while(cur!=null){
            cur.next=head;
            head=cur;
            cur=after;
            if(after!=null){
                after=after.next;
            }
        }
        dummy.next=head;
        return dummy.next;
    }
}