package org.thelight1.binarytree;

/**
 * nowcoder pass
 */
public class 二叉树的深度 {

    public int TreeDepth(TreeNode root) {
       if (root == null) {
          return 0;
       }
       int leftDepth = TreeDepth(root.left);
       int rightDepth = TreeDepth(root.right);

       return Math.max(leftDepth, rightDepth) + 1;
    }
}
