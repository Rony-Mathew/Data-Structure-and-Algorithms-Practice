package ArraysAndTwoPointers.TwoPointers;

//https://leetcode.com/problems/move-zeroes/description/
//
//        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//
//
//
//        Example 1:
//
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Example 2:
//
//        Input: nums = [0]
//        Output: [0]
//
//
//        Constraints:
//
//        1 <= nums.length <= 104
//        -231 <= nums[i] <= 231 - 1

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args){
        int[] result = moveZeroes(new int[]{0,1,0,3,12});
        System.out.println(Arrays.toString(result));
    }
    public static int[] moveZeroes(int[] nums) {
        int slow=0, fast=0;
        while(fast<nums.length){
            if(nums[fast]!=0){
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;
        }
        return nums;
    }
}
