/**
 * <p>Given two integers <code>dividend</code> and <code>divisor</code>, divide two integers <strong>without</strong> using multiplication, division, and mod operator.</p>
 *
 * <p>The integer division should truncate toward zero, which means losing its fractional part. For example, <code>8.345</code> would be truncated to <code>8</code>, and <code>-2.7335</code> would be truncated to <code>-2</code>.</p>
 *
 * <p>Return <em>the <strong>quotient</strong> after dividing </em><code>dividend</code><em> by </em><code>divisor</code>.</p>
 *
 * <p><strong>Note: </strong>Assume we are dealing with an environment that could only store integers within the <strong>32-bit</strong> signed integer range: <code>[&minus;2<sup>31</sup>, 2<sup>31</sup> &minus; 1]</code>. For this problem, if the quotient is <strong>strictly greater than</strong> <code>2<sup>31</sup> - 1</code>, then return <code>2<sup>31</sup> - 1</code>, and if the quotient is <strong>strictly less than</strong> <code>-2<sup>31</sup></code>, then return <code>-2<sup>31</sup></code>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> dividend = 10, divisor = 3
 * <strong>Output:</strong> 3
 * <strong>Explanation:</strong> 10/3 = 3.33333.. which is truncated to 3.
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> dividend = 7, divisor = -3
 * <strong>Output:</strong> -2
 * <strong>Explanation:</strong> 7/-3 = -2.33333.. which is truncated to -2.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>-2<sup>31</sup> &lt;= dividend, divisor &lt;= 2<sup>31</sup> - 1</code></li>
 * <li><code>divisor != 0</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>位运算</li><li>数学</li></div></div><br><div><li>👍 932</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * Divide Two Integers
 *
 * @author WBJ
 * @date 2022-07-10 20:57:03
 */
public class P29_DivideTwoIntegers {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P29_DivideTwoIntegers().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int divide(int dividend, int divisor) {
            // 考虑被除数为最小值的情况
            if (dividend == Integer.MIN_VALUE) {
                if (divisor == 1) {
                    return Integer.MIN_VALUE;
                }
                if (divisor == -1) {
                    return Integer.MAX_VALUE;
                }
            }
            // 考虑除数为最小值的情况
            if (divisor == Integer.MIN_VALUE) {
                return dividend == Integer.MIN_VALUE ? 1 : 0;
            }
            // 考虑被除数为 0 的情况
            if (dividend == 0) {
                return 0;
            }

            // 一般情况，使用二分查找
            // 将所有的正数取相反数，这样就只需要考虑一种情况
            boolean rev = false;
            if (dividend > 0) {
                dividend = -dividend;
                rev = !rev;
            }
            if (divisor > 0) {
                divisor = -divisor;
                rev = !rev;
            }

            int left = 1, right = Integer.MAX_VALUE, ans = 0;
            while (left <= right) {
                // 注意溢出，并且不能使用除法
                int mid = left + ((right - left) >> 1);
                boolean check = quickAdd(divisor, mid, dividend);
                if (check) {
                    ans = mid;
                    // 注意溢出
                    if (mid == Integer.MAX_VALUE) {
                        break;
                    }
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return rev ? -ans : ans;
        }

        // 快速乘
        public boolean quickAdd(int y, int z, int x) {
            // x 和 y 是负数，z 是正数
            // 需要判断 z * y >= x 是否成立
            int result = 0, add = y;
            while (z != 0) {
                if ((z & 1) != 0) {
                    // 需要保证 result + add >= x
                    if (result < x - add) {
                        return false;
                    }
                    result += add;
                }
                if (z != 1) {
                    // 需要保证 add + add >= x
                    if (add < x - add) {
                        return false;
                    }
                    add += add;
                }
                // 不能使用除法
                z >>= 1;
            }
            return true;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
