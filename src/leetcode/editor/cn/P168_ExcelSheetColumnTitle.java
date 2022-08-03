package leetcode.editor.cn;

/*
<p>Given an integer <code>columnNumber</code>, return <em>its corresponding column title as it appears in an Excel sheet</em>.</p>

<p>For example:</p>

<pre>
A -&gt; 1
B -&gt; 2
C -&gt; 3
...
Z -&gt; 26
AA -&gt; 27
AB -&gt; 28 
...
</pre>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> columnNumber = 1
<strong>Output:</strong> &quot;A&quot;
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> columnNumber = 28
<strong>Output:</strong> &quot;AB&quot;
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> columnNumber = 701
<strong>Output:</strong> &quot;ZY&quot;
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= columnNumber &lt;= 2<sup>31</sup> - 1</code></li>
</ul>
<div><div>Related Topics</div><div><li>数学</li><li>字符串</li></div></div><br><div><li>👍 547</li><li>👎 0</li></div>
*/

/**
 * Excel Sheet Column Title
 *
 * @author WBJ
 * @date 2022-08-03 14:29:22
 */
public class P168_ExcelSheetColumnTitle {
	public static void main(String[] args) {
		//测试代码
		Solution solution = new P168_ExcelSheetColumnTitle().new Solution();
	}

	//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public String convertToTitle(int columnNumber) {
			StringBuffer sb = new StringBuffer();
			while (columnNumber > 0) {
				int a0 = (columnNumber - 1) % 26 + 1;
				sb.append((char) (a0 - 1 + 'A'));
				columnNumber = (columnNumber - a0) / 26;
			}
			return sb.reverse().toString();

		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}
