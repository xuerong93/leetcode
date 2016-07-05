/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode headbefore=dummy;
        //headbefore.next=head;
        ListNode pointerbefore=head;
        ListNode pointer=pointerbefore.next;
        ListNode pointerafter=pointer.next;
        while(pointer!=null){
            while(head.val<pointer.val && head!=pointer){
                headbefore=head;
                head=head.next;
            }
            if(head==pointer){
                headbefore=dummy;
                head=headbefore.next;
                pointerbefore=pointer;
                pointer=pointerafter;
                if(pointerafter!=null){
                    pointerafter=pointer.next;
                }
            }
            else{
                headbefore.next=pointer;
                pointer.next=head;
                pointer=pointerafter;
                pointerbefore.next=pointerafter;
                if(pointerafter!=null){
                    pointerafter=pointer.next;
                }
                
                headbefore=dummy;
                head=headbefore.next;
            }
        }
        
        return dummy.next;
        
    }
}