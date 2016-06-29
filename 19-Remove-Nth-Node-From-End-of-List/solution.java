/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode(0);
        ListNode p1=prev;
        ListNode p2=prev;
        prev.next=head;
        while(n>=0){
            p2=p2.next;
            n--;
        }
        while(p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        p1.next=p1.next.next;
        return prev.next;
    }
}