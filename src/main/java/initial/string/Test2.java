package initial.string;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Test2 {
    public static int reverse(int x) {
        String str = x + "";
        String s;
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            s = "-" + reverseString(str.toCharArray());
        }else{
            s = reverseString(str.toCharArray());
        }
        long res = Long.parseLong(s);
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
            return 0;
        }else{
            return (int)res;
        }

    }

    public static String reverseString(char[] s) {
        int head = 0;
        int tail = s.length - 1;
        while(head < tail){
            char tmp = s[head];
            s[head] = s[tail];
            s[tail] = tmp;
            head ++;
            tail --;
        }
        return new String(s);
    }

    // 优秀解法
    public int $reverse(int x) {
        double n=0;
        while(x!=0){
            n=n*10+x%10;
            x=x/10;
        }
        return (int)n==n?(int)n:0;
    }

    public static void main(String[] args) {
        int reverse = reverse(123);
        System.out.println(reverse);
    }

}
