/*
  <p>Given the <code>root</code> of a binary tree, return <em>the preorder traversal of its nodes&#39; values</em>.</p>

  <p>&nbsp;</p>
  <p><strong>Example 1:</strong></p>
  <img alt="" src="https://assets.leetcode.com/uploads/2020/09/15/inorder_1.jpg" style="width: 125px; height: 200px;" />
  <pre>
  <strong>Input:</strong> root = [1,null,2,3]
  <strong>Output:</strong> [1,2,3]
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
  <p><strong>Follow up:</strong> Recursive solution is trivial, could you do it iteratively?</p>
  <div><div>Related Topics</div><div><li>栈</li><li>树</li><li>深度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 876</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree Preorder Traversal
 *
 * @author WBJ
 * @date 2022-07-24 21:20:41
 */
public class P144_BinaryTreePreorderTraversal {
	public static void main(String[] args) {
		//测试代码
		Solution solution = new P144_BinaryTreePreorderTraversal().new Solution();
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
		public List<Integer> preorderTraversal(TreeNode root) {
			List<Integer> res = new ArrayList<Integer>();
			preorder(root, res);
			return res;
		}

		public void preorder(TreeNode root, List<Integer> res) {
			if (root == null) {
				return;
			}
			res.add(root.val);
			preorder(root.left, res);
			preorder(root.right, res);
		}
	}

//leetcode submit region end(Prohibit modification and deletion)

}
