package org.thelight1.binarytree;

/**
 * nowcoder pass
 */
public class 求二叉树的镜像AC {

    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        Mirror(root.left);
        Mirror(root.right);
    }
}
