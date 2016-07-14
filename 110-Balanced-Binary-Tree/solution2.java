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
    public boolean isBalanced(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return true;
        return isBalanced(root.left,root.right);
    }
    public boolean isBalanced(TreeNode n1,TreeNode n2){
        if(Math.abs(getHeight(n1)-getHeight(n2))>1) return false;
        if(n1==null || n2==null) return true;
        return isBalanced(n1.left,n1.right)&& isBalanced(n2.left,n2.right);
    }
    public int getHeight(TreeNode node){
        if(node==null) return 0;
        int left=getHeight(node.left);
        int right=getHeight(node.right);
        return 1+Math.max(left,right);
    }
}