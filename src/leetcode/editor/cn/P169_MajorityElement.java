package leetcode.editor.cn;

/*
<p>Given an array <code>nums</code> of size <code>n</code>, return <em>the majority element</em>.</p>

<p>The majority element is the element that appears more than <code>&lfloor;n / 2&rfloor;</code> times. You may assume that the majority element always exists in the array.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [3,2,3]
<strong>Output:</strong> 3
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [2,2,1,1,1,2,2]
<strong>Output:</strong> 2
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == nums.length</code></li>
	<li><code>1 &lt;= n &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow-up:</strong> Could you solve the problem in linear time and in <code>O(1)</code> space?<div><div>Related Topics</div><div><li>数组</li><li>哈希表</li><li>分治</li><li>计数</li><li>排序</li></div></div><br><div><li>👍 1515</li><li>👎 0</li></div>
*/

/**
 * Majority Element
 *
 * @author WBJ
 * @date 2022-08-04 08:46:31
 */
public class P169_MajorityElement {
	public static void main(String[] args) {
		//测试代码
		Solution solution = new P169_MajorityElement().new Solution();
	}

	//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public int majorityElement(int[] nums) {

//			摩尔投票法思路
			int cand_num = nums[0], count = 1;
			for (int i = 1; i < nums.length; ++i) {
				if (cand_num == nums[i])
					++count;
				else if (--count == 0) {
					cand_num = nums[i];
					count = 1;
				}
			}
			return cand_num;
		}

	}
//leetcode submit region end(Prohibit modification and deletion)

}
