//<p>Write a function to find the longest common prefix string amongst an array of strings.</p>
//
//<p>If there is no common prefix, return an empty string <code>&quot;&quot;</code>.</p>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> strs = [&quot;flower&quot;,&quot;flow&quot;,&quot;flight&quot;]
//<strong>Output:</strong> &quot;fl&quot;
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> strs = [&quot;dog&quot;,&quot;racecar&quot;,&quot;car&quot;]
//<strong>Output:</strong> &quot;&quot;
//<strong>Explanation:</strong> There is no common prefix among the input strings.
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li><code>1 &lt;= strs.length &lt;= 200</code></li>
//	<li><code>0 &lt;= strs[i].length &lt;= 200</code></li>
//	<li><code>strs[i]</code> consists of only lowercase English letters.</li>
//</ul>
//<div><div>Related Topics</div><div><li>字符串</li></div></div><br><div><li>👍 2329</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Longest Common Prefix
 *
 * @author WBJ
 * @date 2022-07-09 23:03:39
 */
public class P14_LongestCommonPrefix {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P14_LongestCommonPrefix().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            String prefix = strs[0];
            int count = strs.length;
            for (int i = 1; i < count; i++) {
                prefix = longestCommonPrefix(prefix, strs[i]);
                if (prefix.length() == 0) {
                    break;
                }
            }
            return prefix;
        }

        public String longestCommonPrefix(String str1, String str2) {
            int length = Math.min(str1.length(), str2.length());
            int index = 0;
            while (index < length && str1.charAt(index) == str2.charAt(index)) {
                index++;
            }
            return str1.substring(0, index);
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
