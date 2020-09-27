package initial.array;

public class Test1 {

    public static int removeDuplicates(int[] nums) {
        int oldlen = nums.length;
        int count = 1;
        for (int i = oldlen - 1; i >0 ;i--){
            if (nums[i] == nums[i - 1]){
                int tmp = nums[i - 1];
                for (int j = i - 1; j < oldlen - 1; j++){
                    nums[j] = nums[j+1];
                }
                nums[oldlen - 1] = tmp;
            }else{
                count ++;
            }
        }
        return count;
    }

    // 最优解法
    public int $removeDuplicates(int[] nums) {
        int k = nums.length;
        if(nums.length <= 1) {
            return nums.length;
        }
        int i = 0;
        int j = 0;
        while(j < k) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int count = removeDuplicates(nums);
        for (int i = 0 ; i < count; i++){
            System.out.println(nums[i]);
        }
    }
}
