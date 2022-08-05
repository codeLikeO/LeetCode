//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。 
//
// 算法的时间复杂度应该为 O(log (m+n)) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
// 
//
// Related Topics 数组 二分查找 分治 👍 5713 👎 0

package leetcode.editor.cn;

//Java：寻找两个正序数组的中位数
public class P04_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new P04_MedianOfTwoSortedArrays().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] res = new int[nums1.length + nums2.length];

            for (int i = 0; i < nums1.length; i++) {
                res[i] = nums1[i];
            }

            for (int j = 0; j < nums2.length; j++) {
                res[nums1.length + j] = nums2[j];
            }

            // 3  -2  -1
            for (int a = 0; a < res.length; a++) {
                int temp = res[a];
                for (int b = a + 1; b < res.length; b++) {
                    int next = res[b];
                    if (temp > next) {
                        res[b] = temp;
                        res[a] = next;
                        temp = res[a];
                    }
                }
            }

            if (res.length % 2 == 0) {
                return (((double) res[res.length / 2]) + ((double) res[(res.length / 2) - 1])) / 2;
            } else {
                return (double) res[res.length / 2];

            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
