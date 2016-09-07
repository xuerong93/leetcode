/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode start =new ListNode(0);
        start.next = head;
        ListNode pre = start;
        ListNode newEnd = pre;
        ListNode newStart = pre;
        while(m>1){
            newEnd = newEnd.next;
            m--;
        }
        pre = newEnd;
        newEnd = newEnd.next;
        while(n>0){
            newStart = newStart.next;
            n--;
        }
        ListNode newNext = newStart.next;
        pre.next = newStart;
        newStart.next = null;
        reverse(newEnd);
        newEnd.next = newNext;
        return start.next;
    }
    public void reverse(ListNode newEnd){
        if(newEnd==null || newEnd.next ==null) return;
        ListNode pre = newEnd;
        ListNode cur = pre.next;
        ListNode next = cur.next;
        while(cur!=null){
            cur.next = pre;
            pre = cur;
            cur = next;
            if(next!=null){
                next = next.next;
            }
        }
    }
}