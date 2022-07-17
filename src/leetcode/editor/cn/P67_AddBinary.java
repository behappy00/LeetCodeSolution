/*
  <p>Given two binary strings <code>a</code> and <code>b</code>, return <em>their sum as a binary string</em>.</p>

  <p>&nbsp;</p>
  <p><strong>Example 1:</strong></p>
  <pre><strong>Input:</strong> a = "11", b = "1"
  <strong>Output:</strong> "100"
  </pre><p><strong>Example 2:</strong></p>
  <pre><strong>Input:</strong> a = "1010", b = "1011"
  <strong>Output:</strong> "10101"
  </pre>
  <p>&nbsp;</p>
  <p><strong>Constraints:</strong></p>

  <ul>
  <li><code>1 &lt;= a.length, b.length &lt;= 10<sup>4</sup></code></li>
  <li><code>a</code> and <code>b</code> consist&nbsp;only of <code>&#39;0&#39;</code> or <code>&#39;1&#39;</code> characters.</li>
  <li>Each string does not contain leading zeros except for the zero itself.</li>
  </ul>
  <div><div>Related Topics</div><div><li>位运算</li><li>数学</li><li>字符串</li><li>模拟</li></div></div><br><div><li>👍 845</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * Add Binary
 *
 * @author WBJ
 * @date 2022-07-17 15:04:35
 */
public class P67_AddBinary {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P67_AddBinary().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            StringBuffer ans = new StringBuffer();

            int n = Math.max(a.length(), b.length()), carry = 0;
            for (int i = 0; i < n; ++i) {
                carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
                carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
                ans.append((char) (carry % 2 + '0'));
                carry /= 2;
            }

            if (carry > 0) {
                ans.append('1');
            }
            ans.reverse();

            return ans.toString();
        }

//        public String addBinary(String a, String b) {
//            return Integer.toBinaryString(
//                    Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
//            );
//        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
