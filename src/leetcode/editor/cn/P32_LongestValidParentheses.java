/**
 * <p>Given a string containing just the characters <code>&#39;(&#39;</code> and <code>&#39;)&#39;</code>, find the length of the longest valid (well-formed) parentheses substring.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> s = &quot;(()&quot;
 * <strong>Output:</strong> 2
 * <strong>Explanation:</strong> The longest valid parentheses substring is &quot;()&quot;.
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> s = &quot;)()())&quot;
 * <strong>Output:</strong> 4
 * <strong>Explanation:</strong> The longest valid parentheses substring is &quot;()()&quot;.
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> s = &quot;&quot;
 * <strong>Output:</strong> 0
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>0 &lt;= s.length &lt;= 3 * 10<sup>4</sup></code></li>
 * <li><code>s[i]</code> is <code>&#39;(&#39;</code>, or <code>&#39;)&#39;</code>.</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>栈</li><li>字符串</li><li>动态规划</li></div></div><br><div><li>👍 1897</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Longest Valid Parentheses
 *
 * @author WBJ
 * @date 2022-07-11 19:52:21
 */
public class P32_LongestValidParentheses {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P32_LongestValidParentheses().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestValidParentheses(String s) {
            int maxans = 0;
            Deque<Integer> stack = new LinkedList<Integer>();
            stack.push(-1);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        stack.push(i);
                    } else {
                        maxans = Math.max(maxans, i - stack.peek());
                    }
                }
            }
            return maxans;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
