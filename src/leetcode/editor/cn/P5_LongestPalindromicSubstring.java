//<p>Given a string <code>s</code>, return <em>the longest palindromic substring</em> in <code>s</code>.</p>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;babad&quot;
//<strong>Output:</strong> &quot;bab&quot;
//<strong>Explanation:</strong> &quot;aba&quot; is also a valid answer.
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;cbbd&quot;
//<strong>Output:</strong> &quot;bb&quot;
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li><code>1 &lt;= s.length &lt;= 1000</code></li>
//	<li><code>s</code> consist of only digits and English letters.</li>
//</ul>
//<div><div>Related Topics</div><div><li>字符串</li><li>动态规划</li></div></div><br><div><li>👍 5428</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Longest Palindromic Substring
 *
 * @author WBJ
 * @date 2022-07-09 23:03:33
 */
public class P5_LongestPalindromicSubstring {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P5_LongestPalindromicSubstring().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() < 1) return "";
            int start = 0, end = 0;
            for (int i = 0; i < s.length(); i++) {
                int len1 = expandAroundCenter(s, i, i);
                int len2 = expandAroundCenter(s, i, i + 1);
                int len = Math.max(len1, len2);
                if (len > end - start) {
                    start = i - (len - 1) / 2;
                    end = i + len / 2;
                }
            }
            return s.substring(start, end + 1);
        }

        private int expandAroundCenter(String s, int left, int right) {
            int L = left, R = right;
            while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
                L--;
                R++;
            }
            return R - L - 1;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
