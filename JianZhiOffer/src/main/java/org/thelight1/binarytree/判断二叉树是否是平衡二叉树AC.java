package org.thelight1.binarytree;

/**
 * nowcoder pass
 */
public class 判断二叉树是否是平衡二叉树AC {

    public boolean IsBalanced_Solution(TreeNode root) {
       int[] depth = new int[1];
       return isBalanced(root, depth);
    }

    //需要是否平衡以及高度
    public boolean isBalanced(TreeNode root, int[] depth) {
        if (root == null) {
            depth[0] = 0;
            return true;
        }

        int[] leftDepth = new int[1];
        boolean leftIsBalanced = isBalanced(root.left, leftDepth);

        int[] rightDepth = new int[1];
        boolean rightIsBalanced = isBalanced(root.right, rightDepth);

        depth[0] = Math.max(leftDepth[0], rightDepth[0]) + 1;
        if (leftIsBalanced && rightIsBalanced && Math.abs(leftDepth[0] - rightDepth[0]) <= 1) {
            return true;
        }
        return false;
    }
}
