package initial.array;

public class Test3 {

    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        for (int i = 0;i < k; i++){
            int tmp = nums[len - 1];
            for(int j = len - 1; j > 0; j--){
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }

    }


    // 最优解法
    public void $rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        //int[] nums = new int[]{-1,-100,3,99};
        rotate(nums, 4);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
