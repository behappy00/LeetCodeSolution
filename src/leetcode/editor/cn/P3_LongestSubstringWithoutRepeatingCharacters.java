//<p>Given a string <code>s</code>, find the length of the <strong>longest substring</strong> without repeating characters.</p>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;abcabcbb&quot;
//<strong>Output:</strong> 3
//<strong>Explanation:</strong> The answer is &quot;abc&quot;, with the length of 3.
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;bbbbb&quot;
//<strong>Output:</strong> 1
//<strong>Explanation:</strong> The answer is &quot;b&quot;, with the length of 1.
//</pre>
//
//<p><strong>Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;pwwkew&quot;
//<strong>Output:</strong> 3
//<strong>Explanation:</strong> The answer is &quot;wke&quot;, with the length of 3.
//Notice that the answer must be a substring, &quot;pwke&quot; is a subsequence and not a substring.
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li><code>0 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
//	<li><code>s</code> consists of English letters, digits, symbols and spaces.</li>
//</ul>
//<div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 7792</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Longest Substring Without Repeating Characters
 *
 * @author WBJ
 * @date 2022-07-09 23:03:31
 */
public class P3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P3_LongestSubstringWithoutRepeatingCharacters().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int i = 0;
            int flag = 0;
            int length = 0;
            int result = 0;
            while (i < s.length()) {
                int pos = s.indexOf(s.charAt(i), flag);
                if (pos < i) {
                    if (length > result) {
                        result = length;
                    }
                    if (result >= s.length() - pos - 1) {
                        return result;
                    }
                    length = i - pos - 1;
                    flag = pos + 1;
                }
                length++;
                i++;
            }
            return length;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
