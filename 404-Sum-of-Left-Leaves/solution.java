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
    public int sumOfLeftLeaves(TreeNode root) {
        //iterator with stack
        if(root == null) return 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int sum = 0;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            if(cur.left!=null){
                if(cur.left.left==null && cur.left.right==null){
                    sum+=cur.left.val;
                }
                stack.push(cur.left);
            }
            if(cur.right!=null){
                stack.push(cur.right);
            }
        }
        return sum;
    }
}