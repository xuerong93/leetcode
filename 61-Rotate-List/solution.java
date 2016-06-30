/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode slow=head;
        ListNode fast=head;
        int cnt=0;
        while(fast!=null){
            fast=fast.next;
            cnt++;
        }
        fast=head;
        int a=k%cnt;
        if(a==0) return dummy.next;
        while(a>0){
            fast=fast.next;
            a--;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        dummy.next=slow.next;
        slow.next=null;
        fast.next=head;
        return dummy.next;
    }
}