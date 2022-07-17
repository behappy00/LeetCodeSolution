package leetcode.editor.cn.test;

public class P66_PlusOne_test {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        plusOne(digits);
//        for (int i = 0; i < n; i++) {
//            System.out.println(res[i]);
//        }

    }

    public static int[] plusOne(int[] digits) {
//			倒序，从最后一位进行计算
        int n = digits.length;
        int[] res = new int[n + 1];
        if (digits[0] == '0') {
            res[0] += 1;
            return res;
        } else {
            int carry = 0;
            for (int i = n - 1; i >= 0; i--) {
                int temp;
                if (i == n - 1) {
                    temp = digits[i] + 1 + carry;
                } else {
                    temp = digits[i] + carry;
                }

                carry = temp / 10;
                res[n - i - 1] = temp % 10;

                System.out.println(res[n - i - 1]);
            }
        }
        return res;
    }

}
