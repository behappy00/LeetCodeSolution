//<p>You are given two <strong>non-empty</strong> linked lists representing two non-negative integers. The digits are stored in <strong>reverse order</strong>, and each of their nodes contains a single digit. Add the two numbers and return the sum&nbsp;as a linked list.</p>
//
//<p>You may assume the two numbers do not contain any leading zero, except the number 0 itself.</p>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//<img alt="" src="https://assets.leetcode.com/uploads/2020/10/02/addtwonumber1.jpg" style="width: 483px; height: 342px;" />
//<pre>
//<strong>Input:</strong> l1 = [2,4,3], l2 = [5,6,4]
//<strong>Output:</strong> [7,0,8]
//<strong>Explanation:</strong> 342 + 465 = 807.
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> l1 = [0], l2 = [0]
//<strong>Output:</strong> [0]
//</pre>
//
//<p><strong>Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//<strong>Output:</strong> [8,9,9,9,0,0,0,1]
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li>The number of nodes in each linked list is in the range <code>[1, 100]</code>.</li>
//	<li><code>0 &lt;= Node.val &lt;= 9</code></li>
//	<li>It is guaranteed that the list represents a number that does not have leading zeros.</li>
//</ul>
//<div><div>Related Topics</div><div><li>递归</li><li>链表</li><li>数学</li></div></div><br><div><li>👍 8302</li><li>👎 0</li></div>

package leetcode.editor.cn;

import utils.ListNode;

/**
 * Add Two Numbers
 *
 * @author WBJ
 * @date 2022-07-09 23:03:28
 */
public class P2_AddTwoNumbers {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P2_AddTwoNumbers().new Solution();
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

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            // carry 进位
            ListNode head = null, tail = null;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int n1 = l1 != null ? l1.val : 0;
                int n2 = l2 != null ? l2.val : 0;
                int sum = n1 + n2 + carry;
                if (head == null) {
                    head = tail = new ListNode(sum % 10);
                } else {
                    tail.next = new ListNode(sum % 10);
                    tail = tail.next;
                }
                carry = sum / 10;
                l1 = l1 != null ? l1.next : l1;
                l2 = l2 != null ? l2.next : l2;
                if (carry > 0) {
                    tail.next = new ListNode(carry);
                }
            }
            return head;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
