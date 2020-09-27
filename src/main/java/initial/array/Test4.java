package initial.array;

import java.util.HashMap;
import java.util.Map;

public class Test4 {

    public static boolean containsDuplicate(int[] nums) {
        Map map = new HashMap();
        for (int i : nums){
            if (map.getOrDefault(i, "0") == "0"){
                map.put(i, "1");
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
