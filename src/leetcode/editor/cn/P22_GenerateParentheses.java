/**
 * <p>Given <code>n</code> pairs of parentheses, write a function to <em>generate all combinations of well-formed parentheses</em>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <pre><strong>Input:</strong> n = 3
 * <strong>Output:</strong> ["((()))","(()())","(())()","()(())","()()()"]
 * </pre><p><strong>Example 2:</strong></p>
 * <pre><strong>Input:</strong> n = 1
 * <strong>Output:</strong> ["()"]
 * </pre>
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= n &lt;= 8</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>字符串</li><li>动态规划</li><li>回溯</li></div></div><br><div><li>👍 2740</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate Parentheses
 * @author WBJ
 * @date 2022-07-09 23:57:50
 */
public class P22_GenerateParentheses {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P22_GenerateParentheses().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public List<String> generateParenthesis(int n) {
            List<String> list = new ArrayList<>();
            dfs(n, n, true, list, new StringBuilder(2 * n));
            return list;
        }

        // 我这种解法可避免过多的栈桢进出消耗；另外使用到 StringBuilder 预分配最大长度，复用底层数组，避免字符串拼接运算。总体我测试了下，性能是稍高的。
        private void dfs(int n, int m, boolean flag, List<String> list, StringBuilder sb) {
            // 剪枝
            if (m == 0) {
                list.add(sb.toString());
                return;
            }
            // 因为左括号与右括号总是交替轮着出现的，所以 flag 是一个拨动开关，用来确定当前是打印左括号还是打印右括号，不同的是每次要打印次数的枚举
            // 控制左右括号可连续打印次数的边界
            for (int i = 1; i <= (flag ? n : m - n); i++) {
                int len = sb.length();
                for (int j = 0; j < i; j++)
                    sb.append(flag ? '(' : ')');
                dfs(flag ? n - i : n, flag ? m : m - i, !flag, list, sb);
                // 回溯
                sb.delete(len, sb.length());
            }
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
