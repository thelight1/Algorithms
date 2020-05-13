package org.thelight1.binarytree;

import java.util.List;

public class TreeToSequence {

    //先序遍历，根左右
    public void preOrder(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            preOrder(root.left, list);
            preOrder(root.right, list);
        }
    }

    //中序遍历，左根右
    public void inOrder(TreeNode root, List<Integer> list) {
        if (root != null) {
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);
        }
    }

    //后序遍历，左右根
    public void afterOrder(TreeNode root, List<Integer> list) {
       if (root != null)  {
           afterOrder(root.left, list);
           afterOrder(root.right, list);
           list.add(root.val);
       }
    }
}
