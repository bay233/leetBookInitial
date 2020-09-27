package initial.array;

import java.util.HashMap;
import java.util.Map;

public class Test9 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ints = new int[2];
        for (int i = 0, len = nums.length; i < len; i++){
            int tmp = target - nums[i];
            if(map.getOrDefault(tmp,-1) == -1){
                map.put(nums[i], i);
            }else{
                ints[0] = map.get(tmp);
                ints[1] = i;
                break;
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] ints = twoSum(nums, 9);
        for(int i : ints){
            System.out.print(i + " ");
        }
    }
}
