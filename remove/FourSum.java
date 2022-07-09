/**
 * <p>Given an array <code>nums</code> of <code>n</code> integers, return <em>an array of all the <strong>unique</strong> quadruplets</em> <code>[nums[a], nums[b], nums[c], nums[d]]</code> such that:</p>
 *
 * <ul>
 * <li><code>0 &lt;= a, b, c, d&nbsp;&lt; n</code></li>
 * <li><code>a</code>, <code>b</code>, <code>c</code>, and <code>d</code> are <strong>distinct</strong>.</li>
 * <li><code>nums[a] + nums[b] + nums[c] + nums[d] == target</code></li>
 * </ul>
 *
 * <p>You may return the answer in <strong>any order</strong>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [1,0,-1,0,-2,2], target = 0
 * <strong>Output:</strong> [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [2,2,2,2,2], target = 8
 * <strong>Output:</strong> [[2,2,2,2]]
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 200</code></li>
 * <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 * <li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>双指针</li><li>排序</li></div></div><br><div><li>👍 1288</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        Solution solution = new FourSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
            if (nums == null || nums.length < 4) {
                return quadruplets;
            }
            Arrays.sort(nums);
            int length = nums.length;
            for (int i = 0; i < length - 3; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                    break;
                }
                if ((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
                    continue;
                }
                for (int j = i + 1; j < length - 2; j++) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) {
                        continue;
                    }
                    if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                        break;
                    }
                    if ((long) nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target) {
                        continue;
                    }
                    int left = j + 1, right = length - 1;
                    while (left < right) {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum == target) {
                            quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            while (left < right && nums[left] == nums[left + 1]) {
                                left++;
                            }
                            left++;
                            while (left < right && nums[right] == nums[right - 1]) {
                                right--;
                            }
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
            return quadruplets;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}