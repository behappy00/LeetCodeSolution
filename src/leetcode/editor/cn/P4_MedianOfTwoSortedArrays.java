//<p>Given two sorted arrays <code>nums1</code> and <code>nums2</code> of size <code>m</code> and <code>n</code> respectively, return <strong>the median</strong> of the two sorted arrays.</p>
//
//<p>The overall run time complexity should be <code>O(log (m+n))</code>.</p>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums1 = [1,3], nums2 = [2]
//<strong>Output:</strong> 2.00000
//<strong>Explanation:</strong> merged array = [1,2,3] and median is 2.
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums1 = [1,2], nums2 = [3,4]
//<strong>Output:</strong> 2.50000
//<strong>Explanation:</strong> merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li><code>nums1.length == m</code></li>
//	<li><code>nums2.length == n</code></li>
//	<li><code>0 &lt;= m &lt;= 1000</code></li>
//	<li><code>0 &lt;= n &lt;= 1000</code></li>
//	<li><code>1 &lt;= m + n &lt;= 2000</code></li>
//	<li><code>-10<sup>6</sup> &lt;= nums1[i], nums2[i] &lt;= 10<sup>6</sup></code></li>
//</ul>
//<div><div>Related Topics</div><div><li>数组</li><li>二分查找</li><li>分治</li></div></div><br><div><li>👍 5598</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Median of Two Sorted Arrays
 *
 * @author WBJ
 * @date 2022-07-09 23:03:32
 */
public class P4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P4_MedianOfTwoSortedArrays().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int m = nums2.length;
            int left = (n + m + 1) / 2;
            int right = (n + m + 2) / 2;
            //将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
            return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left) + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;
        }

        private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
            int len1 = end1 - start1 + 1;
            int len2 = end2 - start2 + 1;
            //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
            if (len1 > len2) return getKth(nums2, start2, end2, nums1, start1, end1, k);
            if (len1 == 0) return nums2[start2 + k - 1];

            if (k == 1) return Math.min(nums1[start1], nums2[start2]);

            int i = start1 + Math.min(len1, k / 2) - 1;
            int j = start2 + Math.min(len2, k / 2) - 1;

            if (nums1[i] > nums2[j]) {
                return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
            } else {
                return getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
            }
        }

    }
//leetcode submit region end(Prohibit modification and deletion)


}
