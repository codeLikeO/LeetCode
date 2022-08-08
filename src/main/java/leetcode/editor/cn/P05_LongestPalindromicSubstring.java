//给你一个字符串 s，找到 s 中最长的回文子串。
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
//
// Related Topics 字符串 动态规划 👍 5538 👎 0


package leetcode.editor.cn;

public class P05_LongestPalindromicSubstring {

    public static void main(String[] args) {

        Solution solution = new P05_LongestPalindromicSubstring().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public String longestPalindrome(String s) {
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);
                String tempStr = s.substring(i);
                int lastIndex = tempStr.lastIndexOf(current);
                while (lastIndex >= 0) {
                    String substring = tempStr.substring(0, lastIndex + 1);
                    StringBuilder sb = new StringBuilder(substring);
                    if (substring.equals(sb.reverse().toString())) {
                        if (substring.length() > res.length()) {
                            res = substring;
                        }
                        break;
                    }
                    tempStr = tempStr.substring(0, lastIndex);
                    lastIndex = tempStr.lastIndexOf(current);
                }

            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}