package leetcode.editor.cn;

/**
 * <p>Given a string <code>columnTitle</code> that represents the column title as appears in an Excel sheet, return <em>its corresponding column number</em>.</p>
 *
 * <p>For example:</p>
 *
 * <pre>
 * A -&gt; 1
 * B -&gt; 2
 * C -&gt; 3
 * ...
 * Z -&gt; 26
 * AA -&gt; 27
 * AB -&gt; 28
 * ...
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> columnTitle = &quot;A&quot;
 * <strong>Output:</strong> 1
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> columnTitle = &quot;AB&quot;
 * <strong>Output:</strong> 28
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> columnTitle = &quot;ZY&quot;
 * <strong>Output:</strong> 701
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= columnTitle.length &lt;= 7</code></li>
 * <li><code>columnTitle</code> consists only of uppercase English letters.</li>
 * <li><code>columnTitle</code> is in the range <code>[&quot;A&quot;, &quot;FXSHRXW&quot;]</code>.</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数学</li><li>字符串</li></div></div><br><div><li>👍 341</li><li>👎 0</li></div>
 */

/**
 * Excel Sheet Column Number
 *
 * @author WBJ
 * @date 2022-08-04 10:02:12
 */
public class P171_ExcelSheetColumnNumber {
	public static void main(String[] args) {
		//测试代码
		Solution solution = new P171_ExcelSheetColumnNumber().new Solution();
	}

	//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public int titleToNumber(String columnTitle) {
			int len = columnTitle.length();
			int res = 0;

			for (int i = 0; i < columnTitle.length(); i++) {
				res += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, len - 1);
				len--;
			}
			return res;
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}
