package initial.other;

public class Test1 {

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count = 0;
        int a = 1;
        while(a != 0){
            if ((n & a) == a){
                count ++;
            }
            a = a << 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(-3));
        System.out.println(Integer.toBinaryString(1 << 2));
    }
}
