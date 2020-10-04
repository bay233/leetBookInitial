package initial.dynamic;

public class Test1 {

    public static int climbStairs(int n) {
        int[] dirc = new int[n + 1];
        return dfs(n, dirc);
    }

    public static int dfs(int n, int[] dirc){
        if (n <= 1){
            return 1;
        }
        if (dirc[n] != 0){
            return dirc[n];
        }
        int i = dfs(n -1, dirc);
        int j = dfs(n -2, dirc);

        if (dirc[n] == 0){
            dirc[n] = i + j;
        }
        return dirc[n];
    }

    public static void main(String[] args) {
        int n = climbStairs(1);
        System.out.println(n);
    }
}
