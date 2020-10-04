package initial.dynamic;

public class Test3 {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0){
                sum += num;
            }else{
                sum = num;
            }
            res = Integer.max(res, sum);
        }
        return res;
    }
}
