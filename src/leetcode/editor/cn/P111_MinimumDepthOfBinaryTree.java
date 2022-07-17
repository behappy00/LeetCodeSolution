/**
 * <p>Given a binary tree, find its minimum depth.</p>
 *
 * <p>The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.</p>
 *
 * <p><strong>Note:</strong>&nbsp;A leaf is a node with no children.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/10/12/ex_depth.jpg" style="width: 432px; height: 302px;" />
 * <pre>
 * <strong>Input:</strong> root = [3,9,20,null,null,15,7]
 * <strong>Output:</strong> 2
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> root = [2,null,3,null,4,null,5,null,6]
 * <strong>Output:</strong> 5
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li>The number of nodes in the tree is in the range <code>[0, 10<sup>5</sup>]</code>.</li>
 * <li><code>-1000 &lt;= Node.val &lt;= 1000</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 797</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * Minimum Depth of Binary Tree
 * @author WBJ
 * @date 2022-07-17 21:09:06
 */
public class P111_MinimumDepthOfBinaryTree {
	public static void main(String[] args) {
		//测试代码
		Solution solution = new P111_MinimumDepthOfBinaryTree().new Solution();
	}

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	class Solution {
		public int minDepth(TreeNode root) {

		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}
