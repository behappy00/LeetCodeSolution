/**
 * <p>Given a string <code>s</code> consisting of words and spaces, return <em>the length of the <strong>last</strong> word in the string.</em></p>
 *
 * <p>A <strong>word</strong> is a maximal substring consisting of non-space characters only.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> s = &quot;Hello World&quot;
 * <strong>Output:</strong> 5
 * <strong>Explanation:</strong> The last word is &quot;World&quot; with length 5.
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> s = &quot;   fly me   to   the moon  &quot;
 * <strong>Output:</strong> 4
 * <strong>Explanation:</strong> The last word is &quot;moon&quot; with length 4.
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> s = &quot;luffy is still joyboy&quot;
 * <strong>Output:</strong> 6
 * <strong>Explanation:</strong> The last word is &quot;joyboy&quot; with length 6.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
 * <li><code>s</code> consists of only English letters and spaces <code>&#39; &#39;</code>.</li>
 * <li>There will be at least one word in <code>s</code>.</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>字符串</li></div></div><br><div><li>👍 472</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * Length of Last Word
 *
 * @author WBJ
 * @date 2022-07-16 22:33:35
 */
public class P58_LengthOfLastWord {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P58_LengthOfLastWord().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLastWord(String s) {
            int index = s.length() - 1;
            while (s.charAt(index) == ' ') {
                index--;
            }
            int wordLength = 0;
            while (index >= 0 && s.charAt(index) != ' ') {
                wordLength++;
                index--;
            }
            return wordLength;

//            System.out.println(s.trim());
//            int n = s.trim().length();
//			System.out.println(n);
//            int count = 0;
//            for (int i = 0; i < n; i++) {
//                if (s.charAt(i) != ' ') {
//                    count++;
//                } else {
//                    if (s.charAt(i + 1) >= 'a' && s.charAt(i + 1) <= 'z' || s.charAt(i + 1) >= 'A' && s.charAt(i + 1) <= 'Z') {
//                        count = 0;
//                    }
//                }
//            }
//            return count;

        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
