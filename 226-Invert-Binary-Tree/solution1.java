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
        //recursive answer
        if(root!=null){
            TreeNode left=invertTree(root.left);//swap children of left node
            TreeNode right=invertTree(root.right);//swap children of right node
            root.left=right;
            root.right=left;
        }
        
        return root;
    }
}