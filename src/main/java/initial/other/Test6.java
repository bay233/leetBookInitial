package initial.other;

public class Test6 {

    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int num = (n+1) * n / 2;

        int realNum = 0;
        for (int i : nums) {
            realNum += i;
        }
        return num - realNum;
    }
}
