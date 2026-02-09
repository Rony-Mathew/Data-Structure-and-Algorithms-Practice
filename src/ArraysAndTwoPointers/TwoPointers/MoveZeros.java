package ArraysAndTwoPointers.TwoPointers;

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
