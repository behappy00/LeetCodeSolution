/**
 * <p>Given the <code>head</code> of a linked list, reverse the nodes of the list <code>k</code> at a time, and return <em>the modified list</em>.</p>
 *
 * <p><code>k</code> is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of <code>k</code> then left-out nodes, in the end, should remain as it is.</p>
 *
 * <p>You may not alter the values in the list&#39;s nodes, only nodes themselves may be changed.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/reverse_ex1.jpg" style="width: 542px; height: 222px;" />
 * <pre>
 * <strong>Input:</strong> head = [1,2,3,4,5], k = 2
 * <strong>Output:</strong> [2,1,4,3,5]
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/reverse_ex2.jpg" style="width: 542px; height: 222px;" />
 * <pre>
 * <strong>Input:</strong> head = [1,2,3,4,5], k = 3
 * <strong>Output:</strong> [3,2,1,4,5]
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li>The number of nodes in the list is <code>n</code>.</li>
 * <li><code>1 &lt;= k &lt;= n &lt;= 5000</code></li>
 * <li><code>0 &lt;= Node.val &lt;= 1000</code></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 * <p><strong>Follow-up:</strong> Can you solve the problem in <code>O(1)</code> extra memory space?</p>
 * <div><div>Related Topics</div><div><li>递归</li><li>链表</li></div></div><br><div><li>👍 1714</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import utils.ListNode;

/**
 * Reverse Nodes in k-Group
 *
 * @author WBJ
 * @date 2022-07-09 23:57:53
 */
public class P25_ReverseNodesInKGroup {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P25_ReverseNodesInKGroup().new Solution();
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
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode hair = new ListNode(0);
            hair.next = head;
            ListNode pre = hair;

            while (head != null) {
                ListNode tail = pre;
                // 查看剩余部分长度是否大于等于 k
                for (int i = 0; i < k; ++i) {
                    tail = tail.next;
                    if (tail == null) {
                        return hair.next;
                    }
                }
                ListNode nex = tail.next;
                ListNode[] reverse = myReverse(head, tail);
                head = reverse[0];
                tail = reverse[1];
                // 把子链表重新接回原链表
                pre.next = head;
                tail.next = nex;
                pre = tail;
                head = tail.next;
            }

            return hair.next;
        }

        public ListNode[] myReverse(ListNode head, ListNode tail) {
            ListNode prev = tail.next;
            ListNode p = head;
            while (prev != tail) {
                ListNode nex = p.next;
                p.next = prev;
                prev = p;
                p = nex;
            }
            return new ListNode[]{tail, head};
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
