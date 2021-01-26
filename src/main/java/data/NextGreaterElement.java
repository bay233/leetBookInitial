package data;

import java.util.*;

/**
 * @author bay
 * @date 2021/1/20
 */
public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; --i) {
            while (!stack.empty() && stack.peek() < nums2[i]) {
                stack.pop();
            }
            map.put(nums2[i], stack.empty() ? -1 : stack.peek());
            stack.push(nums2[i]);
        }

        int[] res = new int[nums1.length];
        for (int j = 0; j < nums1.length; ++j) {
            res[j] = map.get(nums1[j]);
        }
        return res;
    }

    // 循环数组
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];

        for (int j = 0; j < 2; ++j) {
            for (int i = nums.length - 1; i >= 0; --i) {
                while (!stack.empty() && stack.peek() <= nums[i]) {
                    stack.pop();
                }
                if (res[i] <= 0) {
                    res[i] = stack.empty() ? -1 : stack.peek();
                }
                stack.push(nums[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NextGreaterElement n = new NextGreaterElement();
        for (int i : n.nextGreaterElements(new int[]{1,2,1})) {
            System.out.print(i + " ");
        }
    }
}
