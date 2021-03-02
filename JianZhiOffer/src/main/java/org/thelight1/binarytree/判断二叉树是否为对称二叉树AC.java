package org.thelight1.binarytree;

/**
 * nowcoder pass
 */
public class 判断二叉树是否为对称二叉树AC {

    public boolean isSymmetrical(TreeNode root)
    {
        if (root == null) {
            return true;
        }
        return isSymmetricalCore(root.left, root.right);
    }

    public boolean isSymmetricalCore(TreeNode leftTree, TreeNode rightTree) {
        if (leftTree == null && rightTree == null) {
            return true;
        }
        if (leftTree != null && rightTree != null && leftTree.val == rightTree.val) {
            return isSymmetricalCore(leftTree.left, rightTree.right) && isSymmetricalCore(leftTree.right, rightTree.left);
        }
        return false;
    }
}
