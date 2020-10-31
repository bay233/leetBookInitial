package initial.math;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public List<String> fizzBuzz(int n) {
        if (n < 0){
            return null;
        }
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean b = i % 3 == 0;
            boolean d = i % 5 == 0;
            if (b && d) {
                list.add("FizzBuzz");
            }else if (b){
                list.add("Fizz");
            }else if (d){
                list.add("Buzz");
            }else{
                list.add(i + "");
            }
        }
        return list;
    }
}
