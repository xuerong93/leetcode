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
    public List<String> path = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root != null) findPath(root, String.valueOf(root.val));
        return path;
    }
    
    public void findPath(TreeNode root, String value){
        if(root.left==null && root.right == null) path.add(value);
        if(root.left!=null)  findPath(root.left,value +"->"+root.left.val);
        if(root.right!=null)  findPath(root.right,value+"->"+root.right.val);
    }
}