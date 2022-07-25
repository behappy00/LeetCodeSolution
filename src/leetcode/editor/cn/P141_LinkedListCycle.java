/*
  <p>Given <code>head</code>, the head of a linked list, determine if the linked list has a cycle in it.</p>

  <p>There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the&nbsp;<code>next</code>&nbsp;pointer. Internally, <code>pos</code>&nbsp;is used to denote the index of the node that&nbsp;tail&#39;s&nbsp;<code>next</code>&nbsp;pointer is connected to.&nbsp;<strong>Note that&nbsp;<code>pos</code>&nbsp;is not passed as a parameter</strong>.</p>

  <p>Return&nbsp;<code>true</code><em> if there is a cycle in the linked list</em>. Otherwise, return <code>false</code>.</p>

  <p>&nbsp;</p>
  <p><strong>Example 1:</strong></p>
  <img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png" style="width: 300px; height: 97px; margin-top: 8px; margin-bottom: 8px;" />
  <pre>
  <strong>Input:</strong> head = [3,2,0,-4], pos = 1
  <strong>Output:</strong> true
  <strong>Explanation:</strong> There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
  </pre>

  <p><strong>Example 2:</strong></p>
  <img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png" style="width: 141px; height: 74px;" />
  <pre>
  <strong>Input:</strong> head = [1,2], pos = 0
  <strong>Output:</strong> true
  <strong>Explanation:</strong> There is a cycle in the linked list, where the tail connects to the 0th node.
  </pre>

  <p><strong>Example 3:</strong></p>
  <img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png" style="width: 45px; height: 45px;" />
  <pre>
  <strong>Input:</strong> head = [1], pos = -1
  <strong>Output:</strong> false
  <strong>Explanation:</strong> There is no cycle in the linked list.
  </pre>

  <p>&nbsp;</p>
  <p><strong>Constraints:</strong></p>

  <ul>
  <li>The number of the nodes in the list is in the range <code>[0, 10<sup>4</sup>]</code>.</li>
  <li><code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
  <li><code>pos</code> is <code>-1</code> or a <strong>valid index</strong> in the linked-list.</li>
  </ul>

  <p>&nbsp;</p>
  <p><strong>Follow up:</strong> Can you solve it using <code>O(1)</code> (i.e. constant) memory?</p>
  <div><div>Related Topics</div><div><li>哈希表</li><li>链表</li><li>双指针</li></div></div><br><div><li>👍 1553</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Linked List Cycle
 *
 * @author WBJ
 * @date 2022-07-24 21:19:27
 */
public class P141_LinkedListCycle {
	public static void main(String[] args) {
		//测试代码
		Solution solution = new P141_LinkedListCycle().new Solution();
	}

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 * int val;
	 * ListNode next;
	 * ListNode(int x) {
	 * val = x;
	 * next = null;
	 * }
	 * }
	 */
	public class Solution {
		public boolean hasCycle(ListNode head) {
//			方法一：哈希表
//			Set<ListNode> seen = new HashSet<ListNode>();
//			while (head != null) {
//				if (!seen.add(head)) {
//					return true;
//				}
//				head = head.next;
//			}
//			return false;

//			快慢指针
			if (head == null || head.next == null) {
				return false;
			}
			ListNode slow = head;
			ListNode fast = head.next;
			while (slow != fast) {
				if (fast == null || fast.next == null) {
					return false;
				}
				slow = slow.next;
				fast = fast.next.next;
			}
			return true;

		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}
