/**
 * <p>Given a&nbsp;linked list, swap every two adjacent nodes and return its head. You must solve the problem without&nbsp;modifying the values in the list&#39;s nodes (i.e., only nodes themselves may be changed.)</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/swap_ex1.jpg" style="width: 422px; height: 222px;" />
 * <pre>
 * <strong>Input:</strong> head = [1,2,3,4]
 * <strong>Output:</strong> [2,1,4,3]
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> head = []
 * <strong>Output:</strong> []
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre>
 * <strong>Input:</strong> head = [1]
 * <strong>Output:</strong> [1]
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li>The number of nodes in the&nbsp;list&nbsp;is in the range <code>[0, 100]</code>.</li>
 * <li><code>0 &lt;= Node.val &lt;= 100</code></li>
 * </ul>
 * <div><div>Related Topics</div><div><li>递归</li><li>链表</li></div></div><br><div><li>👍 1453</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import utils.ListNode;

/**
 * Swap Nodes in Pairs
 *
 * @author WBJ
 * @date 2022-07-09 23:57:52
 */
public class P24_SwapNodesInPairs {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P24_SwapNodesInPairs().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode newHead = head.next;
            head.next = swapPairs(newHead.next);
            newHead.next = head;
            return newHead;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
