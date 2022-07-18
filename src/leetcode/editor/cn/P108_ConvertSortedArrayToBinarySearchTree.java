/**
 * <p>Given an integer array <code>nums</code> where the elements are sorted in <strong>ascending order</strong>, convert <em>it to a <strong>height-balanced</strong> binary search tree</em>.</p>
 *
 * <p>A <strong>height-balanced</strong> binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/btree1.jpg" style="width: 302px; height: 222px;" />
 * <pre>
 * <strong>Input:</strong> nums = [-10,-3,0,5,9]
 * <strong>Output:</strong> [0,-3,9,-10,null,5]
 * <strong>Explanation:</strong> [0,-10,5,null,-3,null,9] is also accepted:
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/btree2.jpg" style="width: 302px; height: 222px;" />
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/btree.jpg" style="width: 342px; height: 142px;" />
 * <pre>
 * <strong>Input:</strong> nums = [1,3]
 * <strong>Output:</strong> [3,1]
 * <strong>Explanation:</strong> [1,null,3] and [3,1] are both height-balanced BSTs.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
 * <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
 * <li><code>nums</code> is sorted in a <strong>strictly increasing</strong> order.</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>树</li><li>二叉搜索树</li><li>数组</li><li>分治</li><li>二叉树</li></div></div><br><div><li>👍 1094</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import utils.TreeNode;

/**
 * Convert Sorted Array to Binary Search Tree
 *
 * @author WBJ
 * @date 2022-07-17 21:09:04
 */
public class P108_ConvertSortedArrayToBinarySearchTree {
	public static void main(String[] args) {
		//测试代码
		Solution solution = new P108_ConvertSortedArrayToBinarySearchTree().new Solution();
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
		public TreeNode sortedArrayToBST(int[] nums) {
			return dfs(nums, 0, nums.length - 1);
		}

		private TreeNode dfs(int[] nums, int lo, int hi) {
			if (lo > hi) {
				return null;
			}
			// 以升序数组的中间元素作为根节点 root。
			int mid = lo + (hi - lo) / 2;
			TreeNode root = new TreeNode(nums[mid]);
			// 递归的构建 root 的左子树与右子树。
			root.left = dfs(nums, lo, mid - 1);
			root.right = dfs(nums, mid + 1, hi);
			return root;
		}

	}
//leetcode submit region end(Prohibit modification and deletion)

}
