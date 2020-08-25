package leetcode.aug;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ：zhangxuan
 * @date ：Created in 2020-08-15 23:17
 * @modified By：
 * @Description：
 *
 * You are given a binary tree in which each node contains an integer value.
 *
 * Find the number of paths that sum to a given value.
 *
 * The path does not need to start or end at the root or a leaf,
 * but it must go downwards (traveling only from parent nodes to child nodes).
 *
 * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
 *
 *
 * Example:
 *
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 *
 *       10
 *      /  \
 *     5   -3
 *    / \    \
 *   3   2   11
 *  / \   \
 * 3  -2   1
 *
 * Return 3. The paths that sum to 8 are:
 *
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3. -3 -> 11
 *
 */
public class PathSumIII {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return findPath(root, sum) + pathSum(root.right, sum) + pathSum(root.left, sum);
    }

    public int findPath(TreeNode root, int sum) {
        int result =0;

        if (null == root) {
            return result;
        }
        if (sum == root.val) {
            result++;
        }
        result += findPath(root.left, sum - root.val);
        result += findPath(root.right, sum - root.val);

        return result;
    }

    /**
     *
     * 1.将它包括在达到总和的路径中。
     *
     * 2.不要将其包含在达到总和的路径中。
     *
     * 对于树中的每个子节点，我们有2个选择：
     *
     * 1.取走父节点留给你的东西。
     *
     * 2.从自己开始形成路径。
     */
    int target;
    Set<TreeNode> visited;
    public int pathSum2(TreeNode root, int sum) {
        target = sum;
        //to store the nodes that have already tried to start path by themselves.
        visited = new HashSet<TreeNode>();
        return pathSumHelper(root, sum, false);
    }

    public int pathSumHelper(TreeNode root, int sum, boolean hasParent) {
        if(root == null) return 0;
        //the hasParent flag is used to handle the case when parent path sum is 0.
        //in this case we still want to explore the current node.
        if (sum == target && visited.contains(root) && !hasParent) {
            return 0;
        }
        if (sum == target && !hasParent) {
            visited.add(root);
        }
        int count = (root.val == sum) ? 1 : 0;
        count += pathSumHelper(root.left, sum - root.val, true);
        count += pathSumHelper(root.right, sum - root.val, true);
        count += pathSumHelper(root.left, target , false);
        count += pathSumHelper(root.right, target, false);
        return count;
    }

    /**
     * 此解法同样来自讨论区，使用HashMap来操作。
     * @param root
     * @param sum
     * @return
     */
    public int pathSum3(TreeNode root, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        //Default sum = 0 has one count
        map.put(0, 1);
        return backtrack(root, 0, sum, map);
    }

    public int backtrack(TreeNode root, int sum, int target, Map<Integer, Integer> map){
        if (root == null) {
            return 0;
        }
        sum += root.val;
        //See if there is a subarray sum equals to target
        int res = map.getOrDefault(sum - target, 0);
        map.put(sum, map.getOrDefault(sum, 0)+1);
        //Extend to left and right child
        res += backtrack(root.left, sum, target, map);
        res += backtrack(root.right, sum, target, map);
        //Remove the current node so it won't affect other path
        map.put(sum, map.get(sum)-1);
        return res;
    }

}
