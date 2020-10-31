package initial.math;

import java.util.Arrays;

public class Test2 {

    public int countPrimes(int n) {
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        for (int i = 2; i * i < n; i++) {
            if (arr[i]){
                for (int j = i * i; j < n; j += i){
                    if (arr[j]){
                        arr[j] = false;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (arr[i]){
                count ++;
            }
        }
        return count;
    }

}
