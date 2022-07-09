//<p>You are given the heads of two sorted linked lists <code>list1</code> and <code>list2</code>.</p>
//
//<p>Merge the two lists in a one <strong>sorted</strong> list. The list should be made by splicing together the nodes of the first two lists.</p>
//
//<p>Return <em>the head of the merged linked list</em>.</p>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//<img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg" style="width: 662px; height: 302px;" />
//<pre>
//<strong>Input:</strong> list1 = [1,2,4], list2 = [1,3,4]
//<strong>Output:</strong> [1,1,2,3,4,4]
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> list1 = [], list2 = []
//<strong>Output:</strong> []
//</pre>
//
//<p><strong>Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> list1 = [], list2 = [0]
//<strong>Output:</strong> [0]
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li>The number of nodes in both lists is in the range <code>[0, 50]</code>.</li>
//	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
//	<li>Both <code>list1</code> and <code>list2</code> are sorted in <strong>non-decreasing</strong> order.</li>
//</ul>
//<div><div>Related Topics</div><div><li>递归</li><li>链表</li></div></div><br><div><li>👍 2516</li><li>👎 0</li></div>

package leetcode.editor.cn;

import utils.ListNode;

/**
 * Merge Two Sorted Lists
 * @author WBJ
 * @date 2022-07-09 23:23:00
 */
public class P21_MergeTwoSortedLists{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P21_MergeTwoSortedLists().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode prehead = new ListNode(-1);

		ListNode prev = prehead;
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				prev.next = list1;
				list1 = list1.next;
			} else {
				prev.next = list2;
				list2 = list2.next;
			}
			prev = prev.next;
		}

		// 合并后 list1 和 list2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
		prev.next = list1 == null ? list2 : list1;

		return prehead.next;
	}
}


//leetcode submit region end(Prohibit modification and deletion)

}
