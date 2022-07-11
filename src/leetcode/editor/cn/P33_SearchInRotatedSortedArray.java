/**
<p>There is an integer array <code>nums</code> sorted in ascending order (with <strong>distinct</strong> values).</p>

<p>Prior to being passed to your function, <code>nums</code> is <strong>possibly rotated</strong> at an unknown pivot index <code>k</code> (<code>1 &lt;= k &lt; nums.length</code>) such that the resulting array is <code>[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]</code> (<strong>0-indexed</strong>). For example, <code>[0,1,2,4,5,6,7]</code> might be rotated at pivot index <code>3</code> and become <code>[4,5,6,7,0,1,2]</code>.</p>

<p>Given the array <code>nums</code> <strong>after</strong> the possible rotation and an integer <code>target</code>, return <em>the index of </em><code>target</code><em> if it is in </em><code>nums</code><em>, or </em><code>-1</code><em> if it is not in </em><code>nums</code>.</p>

<p>You must write an algorithm with <code>O(log n)</code> runtime complexity.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [4,5,6,7,0,1,2], target = 0
<strong>Output:</strong> 4
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [4,5,6,7,0,1,2], target = 3
<strong>Output:</strong> -1
</pre><p><strong>Example 3:</strong></p>
<pre><strong>Input:</strong> nums = [1], target = 0
<strong>Output:</strong> -1
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 5000</code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
	<li>All values of <code>nums</code> are <strong>unique</strong>.</li>
	<li><code>nums</code> is an ascending array that is possibly rotated.</li>
	<li><code>-10<sup>4</sup> &lt;= target &lt;= 10<sup>4</sup></code></li>
</ul>
<div><div>Related Topics</div><div><li>数组</li><li>二分查找</li></div></div><br><div><li>👍 2184</li><li>👎 0</li></div>
*/

package leetcode.editor.cn;

/**
 * Search in Rotated Sorted Array
 * @author WBJ
 * @date 2022-07-11 19:52:22
 */
public class P33_SearchInRotatedSortedArray{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P33_SearchInRotatedSortedArray().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int search(int[] nums, int target) {
		int lo = 0, hi = nums.length - 1, mid = 0;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			// 先根据 nums[mid] 与 nums[lo] 的关系判断 mid 是在左段还是右段
			if (nums[mid] >= nums[lo]) {
				// 再判断 target 是在 mid 的左边还是右边，从而调整左右边界 lo 和 hi
				if (target >= nums[lo] && target < nums[mid]) {
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			} else {
				if (target > nums[mid] && target <= nums[hi]) {
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}
		}
		return -1;
	}

}
//leetcode submit region end(Prohibit modification and deletion)

}
