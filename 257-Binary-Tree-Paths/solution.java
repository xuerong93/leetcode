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
    List<String> res=new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return res;
        findPath(root,String.valueOf(root.val));
        return res;
        
    }
    public void findPath(TreeNode node, String str){
        if(node.left==null && node.right==null) res.add(str);
        if(node.left!=null) findPath(node.left,str+"->"+String.valueOf(node.left.val));
        if(node.right!=null) findPath(node.right,str+"->"+String.valueOf(node.right.val));
    }
}