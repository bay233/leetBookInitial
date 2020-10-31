package initial.project;

import java.util.Arrays;
import java.util.Random;

public class Solution {

    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] copyOf = Arrays.copyOf(nums, nums.length);
        Random random = new Random();
        for (int i = 0; i < copyOf.length; i++) {
            int r = random.nextInt(copyOf.length);
            int tmp = copyOf[i];
            copyOf[i] = copyOf[r];
            copyOf[r] = tmp;
        }
        return copyOf;
    }

}
