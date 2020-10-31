package initial.other;

public class Test3 {

    public static int reverseBits(int n) {
        int res = 0;
        int a = 1;
        int b = 1 << 31;
        while(a != 0){
            if ((n & a) == a){
                res = res | b;
            }
            a = a << 1;
            if (b < 0){
                int tmp = b;
                b = (b >> 1) ^ tmp;
            } else {
                b = b >> 1;
            }

        }
        return res;
    }


    // 简洁易懂
    public int $reverseBits(int n) {
        int res = 0;
        for(int i = 31; i>= 0; i--){
            res += (n & 1) << i;
            n = n >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        int res = reverseBits(n);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(res));

    }
}
