package thirtyday.july;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Given a binary tree, return the bottom-up
 * level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *    3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 *
 *
 */
public class BinaryTreeLevelOrderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        List<Integer> sublist = new ArrayList<>();
        while (queue.size() > 0) {
            TreeNode node = queue.remove();
            if (node != null) {
                sublist.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            } else {
                result.add(0,sublist);

                if (queue.size() > 0) {
                    sublist = new ArrayList<>();
                    queue.add(null);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        levelOrderBottom(treeNode);
    }
}
