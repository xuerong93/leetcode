/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        Queue<ListNode> heap = new PriorityQueue<ListNode>(lists.length,ListNodeComparator);
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){// add all list's head into the heap
                heap.offer(lists[i]);
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(!heap.isEmpty()){
            ListNode head=heap.poll();
            tail.next=head;
            tail=head;
            if(head.next!=null){// add the next node of the list which provide one node to the merge list
                heap.offer(head.next);
            }
        }
        return dummy.next;
    }
    private Comparator<ListNode> ListNodeComparator = new Comparator<ListNode>(){
        public int compare(ListNode left,ListNode right){
            if(left==null){
                return -1;
            }
            if(right == null){
                return 1;
            }
            return left.val-right.val;
        }
    };
}