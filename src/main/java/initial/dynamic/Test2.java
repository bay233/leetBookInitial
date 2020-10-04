package initial.dynamic;

public class Test2 {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        return dfs(prices, prices.length - 1);
    }

    public static int dfs(int[] prices, int end){
        if (end == 0){
            return 0;
        }
        int max = 0;
        for (int i = end - 1; i >= 0; i--){
            if (prices[end] - prices[i] > max) {
                max = prices[end] - prices[i];
            }
        }
        int res = dfs(prices, end - 1);
        return res > max? res: max;
    }

    // 没有使用枚举
    public int $maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i ++){
            // 一边遍历 一边获取最小值
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            // 用当前值减去最小值，如果比最大收益大，则替换最大收益值
            if((prices[i] - minPrice) > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
