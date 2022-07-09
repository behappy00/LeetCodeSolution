//<p>Given an integer array nums, return all the triplets <code>[nums[i], nums[j], nums[k]]</code> such that <code>i != j</code>, <code>i != k</code>, and <code>j != k</code>, and <code>nums[i] + nums[j] + nums[k] == 0</code>.</p>
//
//<p>Notice that the solution set must not contain duplicate triplets.</p>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [-1,0,1,2,-1,-4]
//<strong>Output:</strong> [[-1,-1,2],[-1,0,1]]
//<strong>Explanation:</strong> 
//nums[0] + nums[1] + nums[1] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [0,1,1]
//<strong>Output:</strong> []
//<strong>Explanation:</strong> The only possible triplet does not sum up to 0.
//</pre>
//
//<p><strong>Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [0,0,0]
//<strong>Output:</strong> [[0,0,0]]
//<strong>Explanation:</strong> The only possible triplet sums up to 0.
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li><code>3 &lt;= nums.length &lt;= 3000</code></li>
//	<li><code>-10<sup>5</sup> &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
//</ul>
//<div><div>Related Topics</div><div><li>数组</li><li>双指针</li><li>排序</li></div></div><br><div><li>👍 4945</li><li>👎 0</li></div>

package leetcode.editor.cn;

import java.util.List;

/**
 * 3Sum
 *
 * @author WBJ
 * @date 2022-07-09 23:03:39
 */
public class P15_ThreeSum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P15_ThreeSum().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
