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
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        int a= n-m;
        ListNode pre=dummy;
        
        while(m>1){
            pre=pre.next;
            m--;
        }
        ListNode h1=pre.next;
        ListNode last=h1;
        ListNode h2=h1.next;
        ListNode nextNode=h2.next;
        while(a>0){
            h2.next=h1;
            h1=h2;
            h2=nextNode;
            a--;
            if(nextNode!=null){
                nextNode=nextNode.next;
            }
        }
        last.next=h2;
        pre.next=h1;
        return dummy.next;
    }
}