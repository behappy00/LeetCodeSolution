/**
 * <p>Given an integer <code>x</code>, return <code>true</code> if <code>x</code> is palindrome integer.</p>
 *
 * <p>An integer is a <strong>palindrome</strong> when it reads the same backward as forward.</p>
 *
 * <ul>
 * <li>For example, <code>121</code> is a palindrome while <code>123</code> is not.</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> x = 121
 * <strong>Output:</strong> true
 * <strong>Explanation:</strong> 121 reads as 121 from left to right and from right to left.
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> x = -121
 * <strong>Output:</strong> false
 * <strong>Explanation:</strong> From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> x = 10
 * <strong>Output:</strong> false
 * <strong>Explanation:</strong> Reads 01 from right to left. Therefore it is not a palindrome.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>-2<sup>31</sup>&nbsp;&lt;= x &lt;= 2<sup>31</sup>&nbsp;- 1</code></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 * <strong>Follow up:</strong> Could you solve it without converting the integer to a string?<div><div>Related Topics</div><div><li>数学</li></div></div><br><div><li>👍 2053</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new PalindromeNumber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(int x) {
//            特殊情况：
            // 如上所述，当 x < 0 时，x 不是回文数。
            // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
            // 则其第一位数字也应该是 0
            // 只有 0 满足这一属性
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }

            int revertedNumber = 0;
            while (x > revertedNumber) {
                revertedNumber = revertedNumber * 10 + x % 10;
                x /= 10;
            }

            // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
            // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
            // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
            return x == revertedNumber || x == revertedNumber / 10;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}