/*
  <p>Given an integer <code>numRows</code>, return the first numRows of <strong>Pascal&#39;s triangle</strong>.</p>

  <p>In <strong>Pascal&#39;s triangle</strong>, each number is the sum of the two numbers directly above it as shown:</p>
  <img alt="" src="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif" style="height:240px; width:260px" />
  <p>&nbsp;</p>
  <p><strong>Example 1:</strong></p>
  <pre><strong>Input:</strong> numRows = 5
  <strong>Output:</strong> [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
  </pre><p><strong>Example 2:</strong></p>
  <pre><strong>Input:</strong> numRows = 1
  <strong>Output:</strong> [[1]]
  </pre>
  <p>&nbsp;</p>
  <p><strong>Constraints:</strong></p>

  <ul>
  <li><code>1 &lt;= numRows &lt;= 30</code></li>
  </ul>
  <div><div>Related Topics</div><div><li>数组</li><li>动态规划</li></div></div><br><div><li>👍 790</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal's Triangle
 *
 * @author WBJ
 * @date 2022-07-17 21:09:15
 */
public class P118_PascalsTriangle {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P118_PascalsTriangle().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ret = new ArrayList<List<Integer>>();
            for (int i = 0; i < numRows; ++i) {
                List<Integer> row = new ArrayList<Integer>();
                for (int j = 0; j <= i; ++j) {
                    if (j == 0 || j == i) {
                        row.add(1);
                    } else {
                        row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                    }
                }
                ret.add(row);
            }
            return ret;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
