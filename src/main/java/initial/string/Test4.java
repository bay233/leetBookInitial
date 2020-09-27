package initial.string;

public class Test4 {
    public static boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if (slen != tlen){
            return false;
        }

        int[] sarr = new int[26];
        int[] tarr = new int[26];
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        for(int i = 0; i < slen; i++){
            sarr[schars[i] % 'a']++;
        }
        for(int i = 0; i < tlen; i++){
            tarr[tchars[i] % 'a']++;
        }

        for (int i = 0; i < 26; i++){
            if(sarr[i] != tarr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rat", t = "car";
        boolean b = isAnagram(s, t);
        System.out.println(b);
    }
}
