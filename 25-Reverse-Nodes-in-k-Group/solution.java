/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        ListNode newEnd = pre.next;
        ListNode newStart = newEnd;
        while(newStart!=null){
            for(int i=0; i<k-1; i++){
                if(newStart == null) break;
                newStart = newStart.next;
            }
            if(newStart != null){
                ListNode newNext =newStart.next;
                pre.next = newStart;
                newStart.next = null;
                reverseList(newEnd);
                newEnd.next = newNext;
                pre  = newEnd;
                newEnd = pre.next;
                newStart = newEnd;
            }
            
        }
        
        
        return start.next;
    }
    public void reverseList(ListNode head){
        if(head == null || head.next == null) return;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode next = cur.next;
        while(cur!=null){
            cur.next = pre;
            pre = cur; cur = next;
            if(next!=null){
                next = next.next;
            }
        }
    }
}