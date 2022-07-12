/**
 * <p>Implement <a href="http://www.cplusplus.com/reference/cstring/strstr/" target="_blank">strStr()</a>.</p>
 *
 * <p>Given two strings <code>needle</code> and <code>haystack</code>, return the index of the first occurrence of <code>needle</code> in <code>haystack</code>, or <code>-1</code> if <code>needle</code> is not part of <code>haystack</code>.</p>
 *
 * <p><strong>Clarification:</strong></p>
 *
 * <p>What should we return when <code>needle</code> is an empty string? This is a great question to ask during an interview.</p>
 *
 * <p>For the purpose of this problem, we will return 0 when <code>needle</code> is an empty string. This is consistent to C&#39;s <a href="http://www.cplusplus.com/reference/cstring/strstr/" target="_blank">strstr()</a> and Java&#39;s <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(java.lang.String)" target="_blank">indexOf()</a>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> haystack = &quot;hello&quot;, needle = &quot;ll&quot;
 * <strong>Output:</strong> 2
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> haystack = &quot;aaaaa&quot;, needle = &quot;bba&quot;
 * <strong>Output:</strong> -1
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= haystack.length, needle.length &lt;= 10<sup>4</sup></code></li>
 * <li><code>haystack</code> and <code>needle</code> consist of only lowercase English characters.</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>双指针</li><li>字符串</li><li>字符串匹配</li></div></div><br><div><li>👍 1486</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * Implement strStr()
 *
 * @author WBJ
 * @date 2022-07-09 23:57:56
 */
public class P28_ImplementStrstr {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P28_ImplementStrstr().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    //    KMP算法
    class Solution {
        public int strStr(String haystack, String needle) {
            int n = haystack.length(), m = needle.length();
            if (m == 0) {
                return 0;
            }
            int[] pi = new int[m];
            for (int i = 1, j = 0; i < m; i++) {
                while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                    j = pi[j - 1];
                }
                if (needle.charAt(i) == needle.charAt(j)) {
                    j++;
                }
                pi[i] = j;
            }
            for (int i = 0, j = 0; i < n; i++) {
                while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                    j = pi[j - 1];
                }
                if (haystack.charAt(i) == needle.charAt(j)) {
                    j++;
                }
                if (j == m) {
                    return i - m + 1;
                }
            }
            return -1;
        }
    }

//    暴力破解
//    class Solution {
//        public int strStr(String haystack, String needle) {
//
//            int n = haystack.length(), m = needle.length();
//            for (int i = 0; i + m <= n; i++) {
//                boolean flag = true;
//                for (int j = 0; j < m; j++) {
//                    if (haystack.charAt(i + j) != needle.charAt(j)) {
//                        flag = false;
//                        break;
//                    }
//                }
//                if (flag) {
//                    return i;
//                }
//            }
//            return -1;
//        }
//    }

//leetcode submit region end(Prohibit modification and deletion)

}
