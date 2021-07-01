package intermediate.ArrayAndString;

import java.util.*;

public class Test1 {
    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len < 3) {
            return res;
        }
        Arrays.sort(nums);
        int L = 0, i = 1, R = len - 1;
        Set<String> book = new HashSet<>();
        while (i < len - 1){
            while (L < i && i < R){
                if (nums[L] + nums[i] + nums[R] < 0){
                    L += 1;
                }else if (nums[L] + nums[i] + nums[R] > 0){
                    R -= 1;
                }else{
                    if (!book.contains(getHashcode(nums[L], nums[i], nums[R]))) {
                        res.add(Arrays.asList(nums[L], nums[i], nums[R]));
                        book.add(getHashcode(nums[L], nums[i], nums[R]));
                    }
                    L += 1;
                    R -= 1;
                }
            }
            i += 1;
            L = 0;
            R = len - 1;
        }
        return res;
    }

    public static String getHashcode(int ...args){
        StringBuilder res = new StringBuilder();
        for (int arg : args) {
            res.append(arg);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));

        System.out.println("" + -123);
    }
}
