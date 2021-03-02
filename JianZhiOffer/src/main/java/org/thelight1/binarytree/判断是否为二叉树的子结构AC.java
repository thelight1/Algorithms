package org.thelight1.binarytree;

/**
 * nowcoder pass
 */
public class 判断是否为二叉树的子结构AC {

    public boolean HasSubtree(TreeNode root,TreeNode tree) {
        boolean ret = false;

        if (root != null && tree != null) {
            if (root.val == tree.val) {
                ret = tree1HasTree2(root, tree);
            }
            if (!ret) {
                ret = HasSubtree(root.left, tree) || HasSubtree(root.right, tree);
            }
        }
        return ret;
    }

    private boolean tree1HasTree2(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return tree1HasTree2(root1.left, root2.left) && tree1HasTree2(root1.right, root2.right);
    }
}
