/**
 * <p>Given an integer array nums, return all the triplets <code>[nums[i], nums[j], nums[k]]</code> such that <code>i != j</code>, <code>i != k</code>, and <code>j != k</code>, and <code>nums[i] + nums[j] + nums[k] == 0</code>.</p>
 *
 * <p>Notice that the solution set must not contain duplicate triplets.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [-1,0,1,2,-1,-4]
 * <strong>Output:</strong> [[-1,-1,2],[-1,0,1]]
 * <strong>Explanation:</strong>
 * nums[0] + nums[1] + nums[1] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [0,1,1]
 * <strong>Output:</strong> []
 * <strong>Explanation:</strong> The only possible triplet does not sum up to 0.
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [0,0,0]
 * <strong>Output:</strong> [[0,0,0]]
 * <strong>Explanation:</strong> The only possible triplet sums up to 0.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>3 &lt;= nums.length &lt;= 3000</code></li>
 * <li><code>-10<sup>5</sup> &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>双指针</li><li>排序</li></div></div><br><div><li>👍 4940</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList();
            int len = nums.length;
            if (nums == null || len < 3) return ans;
            Arrays.sort(nums); // 排序
            for (int i = 0; i < len; i++) {
                if (nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
                if (i > 0 && nums[i] == nums[i - 1]) continue; // 去重
                int L = i + 1;
                int R = len - 1;
                while (L < R) {
                    int sum = nums[i] + nums[L] + nums[R];
                    if (sum == 0) {
                        ans.add(Arrays.asList(nums[i], nums[L], nums[R]));
                        while (L < R && nums[L] == nums[L + 1]) L++; // 去重
                        while (L < R && nums[R] == nums[R - 1]) R--; // 去重
                        L++;
                        R--;
                    } else if (sum < 0) L++;
                    else if (sum > 0) R--;
                }
            }
            return ans;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}