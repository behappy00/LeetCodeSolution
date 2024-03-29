package leetcode.editor.cn;

/*
  <p>Given an array of <strong>distinct</strong> integers <code>candidates</code> and a target integer <code>target</code>, return <em>a list of all <strong>unique combinations</strong> of </em><code>candidates</code><em> where the chosen numbers sum to </em><code>target</code><em>.</em> You may return the combinations in <strong>any order</strong>.</p>

  <p>The <strong>same</strong> number may be chosen from <code>candidates</code> an <strong>unlimited number of times</strong>. Two combinations are unique if the frequency of at least one of the chosen numbers is different.</p>

  <p>It is <strong>guaranteed</strong> that the number of unique combinations that sum up to <code>target</code> is less than <code>150</code> combinations for the given input.</p>

  <p>&nbsp;</p>
  <p><strong>Example 1:</strong></p>

  <pre>
  <strong>Input:</strong> candidates = [2,3,6,7], target = 7
  <strong>Output:</strong> [[2,2,3],[7]]
  <strong>Explanation:</strong>
  2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
  7 is a candidate, and 7 = 7.
  These are the only two combinations.
  </pre>

  <p><strong>Example 2:</strong></p>

  <pre>
  <strong>Input:</strong> candidates = [2,3,5], target = 8
  <strong>Output:</strong> [[2,2,2,2],[2,3,3],[3,5]]
  </pre>

  <p><strong>Example 3:</strong></p>

  <pre>
  <strong>Input:</strong> candidates = [2], target = 1
  <strong>Output:</strong> []
  </pre>

  <p>&nbsp;</p>
  <p><strong>Constraints:</strong></p>

  <ul>
  <li><code>1 &lt;= candidates.length &lt;= 30</code></li>
  <li><code>1 &lt;= candidates[i] &lt;= 200</code></li>
  <li>All elements of <code>candidates</code> are <strong>distinct</strong>.</li>
  <li><code>1 &lt;= target &lt;= 500</code></li>
  </ul>
  <div><div>Related Topics</div><div><li>数组</li><li>回溯</li></div></div><br><div><li>👍 2088</li><li>👎 0</li></div>
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Combination Sum
 * @author WBJ
 * @date 2022-08-04 10:34:32
 */
public class P39_CombinationSum {
	public static void main(String[] args) {
		//测试代码
		Solution solution = new P39_CombinationSum().new Solution();
	}

	//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public List<List<Integer>> combinationSum(int[] candidates, int target) {
			List<List<Integer>> ans = new ArrayList<List<Integer>>();
			List<Integer> combine = new ArrayList<Integer>();
			dfs(candidates, target, ans, combine, 0);
			return ans;
		}

		public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx
		) {
			if (idx == candidates.length) {
				return;
			}
			if (target == 0) {
				ans.add(new ArrayList<Integer>(combine));
				return;
			}
			// 直接跳过
			dfs(candidates, target, ans, combine, idx + 1);
			// 选择当前数
			if (target - candidates[idx] >= 0) {
				combine.add(candidates[idx]);
				dfs(candidates, target - candidates[idx], ans, combine, idx);
				combine.remove(combine.size() - 1);
			}


		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}
