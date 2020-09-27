package initial.string;

public class Test8 {

    public static String countAndSay(int n) {
        if (n == 1){
            return "1";
        }
        String tmp = "1";
        for (int i = 2; i <= n; i++){
            tmp = count(tmp);
        }
        return tmp;
    }

    public static String count(String s) {
        char[] chars = s.toCharArray();

        char curr = chars[0];
        int num = 1;
        StringBuilder sb = new StringBuilder();
        if (chars.length == 1){
            return sb.append(num).append(curr).toString();
        }
        for (int i = 1, len = chars.length; i < len; i++) {
            if(curr == chars[i]){
                num ++;
            }else{
                sb.append(num).append(curr);
                curr = chars[i];
                num = 1;
            }
        }
        sb.append(num).append(curr);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "1211";
        System.out.println( count( s));
        System.out.println(countAndSay(4) );
    }
}
