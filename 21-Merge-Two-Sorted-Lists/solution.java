/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode fixed = new ListNode(0);
        ListNode prev = fixed;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                prev.next=l1;
                prev=l1;
                l1=l1.next;
            }
            else{
                prev.next=l2;
                prev=l2;
                l2=l2.next;
            }
        }
        if(l1==null && l2!=null){
           prev.next=l2; 
        }
        if(l1!=null && l2==null){
            prev.next=l1;
        }
        return fixed.next;
    }
}