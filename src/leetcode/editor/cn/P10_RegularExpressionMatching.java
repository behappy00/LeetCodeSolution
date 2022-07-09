//<p>Given an input string <code>s</code>&nbsp;and a pattern <code>p</code>, implement regular expression matching with support for <code>&#39;.&#39;</code> and <code>&#39;*&#39;</code> where:</p>
//
//<ul>
//	<li><code>&#39;.&#39;</code> Matches any single character.​​​​</li>
//	<li><code>&#39;*&#39;</code> Matches zero or more of the preceding element.</li>
//</ul>
//
//<p>The matching should cover the <strong>entire</strong> input string (not partial).</p>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;aa&quot;, p = &quot;a&quot;
//<strong>Output:</strong> false
//<strong>Explanation:</strong> &quot;a&quot; does not match the entire string &quot;aa&quot;.
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;aa&quot;, p = &quot;a*&quot;
//<strong>Output:</strong> true
//<strong>Explanation:</strong> &#39;*&#39; means zero or more of the preceding element, &#39;a&#39;. Therefore, by repeating &#39;a&#39; once, it becomes &quot;aa&quot;.
//</pre>
//
//<p><strong>Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;ab&quot;, p = &quot;.*&quot;
//<strong>Output:</strong> true
//<strong>Explanation:</strong> &quot;.*&quot; means &quot;zero or more (*) of any character (.)&quot;.
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li><code>1 &lt;= s.length&nbsp;&lt;= 20</code></li>
//	<li><code>1 &lt;= p.length&nbsp;&lt;= 30</code></li>
//	<li><code>s</code> contains only lowercase English letters.</li>
//	<li><code>p</code> contains only lowercase English letters, <code>&#39;.&#39;</code>, and&nbsp;<code>&#39;*&#39;</code>.</li>
//	<li>It is guaranteed for each appearance of the character <code>&#39;*&#39;</code>, there will be a previous valid character to match.</li>
//</ul>
//<div><div>Related Topics</div><div><li>递归</li><li>字符串</li><li>动态规划</li></div></div><br><div><li>👍 3070</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Regular Expression Matching
 *
 * @author WBJ
 * @date 2022-07-09 23:03:37
 */
public class P10_RegularExpressionMatching {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P10_RegularExpressionMatching().new Solution();
    }

    //力扣代码
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isMatch(String s, String p) {
            int m = s.length(), n = p.length();
            boolean[][] dp = new boolean[m + 1][n + 1];
            dp[0][0] = true;
            for (int i = 0; i < m + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    if (p.charAt(j - 1) == '*') {
                        dp[i][j] = dp[i][j - 2];
                        if (match(s, p, i - 1, j - 2)) {
                            dp[i][j] = dp[i][j] || dp[i - 1][j];
                        }
                    } else {
                        if (match(s, p, i - 1, j - 1)) {
                            dp[i][j] = dp[i - 1][j - 1];
                        }
                    }

                }
            }
            return dp[m][n];

        }

        boolean match(String s, String p, int i, int j) {
            if (i < 0) {
                return false;
            } else if (p.charAt(j) == '.') {
                return true;
            } else if (s.charAt(i) == p.charAt(j)) {
                return true;
            } else {
                return false;
            }
        }
    }

//leetcode submit region end(Prohibit modification and deletion)


}
