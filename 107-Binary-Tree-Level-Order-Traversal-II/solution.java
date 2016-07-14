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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root==null) return res;
        List<Integer> cur=new ArrayList<Integer>();//store integer value of one level
        Queue<TreeNode> queue=new LinkedList<TreeNode>();//store treenode of current level treeNode
        Queue<TreeNode> oneLevel=new LinkedList<TreeNode>();//store treenode on the next level
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            cur.add(current.val);
            if(current.left!=null) oneLevel.offer(current.left);// store the next level's treenode
            if(current.right!=null) oneLevel.offer(current.right);
            if(queue.isEmpty()){
                res.add(cur);
                queue=oneLevel;
                oneLevel=new LinkedList<TreeNode>();
                cur=new ArrayList<Integer>();
            }
        }
        Collections.reverse(res);
        return res;
    }
}