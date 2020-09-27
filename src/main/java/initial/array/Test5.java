package initial.array;

import java.util.Arrays;

public class Test5 {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0, len = nums.length; i < len - 2; i+=2){
            if (nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }


    // 最佳解法
    public int $singleNumber(int[] nums) {
        int a=0;
        for(int n:nums){
            a^=n;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
        int i = singleNumber(nums);
        System.out.println(i);
        System.out.println(3 ^ 2);
    }
}
