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
    public boolean isSymmetric(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return true;
        if(root.left==null || root.right==null || root.left.val!=root.right.val) return false;
        return isSymmetric(root.left,root.right);
        
    }
    public boolean isSymmetric(TreeNode l1, TreeNode l2){
        if((l1==null && l2==null)) return true;
        if(l1==null || l2== null) return false;
        if(l1.val!=l2.val) return false;
        return (isSymmetric(l1.left,l2.right) && isSymmetric(l1.right,l2.left));
        
    }
}