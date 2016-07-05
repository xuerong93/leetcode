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
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode l1=head;
        ListNode l2=slow.next;
        slow.next=null;
        ListNode reverse=reverseList(l2);
        merge(l1,reverse);
    }
    public ListNode reverseList(ListNode head){
        ListNode pre=null;
        ListNode cur=head.next;
        
        while(head!=null){
            head.next=pre;
            pre=head;
            head=cur;
            if(cur!=null){
                cur=cur.next;
            }
            
        }
        return pre;
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy=new ListNode(0);
        while(l2!=null){
            dummy.next=l1;
            l1=l1.next;
            dummy=dummy.next;
            dummy.next=l2;
            l2=l2.next;
            dummy=dummy.next;
        }
        dummy.next=l1;
        return dummy.next;
    }
}