package initial.string;

public class Test6 {

    public static int myAtoi(String str) {
        str = str.trim();
        if ("".equals(str)) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        int i = 0;
        if (chars[0] == '-') {
            i = 1;
            sb.append(chars[0]);
        }else if(chars[0] == '+'){
            i = 1;
        }

        for (int len = chars.length; i < len; i++) {
            if (chars[i] <= '9' && chars[i] >= '0') {
                sb.append(chars[i]);
            }else{
                break;
            }
        }
        String emp = sb.toString();
        if ("".equals(emp) || "-".equals(emp)) {
            return 0;
        }
        if (emp.replaceAll("^-?0+","").length() > 11){
            return emp.charAt(0) == '-'? Integer.MIN_VALUE: Integer.MAX_VALUE;
        }
        long res = Long.parseLong(emp);
        return res > Integer.MAX_VALUE? Integer.MAX_VALUE: res < Integer.MIN_VALUE? Integer.MIN_VALUE: (int) res;
    }

    public static void main(String[] args) {
        String str = "-+1";
        System.out.println(myAtoi(str));

    }
}
