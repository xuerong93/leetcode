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
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return res;
        
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        if(root.left!=null) inorder(root.left);
        res.add(root.val);
        if(root.right!=null) inorder(root.right);
    }
}