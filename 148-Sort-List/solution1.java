/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
         ListNode mid=findMiddle(head);
         
         ListNode right=sortList(mid.next);
         mid.next=null;
         ListNode left=sortList(head);
         return merge(left,right);
    }
    public ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(left!=null && right!=null){
            if(left.val>right.val ){
                temp.next=right;
                right=right.next;
            }
            else{
                temp.next=left;
                left=left.next;
            }
            temp=temp.next;
        }
        if(left==null){
            temp.next=right;
        }
        if(right==null){
            temp.next=left;
        }
        return dummy.next;
    }
}