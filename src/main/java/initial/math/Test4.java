package initial.math;

import java.util.HashMap;
import java.util.Map;

public class Test4 {

    private static Map<Character, Integer> map = new HashMap<Character, Integer>(){
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };


    public static int romanToInt(String s) {
        if (s == null){
            return 0;
        }
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length){
                if (map.get(arr[i]) < map.get(arr[i + 1])){
                    sum -= map.get(arr[i]) ;
                    continue;
                }
            }
            sum += map.get(arr[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}
