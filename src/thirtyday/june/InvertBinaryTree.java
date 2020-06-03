package thirtyday.june;

import structures.Queue;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-06-02 10:23
 * @modified By：
 *
 * Invert a binary tree.
 *
 * Example:
 *
 * Input:
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 *
 * Output:
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 *
 *  Google: 90% of our engineers use the software you wrote (Homebrew),
 *  but you can’t invert a binary tree on a whiteboard so f*** off.
 *
 * @Description：
 */
public class InvertBinaryTree {



    public static TreeNode invertTree(TreeNode root) {

        if (null == root) return null;

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    public static TreeNode invertTreeWith(TreeNode root) {

        if (null == root) return null;

        Queue<TreeNode> q = new Queue<>();
        q.enqueue(root);
        while (!q.isEmpty() ) {
            TreeNode node = q.dequeue();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (null != node.left) {
                q.enqueue(node.left);
            }
            if (null != node.right) {
                q.enqueue(node.right);
            }
        }

        return root;
    }


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
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 4;
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(9);

        invertTree(treeNode);
        invertTreeWith(treeNode);

        System.out.println("over");
    }


}
