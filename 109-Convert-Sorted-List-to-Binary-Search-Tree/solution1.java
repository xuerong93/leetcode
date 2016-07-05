/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
     if(head==null) return null;
     if(head.next==null) return new TreeNode(head.val);
     ListNode mid=new ListNode(0);
      TreeNode root=new TreeNode(head.val);
     if(head.next.next==null){
         
         mid.next=head;
        
         root.left=null;
         root.right=new TreeNode(head.next.val);
     }else{
        mid=findMid(head);
        ListNode right=mid.next.next;
     
        root=new TreeNode(mid.next.val);
        mid.next=null;
        ListNode left=head;
        root.right=sortedListToBST(right);
        root.left=sortedListToBST(left);
    } 
     
     return root;
     
    }
    public ListNode findMid(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head.next.next;
        if(fast!=null && fast.next!=null){
            while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            }
        }
        return slow;
    }
}