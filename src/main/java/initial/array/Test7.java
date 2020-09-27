package initial.array;

public class Test7 {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int i = len - 1;
        while(i >= 0){
            int tmp = digits[i] + 1;
            if (tmp < 10){
                digits[i] = tmp;
                break;
            }else{
                digits[i] = 0;
                i--;
            }
        }
        if (i < 0){
            int[] res = new int[len+1];
            res[0] = 1;
            for (int k = 1, j = 0;j < len; k++, j++){
                res[k] = digits[j];
            }
            return res;
        }
        return digits;
    }


    public static void main(String[] args) {
        int[] digits = new int[]{9,9,9,9};
        int[] ints = plusOne(digits);
        for(int i : ints){
            System.out.print(i+" ");
        }
    }
}
