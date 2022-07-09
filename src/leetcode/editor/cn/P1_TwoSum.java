//////<p>Given an array of integers <code>nums</code>&nbsp;and an integer <code>target</code>, return <em>indices of the two numbers such that they add up to <code>target</code></em>.</p>
//////
//////<p>You may assume that each input would have <strong><em>exactly</em> one solution</strong>, and you may not use the <em>same</em> element twice.</p>
//////
//////<p>You can return the answer in any order.</p>
//////
//////<p>&nbsp;</p>
//////<p><strong>Example 1:</strong></p>
//////
//////<pre>
//////<strong>Input:</strong> nums = [2,7,11,15], target = 9
//////<strong>Output:</strong> [0,1]
//////<strong>Explanation:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
//////</pre>
//////
//////<p><strong>Example 2:</strong></p>
//////
//////<pre>
//////<strong>Input:</strong> nums = [3,2,4], target = 6
//////<strong>Output:</strong> [1,2]
//////</pre>
//////
//////<p><strong>Example 3:</strong></p>
//////
//////<pre>
//////<strong>Input:</strong> nums = [3,3], target = 6
//////<strong>Output:</strong> [0,1]
//////</pre>
//////
//////<p>&nbsp;</p>
//////<p><strong>Constraints:</strong></p>
//////
//////<ul>
//////	<li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
//////	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
//////	<li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
//////	<li><strong>Only one valid answer exists.</strong></li>
//////</ul>
//////
//////<p>&nbsp;</p>
//////<strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than&nbsp;<code>O(n<sup>2</sup>)&nbsp;</code>time complexity?<div><div>Related Topics</div><div><li>数组</li><li>哈希表</li></div></div><br><div><li>👍 14782</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 *
 * @author WBJ
 * @date 2022-07-09 23:00:15
 */
public class P1_TwoSum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1_TwoSum().new Solution();
    }

//力扣代码
    //leetcode submit region begin(Prohibit modification and deletion)

//    解题思路：
//    使用 map （key,value）的特性，将数组中的每个数字放在对应下标处，如果在 map中能找到 目标值和当前值的差值，说明找到


    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{map.get(target - nums[i]), i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
