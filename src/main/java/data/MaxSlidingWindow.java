package data;

import java.util.LinkedList;

/**
 * @author bay
 * @date 2021/1/21
 */
public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> window = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; ++i){
            window.add(i);
            while (window.size() > 1
                    && nums[window.getLast()] >= nums[window.get(window.size()-2)]){
                window.remove(window.size()-2);
            }
            if (i >= k - 1){
                int pop = i - k + 1;
                res[pop] = nums[window.getFirst()];
                if (window.getFirst() == pop){
                    window.pollFirst();
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MaxSlidingWindow sw = new MaxSlidingWindow();
        for (int i : sw.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)) {
            System.out.print(i + " ");
        }
    }

}
