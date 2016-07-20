/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        //validate the input
        if(head==null || head.next==null || k<0) return head;
        //special case
        if(k==0 || k==1) return head;
        //initialize a dummy node for return
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;//current group's dummy node
        ListNode cur=head;//current group's head node;
        //stop when cur node is null
        while(cur!=null){
            //the next group's starting point p
            ListNode p=pre.next;
            int group=k;
            while(p!=null && group>0){
                p=p.next;
                group--;
            }
            if(group>0){//p is null, the remainging part length is less than k,no need to continue
                break;
            }
            while(cur.next!=p){
                ListNode nt=cur.next.next;
                cur.next.next=pre.next;
                pre.next=cur.next;
                cur.next=nt;
            }
            pre=cur;
            cur=cur.next;
        }
        return dummy.next;
    }
}