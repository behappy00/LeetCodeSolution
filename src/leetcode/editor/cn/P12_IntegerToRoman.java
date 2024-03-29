//<p>Roman numerals are represented by seven different symbols:&nbsp;<code>I</code>, <code>V</code>, <code>X</code>, <code>L</code>, <code>C</code>, <code>D</code> and <code>M</code>.</p>
//
//<pre>
//<strong>Symbol</strong>       <strong>Value</strong>
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000</pre>
//
//<p>For example,&nbsp;<code>2</code> is written as <code>II</code>&nbsp;in Roman numeral, just two one&#39;s added together. <code>12</code> is written as&nbsp;<code>XII</code>, which is simply <code>X + II</code>. The number <code>27</code> is written as <code>XXVII</code>, which is <code>XX + V + II</code>.</p>
//
//<p>Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not <code>IIII</code>. Instead, the number four is written as <code>IV</code>. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as <code>IX</code>. There are six instances where subtraction is used:</p>
//
//<ul>
//	<li><code>I</code> can be placed before <code>V</code> (5) and <code>X</code> (10) to make 4 and 9.&nbsp;</li>
//	<li><code>X</code> can be placed before <code>L</code> (50) and <code>C</code> (100) to make 40 and 90.&nbsp;</li>
//	<li><code>C</code> can be placed before <code>D</code> (500) and <code>M</code> (1000) to make 400 and 900.</li>
//</ul>
//
//<p>Given an integer, convert it to a roman numeral.</p>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> num = 3
//<strong>Output:</strong> &quot;III&quot;
//<strong>Explanation:</strong> 3 is represented as 3 ones.
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> num = 58
//<strong>Output:</strong> &quot;LVIII&quot;
//<strong>Explanation:</strong> L = 50, V = 5, III = 3.
//</pre>
//
//<p><strong>Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> num = 1994
//<strong>Output:</strong> &quot;MCMXCIV&quot;
//<strong>Explanation:</strong> M = 1000, CM = 900, XC = 90 and IV = 4.
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li><code>1 &lt;= num &lt;= 3999</code></li>
//</ul>
//<div><div>Related Topics</div><div><li>哈希表</li><li>数学</li><li>字符串</li></div></div><br><div><li>👍 909</li><li>👎 0</li></div>

package leetcode.editor.cn;

/**
 * Integer to Roman
 *
 * @author WBJ
 * @date 2022-07-09 23:27:06
 */
public class P12_IntegerToRoman {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P12_IntegerToRoman().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

//        Symbol Value
//        I 1
//        V 5
//        X 10
//        L 50
//        C 100
//        D 500
//        M 1000


        public String intToRoman(int num) {
            StringBuffer roman = new StringBuffer();
            for (int i = 0; i < values.length; ++i) {
                int value = values[i];
                String symbol = symbols[i];
                while (num >= value) {
                    num -= value;
                    roman.append(symbol);
                }
                if (num == 0) {
                    break;
                }
            }
            return roman.toString();
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
