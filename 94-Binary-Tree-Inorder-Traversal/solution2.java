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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        if(root==null) return res;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            while(stack.peek()!=null){
                root=root.left;
                stack.push(root);
            }
            stack.pop();
            if(!stack.isEmpty()){
                root=stack.pop();
                res.add(root.val);
                root=root.right;
                stack.push(root);
            }
        }
        return res;
    }
}