/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null)  return head;
        ListNode p1=head;
        ListNode p2=p1.next;
        ListNode nextNode=p2.next;
        p1.next=null;
        while(p2!=null){
            p2.next=p1;
            p1=p2;
            p2=nextNode;
            if(p2!=null) nextNode=p2.next;
        }
        return p1;
    }
}