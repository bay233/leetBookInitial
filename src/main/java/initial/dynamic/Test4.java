package initial.dynamic;

public class Test4 {

    public int rob(int[] nums) {
        int prev = 0;
        int curr = 0;

        for (int num : nums) {
            // curr 表示 dp[k-1]，prev 表示 dp[k-2]
            // dp[k] = max{ dp[k-1], dp[k-2] + i }
            int tmp = Math.max(curr, prev + num);
            prev = curr;
            curr = tmp;
        }

        return curr;
    }
}
