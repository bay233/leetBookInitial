package initial.array;

public class Test8 {


    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i >= 0; i --){
            if (nums[i] == 0){
                for(int j = i; j < len - 1;j ++){
                    nums[j] = nums[j + 1];
                }
                nums[len - 1] = 0;
            }
        }
    }


    // 优秀解法
    public static void $moveZeroes(int[] nums) {
        // 方法2 双指针 快慢指针
        int j = 0;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i]!=0 ){
                if(i != j){
                    // 在实际业务中是有必要做这段逻辑上的优化，在本题中没有必要
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
                j++ ;
            }
        }
        for(int i = j ; i < nums.length ;i++){
            nums[i] = 0;
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1};
        moveZeroes(nums);
        for(int i: nums){
            System.out.print(i + " ");
        }
    }
}
