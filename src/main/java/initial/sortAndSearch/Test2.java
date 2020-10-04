package initial.sortAndSearch;

public class Test2 {

    public static int value;

    public static int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        while(low<high){
            // low+(high - low)/2 = (2low + high - low)/2 = (low + high)/2
            // 解决数字大于int的问题
            int mid = low+(high-low)/2;
            if(isBadVersion(mid)){
                high = mid;
            }else{
                low =mid+1;
            }
        }
        return low;
    }


    public static boolean isBadVersion(int version){
        if (version >= value) return true;
        return false;
    }

    public static void main(String[] args) {
        value = 1702766719;
        int n = firstBadVersion(2126753390);
        System.out.println(n);
        System.out.println(2126753390 + 1);
    }
}
