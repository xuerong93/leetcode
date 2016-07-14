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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        List<Integer> current=new ArrayList<Integer>();//to store node value in one level
        Queue<TreeNode> oneLevel=new LinkedList<TreeNode>();// to store node in one level
        while(!queue.isEmpty()){
           
            
            TreeNode node=queue.poll();
            current.add(node.val);
            if(node.left!=null) oneLevel.offer(node.left);
            if(node.right!=null) oneLevel.offer(node.right);
            if(queue.isEmpty()){
                res.add(current);
                queue=oneLevel;
                oneLevel=new LinkedList<TreeNode>();
                current=new ArrayList<Integer>();
            }
        }
        return res;
    }
}