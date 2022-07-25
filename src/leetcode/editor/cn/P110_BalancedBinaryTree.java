/**
 * <p>Given a binary tree, determine if it is height-balanced.</p>
 *
 * <p>For this problem, a height-balanced binary tree is defined as:</p>
 *
 * <blockquote>
 * <p>a binary tree in which the left and right subtrees of <em>every</em> node differ in height by no more than 1.</p>
 * </blockquote>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/10/06/balance_1.jpg" style="width: 342px; height: 221px;" />
 * <pre>
 * <strong>Input:</strong> root = [3,9,20,null,null,15,7]
 * <strong>Output:</strong> true
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/10/06/balance_2.jpg" style="width: 452px; height: 301px;" />
 * <pre>
 * <strong>Input:</strong> root = [1,2,2,3,3,null,null,4,4]
 * <strong>Output:</strong> false
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> root = []
 * <strong>Output:</strong> true
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li>The number of nodes in the tree is in the range <code>[0, 5000]</code>.</li>
 * <li><code>-10<sup>4</sup> &lt;= Node.val &lt;= 10<sup>4</sup></code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 1074</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import utils.TreeNode;

/**
 * Balanced Binary Tree
 *
 * @author WBJ
 * @date 2022-07-17 21:09:07
 */
public class P110_BalancedBinaryTree {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P110_BalancedBinaryTree().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return height(root) >= 0;
        }

        private int height(TreeNode root) {
            if (root == null)
                return 0;
            int lh = height(root.left), rh = height(root.right);
            if (lh >= 0 && rh >= 0 && Math.abs(lh - rh) <= 1) {
                return Math.max(lh, rh) + 1;
            } else {
                return -1;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
