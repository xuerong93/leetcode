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
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root==null) return false;
        if(root.left==null && root.right==null && root.val==sum) return true;
        TreeNode left=root.left;
        TreeNode right=root.right;
        return hasPathSum(left,sum-root.val) || hasPathSum(right,sum-root.val);
    }
}