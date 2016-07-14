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
        if(getHeight(root)==-1) return false;
        else return true;
    }
    public static int getHeight(TreeNode root){
        if(root==null) return 0;
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        if(left==-1 || right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return 1+Math.max(left,right);
    }
}