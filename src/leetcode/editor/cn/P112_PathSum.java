/**
 * <p>Given the <code>root</code> of a binary tree and an integer <code>targetSum</code>, return <code>true</code> if the tree has a <strong>root-to-leaf</strong> path such that adding up all the values along the path equals <code>targetSum</code>.</p>
 *
 * <p>A <strong>leaf</strong> is a node with no children.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/01/18/pathsum1.jpg" style="width: 500px; height: 356px;" />
 * <pre>
 * <strong>Input:</strong> root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * <strong>Output:</strong> true
 * <strong>Explanation:</strong> The root-to-leaf path with the target sum is shown.
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/01/18/pathsum2.jpg" />
 * <pre>
 * <strong>Input:</strong> root = [1,2,3], targetSum = 5
 * <strong>Output:</strong> false
 * <strong>Explanation:</strong> There two root-to-leaf paths in the tree:
 * (1 --&gt; 2): The sum is 3.
 * (1 --&gt; 3): The sum is 4.
 * There is no root-to-leaf path with sum = 5.
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> root = [], targetSum = 0
 * <strong>Output:</strong> false
 * <strong>Explanation:</strong> Since the tree is empty, there are no root-to-leaf paths.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li>The number of nodes in the tree is in the range <code>[0, 5000]</code>.</li>
 * <li><code>-1000 &lt;= Node.val &lt;= 1000</code></li>
 * <li><code>-1000 &lt;= targetSum &lt;= 1000</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 943</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * Path Sum
 * @author WBJ
 * @date 2022-07-17 21:09:08
 */
public class P112_PathSum {
	public static void main(String[] args) {
		//测试代码
		Solution solution = new P112_PathSum().new Solution();
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
		public boolean hasPathSum(TreeNode root, int targetSum) {

		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}
