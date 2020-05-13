package org.thelight1.binarytree;

import java.util.ArrayList;

/**
 * nowcoder pass
 */
public class 二叉树中和为某一值的路径 {

    private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return ret;
        }

        findPathCore(root, target);
        return ret;
    }

    private void findPathCore(TreeNode root, int target) {
        list.add(root.val);

        if (target - root.val == 0 && root.left == null && root.right == null) {
            ret.add(new ArrayList<Integer>(list));
        }

        if (root.left != null) {
            findPathCore(root.left, target - root.val);
        }
        if (root.right != null) {
            findPathCore(root.right, target - root.val);
        }

        list.remove(list.size() - 1);
    }
}
