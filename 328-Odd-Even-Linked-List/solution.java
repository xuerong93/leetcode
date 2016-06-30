/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    //Put the odd nodes in a linked list and the even nodes in another. Then link the evenList to the tail of the oddList.
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;
        ListNode odd=head;
        
        ListNode evenHead=new ListNode(0);
        ListNode even=evenHead;
        while(odd!=null && odd.next!=null){
            even.next=odd.next;
            even=even.next;
            if(odd.next.next!=null){
                odd.next=odd.next.next;
            }
            else{
                break;
            }
            odd=odd.next;
            
        }
        even.next=null;
        odd.next=evenHead.next;
        return head;
    }
}