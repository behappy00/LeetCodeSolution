/**
 * <p>Determine if a&nbsp;<code>9 x 9</code> Sudoku board&nbsp;is valid.&nbsp;Only the filled cells need to be validated&nbsp;<strong>according to the following rules</strong>:</p>
 *
 * <ol>
 * <li>Each row&nbsp;must contain the&nbsp;digits&nbsp;<code>1-9</code> without repetition.</li>
 * <li>Each column must contain the digits&nbsp;<code>1-9</code>&nbsp;without repetition.</li>
 * <li>Each of the nine&nbsp;<code>3 x 3</code> sub-boxes of the grid must contain the digits&nbsp;<code>1-9</code>&nbsp;without repetition.</li>
 * </ol>
 *
 * <p><strong>Note:</strong></p>
 *
 * <ul>
 * <li>A Sudoku board (partially filled) could be valid but is not necessarily solvable.</li>
 * <li>Only the filled cells need to be validated according to the mentioned&nbsp;rules.</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png" style="height:250px; width:250px" />
 * <pre>
 * <strong>Input:</strong> board =
 * [[&quot;5&quot;,&quot;3&quot;,&quot;.&quot;,&quot;.&quot;,&quot;7&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;]
 * ,[&quot;6&quot;,&quot;.&quot;,&quot;.&quot;,&quot;1&quot;,&quot;9&quot;,&quot;5&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;]
 * ,[&quot;.&quot;,&quot;9&quot;,&quot;8&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;6&quot;,&quot;.&quot;]
 * ,[&quot;8&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;6&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;3&quot;]
 * ,[&quot;4&quot;,&quot;.&quot;,&quot;.&quot;,&quot;8&quot;,&quot;.&quot;,&quot;3&quot;,&quot;.&quot;,&quot;.&quot;,&quot;1&quot;]
 * ,[&quot;7&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;2&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;6&quot;]
 * ,[&quot;.&quot;,&quot;6&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;2&quot;,&quot;8&quot;,&quot;.&quot;]
 * ,[&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;4&quot;,&quot;1&quot;,&quot;9&quot;,&quot;.&quot;,&quot;.&quot;,&quot;5&quot;]
 * ,[&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;8&quot;,&quot;.&quot;,&quot;.&quot;,&quot;7&quot;,&quot;9&quot;]]
 * <strong>Output:</strong> true
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> board =
 * [[&quot;8&quot;,&quot;3&quot;,&quot;.&quot;,&quot;.&quot;,&quot;7&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;]
 * ,[&quot;6&quot;,&quot;.&quot;,&quot;.&quot;,&quot;1&quot;,&quot;9&quot;,&quot;5&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;]
 * ,[&quot;.&quot;,&quot;9&quot;,&quot;8&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;6&quot;,&quot;.&quot;]
 * ,[&quot;8&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;6&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;3&quot;]
 * ,[&quot;4&quot;,&quot;.&quot;,&quot;.&quot;,&quot;8&quot;,&quot;.&quot;,&quot;3&quot;,&quot;.&quot;,&quot;.&quot;,&quot;1&quot;]
 * ,[&quot;7&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;2&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;6&quot;]
 * ,[&quot;.&quot;,&quot;6&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;2&quot;,&quot;8&quot;,&quot;.&quot;]
 * ,[&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;4&quot;,&quot;1&quot;,&quot;9&quot;,&quot;.&quot;,&quot;.&quot;,&quot;5&quot;]
 * ,[&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;.&quot;,&quot;8&quot;,&quot;.&quot;,&quot;.&quot;,&quot;7&quot;,&quot;9&quot;]]
 * <strong>Output:</strong> false
 * <strong>Explanation:</strong> Same as Example 1, except with the <strong>5</strong> in the top left corner being modified to <strong>8</strong>. Since there are two 8&#39;s in the top left 3x3 sub-box, it is invalid.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>board.length == 9</code></li>
 * <li><code>board[i].length == 9</code></li>
 * <li><code>board[i][j]</code> is a digit <code>1-9</code> or <code>&#39;.&#39;</code>.</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>数组</li><li>哈希表</li><li>矩阵</li></div></div><br><div><li>👍 917</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

/**
 * Valid Sudoku
 *
 * @author WBJ
 * @date 2022-07-12 21:07:22
 */
public class P36_ValidSudoku {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P36_ValidSudoku().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            // 记录某行，某位数字是否已经被摆放
            boolean[][] row = new boolean[9][9];
            // 记录某列，某位数字是否已经被摆放
            boolean[][] col = new boolean[9][9];
            // 记录某 3x3 宫格内，某位数字是否已经被摆放
            boolean[][] block = new boolean[9][9];

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '.') {
                        int num = board[i][j] - '1';
                        int blockIndex = i / 3 * 3 + j / 3;
                        if (row[i][num] || col[j][num] || block[blockIndex][num]) {
                            return false;
                        } else {
                            row[i][num] = true;
                            col[j][num] = true;
                            block[blockIndex][num] = true;
                        }
                    }
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
