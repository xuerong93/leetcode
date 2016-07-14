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
        List<Integer> res = new ArrayList<Integer>();//store inorder value
        if(root==null) return res;
        Stack<TreeNode> stack=new Stack<TreeNode>();//store treenode in inoder sequence
        while(root!=null || !stack.isEmpty()){
            if(root!=null){                //if the node is not null,got to the left
                stack.push(root);
                root=root.left;
            }
            else{
                root=stack.pop();           //if the node is null,return to the previous node which is stored in stack
                res.add(root.val);
                root=root.right;        //go to the right child;
            }
        }
        return res;
    }
}