//<p>Implement the <code>myAtoi(string s)</code> function, which converts a string to a 32-bit signed integer (similar to C/C++&#39;s <code>atoi</code> function).</p>
//
//<p>The algorithm for <code>myAtoi(string s)</code> is as follows:</p>
//
//<ol>
//	<li>Read in and ignore any leading whitespace.</li>
//	<li>Check if the next character (if not already at the end of the string) is <code>&#39;-&#39;</code> or <code>&#39;+&#39;</code>. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.</li>
//	<li>Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.</li>
//	<li>Convert these digits into an integer (i.e. <code>&quot;123&quot; -&gt; 123</code>, <code>&quot;0032&quot; -&gt; 32</code>). If no digits were read, then the integer is <code>0</code>. Change the sign as necessary (from step 2).</li>
//	<li>If the integer is out of the 32-bit signed integer range <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>, then clamp the integer so that it remains in the range. Specifically, integers less than <code>-2<sup>31</sup></code> should be clamped to <code>-2<sup>31</sup></code>, and integers greater than <code>2<sup>31</sup> - 1</code> should be clamped to <code>2<sup>31</sup> - 1</code>.</li>
//	<li>Return the integer as the final result.</li>
//</ol>
//
//<p><strong>Note:</strong></p>
//
//<ul>
//	<li>Only the space character <code>&#39; &#39;</code> is considered a whitespace character.</li>
//	<li><strong>Do not ignore</strong> any characters other than the leading whitespace or the rest of the string after the digits.</li>
//</ul>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;42&quot;
//<strong>Output:</strong> 42
//<strong>Explanation:</strong> The underlined characters are what is read in, the caret is the current reader position.
//Step 1: &quot;42&quot; (no characters read because there is no leading whitespace)
//         ^
//Step 2: &quot;42&quot; (no characters read because there is neither a &#39;-&#39; nor &#39;+&#39;)
//         ^
//Step 3: &quot;<u>42</u>&quot; (&quot;42&quot; is read in)
//           ^
//The parsed integer is 42.
//Since 42 is in the range [-2<sup>31</sup>, 2<sup>31</sup> - 1], the final result is 42.
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;   -42&quot;
//<strong>Output:</strong> -42
//<strong>Explanation:</strong>
//Step 1: &quot;<u>   </u>-42&quot; (leading whitespace is read and ignored)
//            ^
//Step 2: &quot;   <u>-</u>42&quot; (&#39;-&#39; is read, so the result should be negative)
//             ^
//Step 3: &quot;   -<u>42</u>&quot; (&quot;42&quot; is read in)
//               ^
//The parsed integer is -42.
//Since -42 is in the range [-2<sup>31</sup>, 2<sup>31</sup> - 1], the final result is -42.
//</pre>
//
//<p><strong>Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> s = &quot;4193 with words&quot;
//<strong>Output:</strong> 4193
//<strong>Explanation:</strong>
//Step 1: &quot;4193 with words&quot; (no characters read because there is no leading whitespace)
//         ^
//Step 2: &quot;4193 with words&quot; (no characters read because there is neither a &#39;-&#39; nor &#39;+&#39;)
//         ^
//Step 3: &quot;<u>4193</u> with words&quot; (&quot;4193&quot; is read in; reading stops because the next character is a non-digit)
//             ^
//The parsed integer is 4193.
//Since 4193 is in the range [-2<sup>31</sup>, 2<sup>31</sup> - 1], the final result is 4193.
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li><code>0 &lt;= s.length &lt;= 200</code></li>
//	<li><code>s</code> consists of English letters (lower-case and upper-case), digits (<code>0-9</code>), <code>&#39; &#39;</code>, <code>&#39;+&#39;</code>, <code>&#39;-&#39;</code>, and <code>&#39;.&#39;</code>.</li>
//</ul>
//<div><div>Related Topics</div><div><li>字符串</li></div></div><br><div><li>👍 1462</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * String to Integer (atoi)
 *
 * @author WBJ
 * @date 2022-07-09 23:03:35
 */
public class P8_StringToIntegerAtoi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P8_StringToIntegerAtoi().new Solution();
    }

    //力扣代码
    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {

        public int myAtoi(String str) {
            int len = str.length();
            // str.charAt(i) 方法回去检查下标的合法性，一般先转换成字符数组
            char[] charArray = str.toCharArray();

            // 1、去除前导空格
            int index = 0;
            while (index < len && charArray[index] == ' ') {
                index++;
            }

            // 2、如果已经遍历完成（针对极端用例 "      "）
            if (index == len) {
                return 0;
            }

            // 3、如果出现符号字符，仅第 1 个有效，并记录正负
            int sign = 1;
            char firstChar = charArray[index];
            if (firstChar == '+') {
                index++;
            } else if (firstChar == '-') {
                index++;
                sign = -1;
            }

            // 4、将后续出现的数字字符进行转换
            // 不能使用 long 类型，这是题目说的
            int res = 0;
            while (index < len) {
                char currChar = charArray[index];
                // 4.1 先判断不合法的情况
                if (currChar > '9' || currChar < '0') {
                    break;
                }

                // 题目中说：环境只能存储 32 位大小的有符号整数，因此，需要提前判：断乘以 10 以后是否越界
                if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                    return Integer.MAX_VALUE;
                }
                if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                    return Integer.MIN_VALUE;
                }

                // 4.2 合法的情况下，才考虑转换，每一步都把符号位乘进去
                res = res * 10 + sign * (currChar - '0');
                index++;
            }
            return res;
        }

    }

//    方法一：自动机的思想
//    class Solution {
//        public int myAtoi(String str) {
//            Automaton automaton = new Automaton();
//            int length = str.length();
//            for (int i = 0; i < length; ++i) {
//                automaton.get(str.charAt(i));
//            }
//            return (int) (automaton.sign * automaton.ans);
//        }
//    }
//
//    class Automaton {
//        public int sign = 1;
//        public long ans = 0;
//        private String state = "start";
//        private Map<String, String[]> table = new HashMap<String, String[]>() {{
//            put("start", new String[]{"start", "signed", "in_number", "end"});
//            put("signed", new String[]{"end", "end", "in_number", "end"});
//            put("in_number", new String[]{"end", "end", "in_number", "end"});
//            put("end", new String[]{"end", "end", "end", "end"});
//        }};
//
//        public void get(char c) {
//            state = table.get(state)[get_col(c)];
//            if ("in_number".equals(state)) {
//                ans = ans * 10 + c - '0';
//                ans = sign == 1 ? Math.min(ans, (long) Integer.MAX_VALUE) : Math.min(ans, -(long) Integer.MIN_VALUE);
//            } else if ("signed".equals(state)) {
//                sign = c == '+' ? 1 : -1;
//            }
//        }
//
//        private int get_col(char c) {
//            if (c == ' ') {
//                return 0;
//            }
//            if (c == '+' || c == '-') {
//                return 1;
//            }
//            if (Character.isDigit(c)) {
//                return 2;
//            }
//            return 3;
//        }
//    }

//leetcode submit region end(Prohibit modification and deletion)

}
