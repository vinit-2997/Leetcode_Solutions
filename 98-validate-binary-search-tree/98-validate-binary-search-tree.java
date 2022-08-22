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
class Solution {
    public boolean isValidBST(TreeNode root) {
        
        return helper(root, null, null);
        
        
    }
    
    boolean helper(TreeNode root, Integer left, Integer right)
    {
        if(root == null)
            return true;
        
        // if(root.left == null && root.right == null)
        //     return true;
        
        if((left!=null && root.val<=left) || (right!=null && root.val>=right))
            return false;
        
        // boolean am = true;
        // boolean left;
        // boolean right;
        
//         if(root.left!=null)
//         {
//             left = helper(root.left, null, root.value);
//             am = left == false? false : true;
//         }
        
//         if(root.right!=null)
//         {
//             right = helper(root.right, root.value, null);
//         }
        
        // if(left!=null && right!=null )
        return helper(root.left, left, root.val) && helper(root.right, root.val, right);
    }
}