package initial.string;


public class Test9 {

    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0){
            return "";
        }
        char[][] arr = new char[len][];
        int minlen = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++){
            arr[i] = strs[i].toCharArray();
            if (minlen > arr[i].length){
                minlen = arr[i].length;
            }
        }
        int i = 0;
        for (boolean flag = true; i < minlen && flag; i++){
            char c = arr[0][i];
            for (int j = 1; j < len; j++){
                if(arr[j][i] != c){
                    i --;
                    flag = false;
                    break;
                }
            }
        }

        return i == 0? "": strs[0].substring(0, i);
    }

    public static void main(String[] args) throws InterruptedException {
        String[] s = new String[]{};
        System.out.println(longestCommonPrefix(s));
    }
}
