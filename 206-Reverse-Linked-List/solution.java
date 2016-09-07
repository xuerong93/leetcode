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
        if(head == null || head.next==null) return head;
        ListNode pre = head;
        ListNode cur = pre.next;
        ListNode next = cur.next;
        
        pre.next = null;
        
        while(cur!=null){
            cur.next = pre;
            pre = cur;
            cur = next;
            if(next!=null){
                next = next.next;
            }
        }
        return pre;
    }
}