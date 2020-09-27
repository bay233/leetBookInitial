package initial.string;

public class Test7 {

    public static int strStr(String haystack, String needle) {
        if (haystack.equals(needle)){
            return 0;
        }
        int neddlelen = needle.length();
        int limit = haystack.length() - neddlelen + 1;
        for (int i = 0; i < limit; i++){
            String emp = haystack.substring(i, i + neddlelen);
            if (emp.equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "pi";
        System.out.println(strStr(haystack, needle) );
    }
}
