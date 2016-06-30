/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head==null) return null;
        ListNode slow = head;
        ListNode fast=head;
        
        while(true){
            if(fast!=null &&fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }else{
                return null;
            }
            if(fast==slow){
                slow=head;
                break;
            }
        }
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}