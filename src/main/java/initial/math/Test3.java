package initial.math;

public class Test3 {

    public static boolean isPowerOfThree(int n) {
        if (n == 1){
            return true;
        }
        if (n % 3 != 0 || n == 0){
            return false;
        }
        return isPowerOfThree(n / 3);
    }

    // 换底公式
    public static boolean $isPowerOfThree(int n) {
        double res = Math.log10(n) / Math.log10(3);
        return res - (int)res == 0? true: false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}
