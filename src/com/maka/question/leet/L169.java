package com.maka.question.leet;

/**
 * @author MakarovD
 * @date 2022/10/22 15:35
 * @description
 */
public class L169 {
    public static void main(String[] args) {
        int[] arr = {2,7,1,1,1,2,1};
        int i = new L169().majorityElement(arr);
        System.out.println("i = " + i);
    }

    //摩尔投票法
    public int majorityElement(int[] nums) {
        int stand = nums[0],count = 1;
        for (int i = 1; i<nums.length; i++) {
            if (nums[i]==stand){
                count++;
            }else {
                if (--count==0){
                    stand = nums[i];
                    count=1;
                }
            }
        }
        return stand;
    }

    //因为多数元素的数量大于一半（注意不包含正好一半），所以排序后多数元素一定在中间位置
    //public int majorityElement(int[] nums) {
    //    Arrays.sort(nums);
    //    System.out.println("nums = " + Arrays.toString(nums));
    //    return nums[nums.length >> 1];
    //}

    //HashMap方法
    //public int majorityElement(int[] nums) {
    //    if (nums.length==1){
    //        return nums[0];
    //    }
    //    HashMap<Integer, Integer> hashMap = new HashMap<>();
    //    int half = nums.length / 2;
    //    for (int num : nums) {
    //        if (hashMap.containsKey(num)){
    //            Integer integer = hashMap.get(num);
    //            integer = integer + 1;
    //            if (integer > half)
    //                return num;
    //            hashMap.put(num,integer);
    //        }else {
    //            hashMap.put(num,1);
    //        }
    //    }
    //    return -1;
    //}
}

//给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//
//
//
// 示例 1：
//
//
//输入：nums = [3,2,3]
//输出：3
//
// 示例 2：
//
//
//输入：nums = [2,2,1,1,1,2,2]
//输出：2
//
//
//
//提示：
//
//
// n == nums.length
// 1 <= n <= 5 * 10⁴
// -10⁹ <= nums[i] <= 10⁹
//
//
//
//
// 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
//
// Related Topics 数组 哈希表 分治 计数 排序 👍 1597 👎 0
