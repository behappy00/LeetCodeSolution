//<p>The string <code>&quot;PAYPALISHIRING&quot;</code> is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)</p>
//
//<pre>
//P   A   H   N
//A P L S I I G
//Y   I   R
//</pre>
//
//<p>And then read line by line: <code>&quot;PAHNAPLSIIGYIR&quot;</code></p>
//
//<p>Write the code that will take a string and make this conversion given a number of rows:</p>
//
//<pre>
//string convert(string s, int numRows);
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;PAYPALISHIRING&quot;, numRows = 3
//<strong>Output:</strong> &quot;PAHNAPLSIIGYIR&quot;
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;PAYPALISHIRING&quot;, numRows = 4
//<strong>Output:</strong> &quot;PINALSIGYAHRPI&quot;
//<strong>Explanation:</strong>
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
//</pre>
//
//<p><strong>Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;A&quot;, numRows = 1
//<strong>Output:</strong> &quot;A&quot;
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li><code>1 &lt;= s.length &lt;= 1000</code></li>
//	<li><code>s</code> consists of English letters (lower-case and upper-case), <code>&#39;,&#39;</code> and <code>&#39;.&#39;</code>.</li>
//	<li><code>1 &lt;= numRows &lt;= 1000</code></li>
//</ul>
//<div><div>Related Topics</div><div><li>字符串</li></div></div><br><div><li>👍 1726</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * ZigZag Conversion
 *
 * @author WBJ
 * @date 2022-07-09 23:03:34
 */
public class P6_ZigzagConversion {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P6_ZigzagConversion().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convert(String s, int numRows) {
            int n = s.length(), r = numRows;
            if (r == 1 || r >= n) {
                return s;
            }
            int t = r * 2 - 2;
            int c = (n + t - 1) / t * (r - 1);
            char[][] mat = new char[r][c];
            for (int i = 0, x = 0, y = 0; i < n; ++i) {
                mat[x][y] = s.charAt(i);
                if (i % t < r - 1) {
                    ++x; // 向下移动
                } else {
                    --x;
                    ++y; // 向右上移动
                }
            }
            StringBuffer ans = new StringBuffer();
            for (char[] row : mat) {
                for (char ch : row) {
                    if (ch != 0) {
                        ans.append(ch);
                    }
                }
            }
            return ans.toString();
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
