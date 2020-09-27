package initial.string;

public class Test5 {
    public static boolean isPalindrome(String s) {
        if ("".equals(s) || s == null) {
            return true;
        }
        int head = 0;
        int tail = s.length() - 1;
        char[] chars = s.toCharArray();
        while (head < tail) {
            while (head < tail && !isrange(chars[head])) {
                head++;
            }
            while (head < tail && !isrange(chars[tail])) {
                tail--;
            }
            if ('A' <= chars[head] && chars[head] <= 'z' && 'A' <= chars[tail] && chars[tail] <= 'z') {
                if (chars[head] == chars[tail] || chars[head] + 32 == chars[tail] || chars[head] - 32 == chars[tail]) {
                    head++;
                    tail--;
                }else{
                    return false;
                }

            }else{
                if (chars[head] == chars[tail]){
                    head++;
                    tail--;
                }else{
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isrange(char c) {
        if (('0' <= c && c <= '9') || ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "0P";
        //System.out.println(isPalindrome(s));
        System.out.println('0' + 32 == 'P');
    }
}
