package thirtyday.july;

import java.util.*;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-07-03 10:10
 * @modified By：
 * @Description：
 *
 *
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 *
 * return its bottom-up level order traversal as:
 *
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 */
public class LevelOrderBotton {

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
            return result;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            ArrayList<Integer> level = new ArrayList<Integer>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = q.poll();
                level.add(temp.val);
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            }
            result.add(level);
        }

        Collections.reverse(result);


        return result;
    }


    public static void main(String[] args) {
        TreeNode treeNodeLeft = new TreeNode(9);
        TreeNode treeNodeRight = new TreeNode(20);

        TreeNode treeNode = new TreeNode(3, treeNodeLeft, treeNodeRight);

        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        levelOrderBottom(treeNode);

    }




      // Definition for a binary tree node.
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

}
