/*
  <p>Given the <code>root</code> of a binary tree, <em>check whether it is a mirror of itself</em> (i.e., symmetric around its center).</p>

  <p>&nbsp;</p>
  <p><strong>Example 1:</strong></p>
  <img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/symtree1.jpg" style="width: 354px; height: 291px;" />
  <pre>
  <strong>Input:</strong> root = [1,2,2,3,4,4,3]
  <strong>Output:</strong> true
  </pre>

  <p><strong>Example 2:</strong></p>
  <img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/symtree2.jpg" style="width: 308px; height: 258px;" />
  <pre>
  <strong>Input:</strong> root = [1,2,2,null,3,null,3]
  <strong>Output:</strong> false
  </pre>

  <p>&nbsp;</p>
  <p><strong>Constraints:</strong></p>

  <ul>
  <li>The number of nodes in the tree is in the range <code>[1, 1000]</code>.</li>
  <li><code>-100 &lt;= Node.val &lt;= 100</code></li>
  </ul>

  <p>&nbsp;</p>
  <strong>Follow up:</strong> Could you solve it both recursively and iteratively?<div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 2009</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import utils.TreeNode;

/**
 * Symmetric Tree
 *
 * @author WBJ
 * @date 2022-07-17 21:09:01
 */
public class P101_SymmetricTree {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P101_SymmetricTree().new Solution();
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
        public boolean isSymmetric(TreeNode root) {
            return check(root, root);
        }

        private boolean check(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null) {
                return false;
            }

            return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
