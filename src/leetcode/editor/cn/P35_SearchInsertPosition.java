/**
 * <p>Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.</p>
 *
 * <p>You must&nbsp;write an algorithm with&nbsp;<code>O(log n)</code> runtime complexity.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [1,3,5,6], target = 5
 * <strong>Output:</strong> 2
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [1,3,5,6], target = 2
 * <strong>Output:</strong> 1
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> nums = [1,3,5,6], target = 7
 * <strong>Output:</strong> 4
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
 * <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
 * <li><code>nums</code> contains <strong>distinct</strong> values sorted in <strong>ascending</strong> order.</li>
 * <li><code>-10<sup>4</sup> &lt;= target &lt;= 10<sup>4</sup></code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>二分查找</li></div></div><br><div><li>👍 1618</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * Search Insert Position
 * @author WBJ
 * @date 2022-07-11 19:52:24
 */
public class P35_SearchInsertPosition {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P35_SearchInsertPosition().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
//	因为限制了时间复杂度，因此必须选择二分法
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int n = nums.length;
            int left = 0, right = n - 1, ans = n;
            while (left <= right) {
                int mid = ((right - left) >> 1) + left;
                if (target <= nums[mid]) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return ans;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
