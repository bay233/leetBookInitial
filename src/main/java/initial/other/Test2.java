package initial.other;

public class Test2 {
    public int hammingDistance(int x, int y) {
        int res = x ^ y;
        int a = 1;
        int count = 0;
        while(a != 0){
            if ((res & a) == a){
                count ++;
            }
            a = a << 1;
        }
        return count;
    }

}
