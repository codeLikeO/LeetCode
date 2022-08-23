//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−2³¹, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// Related Topics 数学 👍 3600 👎 0


package leetcode.editor.cn;

public class P07_ReverseInteger {

    public static void main(String[] args) {
        Solution solution = new P07_ReverseInteger().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int reverse(int x) {
            if (x / 10 == 0) {
                return x;
            }

            String s = String.valueOf(x);

            boolean hasZero = true;
            StringBuilder resTemp = new StringBuilder();
            if ("-".equals(String.valueOf(s.charAt(0)))) {
                s = s.substring(1);
                resTemp.append("-");
            }

            for (int length = s.length(); length > 0; length--) {
                if ((int) s.charAt(length - 1) == 0 && hasZero) {
                    continue;
                }
                hasZero = false;
                resTemp.append(s.charAt(length - 1));
            }

            long aLong = Long.parseLong(resTemp.toString());

            if (aLong >= Integer.MAX_VALUE || aLong <= Integer.MIN_VALUE) {
                return 0;
            }

            return (int) aLong;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}