/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB== null) return null;
        ListNode pA=headA;
        ListNode pB=headB;
        while(true){
            while(pA!=null && pB!=null){
                if(pA==pB){
                    return pA;
                }
                pA=pA.next;
                pB=pB.next;
                
            }
            if(pA==null && pB!=null){
                pA=headB;
            }
            if(pB==null && pA!=null){
                pB=headA;
            }
            if(pA==null && pB==null){
                return null;
            }
        }
    }
}