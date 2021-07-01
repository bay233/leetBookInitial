package data;

import java.util.Stack;

/**
 * @author bay
 * @date 2021/1/20
 */
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];

        for (int i = T.length - 1; i >= 0; --i) {
            int day = 1;
            while (!stack.empty() && T[stack.peek()] <= T[i]) {
                int index = stack.pop();
                day+=res[index];
            }
            res[i] = stack.empty() ? 0 : day;
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        DailyTemperatures d = new DailyTemperatures();
        for (int i : d.dailyTemperatures(new int[]{89,62,70,58,47,47,46,76,100,70})) {
            System.out.print(i + " ");
        }
    }
}
