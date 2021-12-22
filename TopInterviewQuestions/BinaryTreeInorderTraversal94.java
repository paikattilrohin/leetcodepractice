/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BinaryTreeInorderTraversal94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        helper(list, root);
        return list;
    }
    
    public void helper (List<Integer> ans , TreeNode root){
        if(root == null){
            return;
        }
        
        if(root.left != null){
            helper(ans, root.left);
        }
        ans.add(root.val);
        if(root.right != null){
            helper(ans, root.right);
        }
    }
}