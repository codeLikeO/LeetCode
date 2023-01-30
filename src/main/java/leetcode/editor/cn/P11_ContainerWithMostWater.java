//给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
//
// 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。 
//
// 返回容器可以储存的最大水量。 
//
// 说明：你不能倾斜容器。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：[1,8,6,2,5,4,8,3,7]
//输出：49 
//解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。 
//
// 示例 2： 
//
// 
//输入：height = [1,1]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// n == height.length 
// 2 <= n <= 10⁵ 
// 0 <= height[i] <= 10⁴ 
// 
//
// Related Topics 贪心 数组 双指针 👍 4040 👎 0


package leetcode.editor.cn;

public class P11_ContainerWithMostWater {

    public static void main(String[] args) {
        Solution solution = new P11_ContainerWithMostWater().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int maxArea(int[] x) {

            int length = x.length;
            int result = 0;
            int next;
            int height;
            int width;
            int s;
            for (int i = 0; i < length; i++) {
                next = length - 1;
                while (i != next) {
                    height = Math.min(x[i], x[next]);
                    width = next - i;
                    s = height * width;
                    if (result < s) {
                        result = s;
                    }
                    if (x[i] > x[next]) {
                        next--;
                    } else {
                        i++;
                    }

                }

//                for (int j = i + 1; j < length; j++) {
//                    int right = x[j];
//                    int height = Math.min(left, right);
//                    int width = j - i;
//                    if (result < height * width) {
//                        result = height * width;
//                    }
//                }

            }

            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}