package org.thelight1.binarytree;

/**
 * nowcoder pass
 */
public class 求二叉树的深度AC {

    public int TreeDepth(TreeNode root) {
       if (root == null) {
          return 0;
       }
       int leftDepth = TreeDepth(root.left);
       int rightDepth = TreeDepth(root.right);

       return Math.max(leftDepth, rightDepth) + 1;
    }
}
