package org.thelight1.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * nowcoder pass
 */
public class 从上往下打印二叉树AC {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ret.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return ret;
    }
}
