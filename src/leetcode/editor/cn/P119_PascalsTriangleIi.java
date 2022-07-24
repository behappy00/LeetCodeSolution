/*
  <p>Given an integer <code>rowIndex</code>, return the <code>rowIndex<sup>th</sup></code> (<strong>0-indexed</strong>) row of the <strong>Pascal&#39;s triangle</strong>.</p>

  <p>In <strong>Pascal&#39;s triangle</strong>, each number is the sum of the two numbers directly above it as shown:</p>
  <img alt="" src="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif" style="height:240px; width:260px" />
  <p>&nbsp;</p>
  <p><strong>Example 1:</strong></p>
  <pre><strong>Input:</strong> rowIndex = 3
  <strong>Output:</strong> [1,3,3,1]
  </pre><p><strong>Example 2:</strong></p>
  <pre><strong>Input:</strong> rowIndex = 0
  <strong>Output:</strong> [1]
  </pre><p><strong>Example 3:</strong></p>
  <pre><strong>Input:</strong> rowIndex = 1
  <strong>Output:</strong> [1,1]
  </pre>
  <p>&nbsp;</p>
  <p><strong>Constraints:</strong></p>

  <ul>
  <li><code>0 &lt;= rowIndex &lt;= 33</code></li>
  </ul>

  <p>&nbsp;</p>
  <p><strong>Follow up:</strong> Could you optimize your algorithm to use only <code>O(rowIndex)</code> extra space?</p>
  <div><div>Related Topics</div><div><li>数组</li><li>动态规划</li></div></div><br><div><li>👍 412</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal's Triangle II
 *
 * @author WBJ
 * @date 2022-07-17 21:09:17
 */
public class P119_PascalsTriangleIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P119_PascalsTriangleIi().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            for (int i = 0; i <= rowIndex; ++i) {
                List<Integer> row = new ArrayList<Integer>();
                for (int j = 0; j <= i; ++j) {
                    if (j == 0 || j == i) {
                        row.add(1);
                    } else {
                        row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                    }
                }
                ans.add(row);
            }
            return ans.get(rowIndex);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
