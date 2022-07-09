/**
 * <p>Given a string <code>s</code> containing just the characters <code>&#39;(&#39;</code>, <code>&#39;)&#39;</code>, <code>&#39;{&#39;</code>, <code>&#39;}&#39;</code>, <code>&#39;[&#39;</code> and <code>&#39;]&#39;</code>, determine if the input string is valid.</p>
 *
 * <p>An input string is valid if:</p>
 *
 * <ol>
 * <li>Open brackets must be closed by the same type of brackets.</li>
 * <li>Open brackets must be closed in the correct order.</li>
 * </ol>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> s = &quot;()&quot;
 * <strong>Output:</strong> true
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> s = &quot;()[]{}&quot;
 * <strong>Output:</strong> true
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> s = &quot;(]&quot;
 * <strong>Output:</strong> false
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
 * <li><code>s</code> consists of parentheses only <code>&#39;()[]{}&#39;</code>.</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>栈</li><li>字符串</li></div></div><br><div><li>👍 3375</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            int n = s.length();
            if (n % 2 == 1) {
                return false;
            }

            Map<Character, Character> pairs = new HashMap<Character, Character>() {{
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }};
            Deque<Character> stack = new LinkedList<Character>();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (pairs.containsKey(ch)) {
                    if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                        return false;
                    }
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            return stack.isEmpty();
        }
    }

//    方法一：
//    class Solution {
//        public boolean isValid(String s) {
//            Stack<Character> stk = new Stack<Character>();
//            int n = s.length();
//            if (n % 2 == 1) {
//                return false;
//            }else{
//                for (int i = 0; i < n; i++) {
//                    if (stk.empty() || s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
//                        stk.push(s.charAt(i));
//                    } else if (stk.peek() == '(' && s.charAt(i) == ')') {
//                        stk.pop();
//                    } else if (stk.peek() == '[' && s.charAt(i) == ']') {
//                        stk.pop();
//                    } else if (stk.peek() == '{' && s.charAt(i) == '}') {
//                        stk.pop();
//                    } else {
//                        return false;
//                    }
//                }
//            }
//
//            return stk.empty();
//        }
//
//
//    }
//leetcode submit region end(Prohibit modification and deletion)

}