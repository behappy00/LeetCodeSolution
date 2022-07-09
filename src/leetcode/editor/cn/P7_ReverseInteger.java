//<p>Given a signed 32-bit integer <code>x</code>, return <code>x</code><em> with its digits reversed</em>. If reversing <code>x</code> causes the value to go outside the signed 32-bit integer range <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>, then return <code>0</code>.</p>
//
//<p><strong>Assume the environment does not allow you to store 64-bit integers (signed or unsigned).</strong></p>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> x = 123
//<strong>Output:</strong> 321
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> x = -123
//<strong>Output:</strong> -321
//</pre>
//
//<p><strong>Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> x = 120
//<strong>Output:</strong> 21
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li><code>-2<sup>31</sup> &lt;= x &lt;= 2<sup>31</sup> - 1</code></li>
//</ul>
//<div><div>Related Topics</div><div><li>数学</li></div></div><br><div><li>👍 3561</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Reverse Integer
 *
 * @author WBJ
 * @date 2022-07-09 23:03:35
 */
public class P7_ReverseInteger {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P7_ReverseInteger().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            int res = 0;
            while (x != 0) {
                //每次取末尾数字
                int tmp = x % 10;
                //判断是否 大于 最大32位整数
                if (res > 214748364 || (res == 214748364 && tmp > 7)) {
                    return 0;
                }
                //判断是否 小于 最小32位整数
                if (res < -214748364 || (res == -214748364 && tmp < -8)) {
                    return 0;
                }
                res = res * 10 + tmp;
                x /= 10;
            }
            return res;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
