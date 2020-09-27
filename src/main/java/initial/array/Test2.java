package initial.array;

import java.util.Random;

public class Test2 {
    public static int[] sign ;

    public static int dfs(int[] prices, int len, int pos){
        if (len < 2){
            return 0;
        }
        int max = 0;
        if (len - 1 < pos){
            return sign[len - 1];
        }
        for (int i = len - 2; i >= 0; i--){
            int res = prices[len - 1] > prices[i] ?
                    (prices[len - 1] - prices[i]) +  dfs(prices, i, pos): dfs(prices, i+1, pos);

            max = res > max? res: max;
        }
        return max;
    }

    public static int maxProfit(int[] prices) {
        int len = prices.length;
        sign = new int[len];
        for (int i = 0; i < len ; i++){
            sign[i] = dfs(prices, i+1, i);
        }
        return dfs(prices, len , len - 1);
    }


    // 最佳解法
    public int $maxProfit(int[] prices) {
        int max = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                max += prices[i] - prices[i-1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        //int[] prices = new int[]{1,2,3,4,5};
        //int[] prices = new int[]{7,6,4,3,1};
        int[] test = new int[30000];
        Random rd = new Random();
        for (int i = 0,len = test.length; i < len; i++){
            test[i] = rd.nextInt(10000);
            //test[i] = 30000 - i;
        }
        long start = System.currentTimeMillis();
        int i = maxProfit(test);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(i);
    }
}
