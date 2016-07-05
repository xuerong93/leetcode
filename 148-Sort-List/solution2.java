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
        ListNode t=head;
        if(isDuplicate(t)) return t;
        ListNode mid=findMiddle(head);
        ListNode leftDummy = new ListNode(0);
        ListNode rightDummy = new ListNode(0);
        ListNode middleDummy = new ListNode(0);
        ListNode lefthead=leftDummy;
        ListNode righthead=rightDummy;
        ListNode middlehead=middleDummy;
        while(head!=null){
            if(head.val>mid.val){
                righthead.next=head;
                righthead=righthead.next;
            }
            else if(head.val<mid.val){
                lefthead.next=head;
                lefthead=lefthead.next;
            }else{
                middlehead.next=head;
                middlehead=middlehead.next;
            }
            head=head.next;
        }
        lefthead.next=null;
        middlehead.next=null;
        righthead.next=null;
        ListNode left=sortList(leftDummy.next);
        ListNode right=sortList(rightDummy.next);
        return merge(left,middleDummy.next,right);
        
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
    public ListNode merge(ListNode left,ListNode middle,ListNode right){
       ListNode dummy=new ListNode(0);
       ListNode temp=dummy;
       temp.next=left;
       temp=getTail(temp);
       temp.next=middle;
       temp=getTail(temp);
       temp.next=right;
       return dummy.next;
    }
    public ListNode getTail(ListNode head){
        if(head==null || head.next==null) return head;
        while(head.next!=null){
            head=head.next;
        }
        return head;
    }
    public boolean isDuplicate(ListNode head){
        if(head==null || head.next==null) return false;
        while(head.next!=null){
            if(head.val!=head.next.val) return false;
            head=head.next;
        }
        return true;
    }
}