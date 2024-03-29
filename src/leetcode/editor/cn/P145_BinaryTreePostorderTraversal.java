/**
 * <p>Given the <code>root</code> of a&nbsp;binary tree, return <em>the postorder traversal of its nodes&#39; values</em>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/08/28/pre1.jpg" style="width: 127px; height: 200px;" />
 * <pre>
 * <strong>Input:</strong> root = [1,null,2,3]
 * <strong>Output:</strong> [3,2,1]
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> root = []
 * <strong>Output:</strong> []
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> root = [1]
 * <strong>Output:</strong> [1]
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li>The number of the nodes in the tree is in the range <code>[0, 100]</code>.</li>
 * <li><code>-100 &lt;= Node.val &lt;= 100</code></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 * <strong>Follow up:</strong> Recursive solution is trivial, could you do it iteratively?<div><div>Related Topics</div><div><li>栈</li><li>树</li><li>深度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 888</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import com.sun.org.apache.bcel.internal.generic.NEW;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree Postorder Traversal
 *
 * @author WBJ
 * @date 2022-07-24 21:20:43
 */
public class P145_BinaryTreePostorderTraversal {
	public static void main(String[] args) {
		//测试代码
		Solution solution = new P145_BinaryTreePostorderTraversal().new Solution();
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
		public List<Integer> postorderTraversal(TreeNode root) {
			List<Integer> res = new ArrayList<Integer>();
			postorder(root, res);
			return res;
		}

		public void postorder(TreeNode root, List<Integer> res) {
			if (root == null) {
				return;
			}
			postorder(root.left, res);
			postorder(root.right, res);
			res.add(root.val);
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}
