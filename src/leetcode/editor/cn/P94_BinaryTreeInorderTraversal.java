/*
  <p>Given the <code>root</code> of a binary tree, return <em>the inorder traversal of its nodes&#39; values</em>.</p>

  <p>&nbsp;</p>
  <p><strong>Example 1:</strong></p>
  <img alt="" src="https://assets.leetcode.com/uploads/2020/09/15/inorder_1.jpg" style="width: 125px; height: 200px;" />
  <pre>
  <strong>Input:</strong> root = [1,null,2,3]
  <strong>Output:</strong> [1,3,2]
  </pre>

  <p><strong>Example 2:</strong></p>

  <pre>
  <strong>Input:</strong> root = []
  <strong>Output:</strong> []
  </pre>

  <p><strong>Example 3:</strong></p>

  <pre>
  <strong>Input:</strong> root = [1]
  <strong>Output:</strong> [1]
  </pre>

  <p>&nbsp;</p>
  <p><strong>Constraints:</strong></p>

  <ul>
  <li>The number of nodes in the tree is in the range <code>[0, 100]</code>.</li>
  <li><code>-100 &lt;= Node.val &lt;= 100</code></li>
  </ul>

  <p>&nbsp;</p>
  <strong>Follow up:</strong> Recursive solution is trivial, could you do it iteratively?<div><div>Related Topics</div><div><li>栈</li><li>树</li><li>深度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 1497</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree Inorder Traversal
 *
 * @author WBJ
 * @date 2022-07-17 15:04:46
 */
public class P94_BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P94_BinaryTreeInorderTraversal().new Solution();
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
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<Integer>();
            inorder(root, res);
            return res;
        }

        public void inorder(TreeNode root, List<Integer> res) {
            if (root == null) {
                return;
            }
            inorder(root.left, res);
            res.add(root.val);
            inorder(root.right, res);
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
