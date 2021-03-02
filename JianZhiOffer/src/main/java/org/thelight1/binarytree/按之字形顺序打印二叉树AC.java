package org.thelight1.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * nowcoder pass
 */
public class 按之字形顺序打印二叉树AC {

    public ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        queue.offer(null);
        ret.add(new ArrayList<Integer>());
        int level = 1;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                if (level % 2 == 0) {
                    ArrayList<Integer> list = ret.get(ret.size() - 1);
                    Collections.reverse(list);
                }
                if (queue.isEmpty()) {
                    break;
                }
                queue.offer(null);
                ret.add(new ArrayList<Integer>());
                level++;
            } else {
                ret.get(ret.size() - 1).add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return ret;
    }
}
