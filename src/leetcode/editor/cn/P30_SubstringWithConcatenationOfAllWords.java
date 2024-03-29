/**
 * <p>You are given a string <code>s</code> and an array of strings <code>words</code> of <strong>the same length</strong>. Return&nbsp;all starting indices of substring(s) in <code>s</code>&nbsp;that is a concatenation of each word in <code>words</code> <strong>exactly once</strong>, <strong>in any order</strong>,&nbsp;and <strong>without any intervening characters</strong>.</p>
 *
 * <p>You can return the answer in <strong>any order</strong>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> s = &quot;barfoothefoobarman&quot;, words = [&quot;foo&quot;,&quot;bar&quot;]
 * <strong>Output:</strong> [0,9]
 * <strong>Explanation:</strong> Substrings starting at index 0 and 9 are &quot;barfoo&quot; and &quot;foobar&quot; respectively.
 * The output order does not matter, returning [9,0] is fine too.
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> s = &quot;wordgoodgoodgoodbestword&quot;, words = [&quot;word&quot;,&quot;good&quot;,&quot;best&quot;,&quot;word&quot;]
 * <strong>Output:</strong> []
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> s = &quot;barfoofoobarthefoobarman&quot;, words = [&quot;bar&quot;,&quot;foo&quot;,&quot;the&quot;]
 * <strong>Output:</strong> [6,9,12]
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
 * <li><code>s</code> consists of lower-case English letters.</li>
 * <li><code>1 &lt;= words.length &lt;= 5000</code></li>
 * <li><code>1 &lt;= words[i].length &lt;= 30</code></li>
 * <li><code>words[i]</code>&nbsp;consists of lower-case English letters.</li>
 * </ul>
 * <div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 781</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Substring with Concatenation of All Words
 *
 * @author WBJ
 * @date 2022-07-11 19:39:45
 */
public class P30_SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P30_SubstringWithConcatenationOfAllWords().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            int n = s.length(), m = words.length, w = words[0].length();
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
            List<Integer> ans = new ArrayList<>();
            out:
            for (int i = 0; i + m * w <= n; i++) {
                Map<String, Integer> cur = new HashMap<>();
                String sub = s.substring(i, i + m * w);
                for (int j = 0; j < sub.length(); j += w) {
                    String item = sub.substring(j, j + w);
                    if (!map.containsKey(item)) continue out;
                    cur.put(item, cur.getOrDefault(item, 0) + 1);
                }
                if (cur.equals(map)) ans.add(i);
            }
            return ans;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
