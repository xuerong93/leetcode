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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            TreeNode node=current.left;
            current.left=current.right;
            current.right=node;
            if(current.left!=null){
                queue.offer(current.left);
            }
            if(current.right!=null){
                queue.offer(current.right);
            }
        }
        return root;
    }
}